package com.developer.gavinejoyce.icubeofficial;

/**
 * Created by Gavine Joyce on 03/01/2017.
 */

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.Gravity; import android.view.LayoutInflater; import android.view.View; import android.view.ViewGroup; import android.widget.TextView; import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;

public class Secondtab extends Fragment {

    TextView e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;
    String Contact;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.techevents_tab, container, false);
        e1 = (TextView)rootView.findViewById(R.id.event1);
        e2 = (TextView)rootView.findViewById(R.id.event2);
        e3 = (TextView)rootView.findViewById(R.id.event3);
        e4 = (TextView)rootView.findViewById(R.id.event4);
        e5 = (TextView)rootView.findViewById(R.id.event5);
        e6 = (TextView)rootView.findViewById(R.id.event6);
        e7 = (TextView)rootView.findViewById(R.id.event7);
        e8 = (TextView)rootView.findViewById(R.id.event8);
        e9 = (TextView)rootView.findViewById(R.id.event9);
        e10 = (TextView)rootView.findViewById(R.id.event10);

        e1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String t = e1.getText().toString();
                Contact = "+917867019370";
                Alert(t,"The genquiz for warish brains and feverish nerves.",2,"2 per team",Contact,"Sai Vignesh","The classic, good,  old general quiz.");
            }
        });
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String t = e2.getText().toString();
                Contact = "+919952639561";
                Alert(t,"Crime never sleeps or Bring out the detective in you.",1,"3 per team",Contact,"Anirud","The crime scene investigation, fashioned like treasure hunt.");
            }
        });
        e3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String t = e3.getText().toString();
                Contact = "+919444218513";
                Alert(t,"Would you conquer your inner demons??",1,"Tournament Format.",Contact,"Satheesh","COD and DOTA challenge gaming.");
            }
        });
        e4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String t = e4.getText().toString();
                Contact = "+919524463075";
                Alert(t,"Unearth your Humor.",1,"Individual event",Contact,"Karthikeyan","The meme making mela.");
            }
        });
        e5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String t = e5.getText().toString();
                Contact = "+917708127562";
                Alert(t,"Let the brain bashers think zigzag.",3,"Individual event",Contact,"Kavya Reddy","All about puzzles, crosswords, sudokus and rubic cubes!");
            }
        });
        e6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String t = e6.getText().toString();
                Contact = "+919944435445";
                Alert(t,"Buckle up for the Tiny battle field.",4,"3 per team",Contact,"Sai Prathap","The mini militia championship.");

            }
        });
        e7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String t = e7.getText().toString();
                Contact = "+918754859959";
                Alert(t,"Discover the typing wizard in you!!",2,"Individual event",Contact,"Chandana","The maniacal typing event for insanely fast fingers.");
            }
        });
        e8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String t = e8.getText().toString();
                Contact = "+918122646981";
                Alert(t,"Explore to the infinity and beyond!!",1,"2 per team",Contact,"Kalyani Reddy","The title talent event.");
            }
        });
        e9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String t = e9.getText().toString();
                Contact = "+919789335176";
                Alert(t,"Fasten your seatbelts for the  most ravishing logo quiz ever!",2,"2 per team",Contact,"Sairam Aravind","Logos and Slogans quiz.");
            }
        });
        e10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String t = e10.getText().toString();
                Contact = "+919597932267";
                Alert(t,"Not all treasure's silver and gold, mate.",2,"Individual event",Contact,"Tina","Treasure hunt inside a computer.");
            }
        });
        return rootView;
    }

    public void Alert(final String title, String body, int rounds,String part,final  String contact,String org, String descrip)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(title);
        builder.setMessage(body + "\n\n"+"Description: "+descrip+"\n" + "No.of rounds: "+ rounds + "\n" +"No.of participants: "+part+"\n"+"Organizer: "+org+"\n"+"Contact: "+ contact);
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
                    else{

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