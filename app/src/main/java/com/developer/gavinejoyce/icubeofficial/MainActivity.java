package com.developer.gavinejoyce.icubeofficial;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.developer.gavinejoyce.icubeofficial.firebase.MyfirebaseMessagingService;
import com.firebase.client.Firebase;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    //private Button signin;
    //GoogleApiClient mGoogleApiClient;
    private static final int RC_SIGN_IN = 9001;
    private static final String TAG = "GoogleActivity";
    private FirebaseAuth mAuth;
    public RadioGroup radiogroup;
    private RadioButton radioBut;
    private EditText feed;
    //DatabaseReference feed = FirebaseDatabase.getInstance().getReference("Feedback");
    private Firebase firebase;
    private String currentItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Firebase.setAndroidContext(this);


        firebase = new Firebase("https://gcontacts-5fe39.firebaseio.com/Feedback");

        radiogroup = (RadioGroup) findViewById(R.id.rgroup);
        feed = (EditText) findViewById(R.id.feedbacktext);

       /* signin = (Button) findViewById(R.id.signin);
        GoogleSignInOptions userOpt = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .enableAutoManage(this, this //ConnectionFailListener)
                .addApi(Auth.GOOGLE_SIGN_IN_API, userOpt)
                .build();

        signin.setOnClickListener(this);
        mAuth = FirebaseAuth.getInstance();*/

        //note = (Button)findViewById(R.id.notify);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    /*private void SignIn()
    {
        Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
        startActivityForResult(signInIntent,RC_SIGN_IN);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == RC_SIGN_IN)
        {
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            handleSignInResult(result);
        }
    }

    private void handleSignInResult(GoogleSignInResult result)
    {
        if(result.isSuccess()){
            GoogleSignInAccount account = result.getSignInAccount();
            String accName = account.getEmail();
            String accPass = account.getId();
            mAuth.createUserWithEmailAndPassword(accName,accPass);
        }else{

        }
    }*/


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Exit");
            builder.setMessage("Are you sure?");
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(Intent.ACTION_MAIN);
                    intent.addCategory(Intent.CATEGORY_HOME);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            });
            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            builder.show();

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(MainActivity.this, About.class));
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        int id = item.getItemId();

        if (id == R.id.nav_home) {
            startActivity(getIntent());

        } else if (id == R.id.nav_events) {
            startActivity(new Intent(MainActivity.this, Event_tabs.class));

        } else if (id == R.id.nav_leaderboard) {
            startActivity(new Intent(MainActivity.this, Leaderboard_tabs.class));
        } else if (id == R.id.nav_contact) {

            alertContact();
        } else if (id == R.id.nav_about) {
            startActivity(new Intent(MainActivity.this, About.class));

        } else if (id == R.id.nav_feedback) {
            alertFeedback();

        } /*else if (id == R.id.nav_share) {
            Intent share = new Intent(Intent.ACTION_VIEW);
            startActivity(share);

        }*/ else if (id == R.id.nav_tally) {
            startActivity(new Intent(MainActivity.this, Tally_Bally.class));

        }/*else if (id == R.id.nav_send) {
            Intent send = new Intent(Intent.ACTION_SEND_MULTIPLE);
            send.setType("text/html");
            send.putExtra(android.content.Intent.EXTRA_TEXT, Html.fromHtml("<p>Android App featuring Live Updates which gives you updates about the GRAND TECH FEST ICUBE-2017." +
                    ".</p>"));
            startActivity(Intent.createChooser(send,"Share using"));
        }*/ else if (id == R.id.nav_schedule) {
            startActivity(new Intent(MainActivity.this, Schedule.class));
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
            }
        }, 100);
        return true;
    }

    /*@Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }*/

    /*@Override
    public void onClick(View v) {

        SignIn();;
    }*/
    public void alertContact() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Contact");
        builder.setMessage("EMail ID: " + "icube2k17@gmail.com\n" + "Mobile: " + "+91 90431 59512");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
            }
        });

        builder.show();
    }

    public void alertFeedback() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        String[] a = new String[]{"Poor", "Satisfactory", "Good", "Excellent"};


        //final boolean[] state = new boolean[]{false,false,false,false,false};
        final List<String> flist = Arrays.asList(a);
        // LayoutInflater li = LayoutInflater.from(this);
        // View Edit = li.inflate(R.layout.feed,null);
        //builder.setView(R.layout.feed);

        builder.setSingleChoiceItems(a, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                currentItem = flist.get(which);

                //Toast.makeText(getApplicationContext(),""+currentItem,Toast.LENGTH_SHORT).show();

            }
        });
        builder.setPositiveButton("SEND", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                try {
                    if (currentItem.equals("")) {
                        Toast.makeText(MainActivity.this, "Select a feedback item.", Toast.LENGTH_SHORT).show();
                    } else {
                        firebase.push().setValue(currentItem);
                        Toast.makeText(MainActivity.this, "Thank You :)", Toast.LENGTH_SHORT).show();
                        //builder.setCancelable(true);
                    }
                } catch (NullPointerException e) {
                    Toast.makeText(getApplicationContext(), "Select an rating and Try again :)", Toast.LENGTH_SHORT).show();
                }
            }
        });
        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.setCancelable(false);
        builder.setTitle("Feedback");

        builder.show();
    }
}
