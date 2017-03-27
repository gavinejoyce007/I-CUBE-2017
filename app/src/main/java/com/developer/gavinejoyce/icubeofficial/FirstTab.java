package com.developer.gavinejoyce.icubeofficial;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Gavine Joyce on 03/01/2017.
 */

public class FirstTab extends Fragment {
    TextView e1,e2,e3,e4,e5,e6,e7,e8,e9;
    String Contact;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.funevents_tab, container, false);
        e1 = (TextView)rootView.findViewById(R.id.event3);
        e2 = (TextView)rootView.findViewById(R.id.event4);
        e3 = (TextView)rootView.findViewById(R.id.event5);
        e4 = (TextView)rootView.findViewById(R.id.event6);
        e5 = (TextView)rootView.findViewById(R.id.event7);
        e6 = (TextView)rootView.findViewById(R.id.event8);

        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String t = e1.getText().toString();
                    Contact = "+918760718600";
                    Alert(t,"An Access to Pioneers.",2,"Indvidual event",Contact,"Gavine Joyce","Android App development.");
            }
        });
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t = e2.getText().toString();
                Contact = "+919551665327";
                Alert(t,"Ready to beat the brains out to reach your infinite \" CApaCity\".",3,"Individual event",Contact,"Anusuya.R","The aptitude test event.");
            }
        });
        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String t = e3.getText().toString();
                Contact = "+918939634396";
                Alert(t,"In code, we believe.",2,"2 per team",Contact,"Sanath","Java coding event.");
            }
        });
        e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String t = e4.getText().toString();
                Contact = "+918754610979";
                Alert(t,"It all begins with the # tag.",3,"2 per team",Contact,"Giritharan.S","General Coding to test your expertise on C, C++.");
            }
        });
        e5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String t = e5.getText().toString();
                Contact = "+918883337155";
                Alert(t,"Bored of looking at the same web page each time? Let your creativity widen across the horizon.",2,"2 per team",Contact,"Nivethitha","The website development competition.");
            }
        });
        e6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String t = e6.getText().toString();
                Contact = "+919444776280";
                Alert(t,"Let your mind write the paper not your hand.",1,"2 per team",Contact,"Shiva Prakash","Technical paper presentation event.");
            }
        });
        return rootView;
    }

    public void Alert(final String title, String body, int rounds,String part,final  String contact,String org,String descrip)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(title);
        builder.setMessage(body + "\n\n" +"Description: "+descrip+"\n"+ "No.of rounds: "+ rounds + "\n" +"No.of participants: "+part+"\n"+"Organizer: "+org+"\n"+"Contact: "+ contact);
        builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        builder.setNeutralButton("CALL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


                if (ActivityCompat.checkSelfPermission(getContext(),
                        android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        requestPermissions(new String[]{android.Manifest.permission.CALL_PHONE}, 9999);

                        /*Intent cdata = new Intent();
                        cdata.putExtra("Contact",contact);
                        onActivityResult(9999,100,cdata);*/
                        //startActivityForResult(cdata,9999);
                    }

                }
                try {
                    Uri num = Uri.parse("tel:" + Contact);
                    Intent call = new Intent(Intent.ACTION_CALL, num);
                    startActivity(call);
                }catch(SecurityException e)
                {
                    Log.e("Call","Permission Denial");
                }

            }
        });
        builder.setPositiveButton("REGISTER", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                    Bundle b1 = new Bundle();
                b1.putString("title",title);
                Intent in = new Intent(getContext(),Registration.class);
                in.putExtras(b1);
                startActivity(in);
            }
        });
        builder.show();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(grantResults[0]== PackageManager.PERMISSION_GRANTED){

            Uri num = Uri.parse("tel:" + Contact);
            Intent call = new Intent(Intent.ACTION_CALL, num);
            startActivity(call);
            Toast.makeText(getContext(), "Permission granted :)", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getContext(),"Permission denied :(",Toast.LENGTH_SHORT).show();
        }
    }

}
