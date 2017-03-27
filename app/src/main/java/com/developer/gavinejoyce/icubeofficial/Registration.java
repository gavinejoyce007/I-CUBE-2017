package com.developer.gavinejoyce.icubeofficial;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Registration extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5;
    Button Register;

    String ename,nam,rnum,emailid,cnum;

    /*DatabaseReference myFireRoot = FirebaseDatabase.getInstance().getReference("https://i-cube-2017.firebaseio.com/");
    DatabaseReference eventnam = myFireRoot.child("EventName");
    DatabaseReference name = myFireRoot.child("Name");
    DatabaseReference registernum = myFireRoot.child("RegisterNo");
    DatabaseReference email = myFireRoot.child("Email");
    DatabaseReference Contact = myFireRoot.child("ContactNo");*/


    private Firebase myfirebase;
    private View view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        view = findViewById(android.R.id.content);
        ConnectivityManager connectivityManager = (ConnectivityManager)this.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        try {

            if (networkInfo.isConnected()) {
                //Toast.makeText(getContext(), "Network is connected", Toast.LENGTH_SHORT).show();
                Snackbar.make(view,"Network is Connected",Snackbar.LENGTH_SHORT).show();
            }
        }catch(Exception e){

            Snackbar.make(view,"Network is not Connected",Snackbar.LENGTH_LONG).show();
        }

        Firebase.setAndroidContext(this);

        myfirebase = new Firebase("https://gcontacts-5fe39.firebaseio.com/Registration");

        e1 = (EditText)findViewById(R.id.etext1);
        e2 = (EditText)findViewById(R.id.etext2);
        e3 = (EditText)findViewById(R.id.etext3);
        e4 = (EditText)findViewById(R.id.etext4);
        e5 = (EditText)findViewById(R.id.etext5);

        Bundle b2 = getIntent().getExtras();
        String et;
        if(b2!=null)
        {
            et = b2.getString("title");
            e1.setText(et);
            e1.setEnabled(false);
        }


        Register =(Button)findViewById(R.id.register);


        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ename = e1.getText().toString();
                nam = e2.getText().toString();
                rnum = e3.getText().toString();
                emailid = e4.getText().toString();
                cnum = e5.getText().toString();

               // Firebase eventnam = myfirebase.child("EventName");
               // Firebase name = myfirebase.child("PName");
               // Firebase registernum = myfirebase.child("RegisterNo");
               // Firebase email = myfirebase.child("Email");
               // Firebase Contact = myfirebase.child("ContactNo");

                if(!ename.equals("") && !nam.equals("") && !rnum.equals("") && !emailid.equals("") && !cnum.equals(""))
                {
                    myfirebase.push().setValue(ename+","+nam+","+rnum+","+emailid+","+cnum);
                    Toast.makeText(Registration.this, "Registered. Thank you :)", Toast.LENGTH_SHORT).show();
                    Intent in = new Intent(Registration.this,Event_tabs.class);
                    startActivity(in);
                }else{
                    Toast.makeText(Registration.this, "Fields are vacant...Couldn't Register", Toast.LENGTH_SHORT).show();
                }

                //eventnam.setValue(ename);
                //name.setValue(nam);
                //registernum.setValue(rnum);
                //email.setValue(emailid);
                //Contact.setValue(cnum);
            }
        });

    }

}
