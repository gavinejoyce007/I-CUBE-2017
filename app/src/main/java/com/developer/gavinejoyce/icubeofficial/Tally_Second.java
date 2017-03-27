package com.developer.gavinejoyce.icubeofficial;


import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by Gavine Joyce on 13/01/2017.
 */

public class Tally_Second extends Fragment {

    HorizontalScrollView tevent1,tevent2,tevent3,tevent4,tevent5,tevent6,tevent7,tevent8,tevent9,tevent10;

    TextView teve1c1rank,teve1c1nam,teve1c1pts,teve1c2rank,teve1c2nam,teve1c2pts,teve1c3rank,teve1c3nam,teve1c3pts,teve2c1rank,teve2c1nam,teve2c1pts,
            teve2c2rank,teve2c2nam,teve2c2pts,teve2c3rank,teve2c3nam,teve2c3pts,teve3c1rank,teve3c1nam,teve3c1pts,teve3c2rank,teve3c2nam,teve3c2pts,
            teve3c3rank,teve3c3nam,teve3c3pts,teve4c1rank,teve4c1nam,teve4c1pts,teve4c2rank,teve4c2nam,teve4c2pts,teve4c3rank,teve4c3nam,teve4c3pts,
            teve5c1rank,teve5c1nam,teve5c1pts,teve5c2rank,teve5c2nam,teve5c2pts,teve5c3rank,teve5c3nam,teve5c3pts,teve6c1rank,teve6c1nam,teve6c1pts,
            teve6c2rank,teve6c2nam,teve6c2pts,teve6c3rank,teve6c3nam,teve6c3pts,teve7c1rank,teve7c1nam,teve7c1pts,teve7c2rank,teve7c2nam,teve7c2pts,
            teve7c3rank,teve7c3nam,teve7c3pts,teve8c1rank,teve8c1nam,teve8c1pts,teve8c2rank,teve8c2nam,teve8c2pts,teve8c3rank,teve8c3nam,teve8c3pts,
            teve9c1rank,teve9c1nam,teve9c1pts,teve9c2rank,teve9c2nam,teve9c2pts,teve9c3rank,teve9c3nam,teve9c3pts,
            teve10c1rank,teve10c1nam,teve10c1pts,teve10c2rank,teve10c2nam,teve10c2pts,teve10c3rank,teve10c3nam,teve10c3pts;

    DatabaseReference myResultsRoot = FirebaseDatabase.getInstance().getReference("Results/Quizine");
    DatabaseReference qzc1name = myResultsRoot.child("qzc1name");
    DatabaseReference qzc1rank = myResultsRoot.child("qzc1rank");
    DatabaseReference qzc1points = myResultsRoot.child("qzc1pts");

    DatabaseReference qzc2name = myResultsRoot.child("qzc2name");
    DatabaseReference qzc2rank = myResultsRoot.child("qzc2rank");
    DatabaseReference qzc2points = myResultsRoot.child("qzc2pts");

    DatabaseReference qzc3name = myResultsRoot.child("qzc3name");
    DatabaseReference qzc3rank = myResultsRoot.child("qzc3rank");
    DatabaseReference qzc3points = myResultsRoot.child("qzc3pts");


    DatabaseReference myResultsRoot2 = FirebaseDatabase.getInstance().getReference("Results/Criminal Minds");
    DatabaseReference cmc1name = myResultsRoot2.child("cmc1name");
    DatabaseReference cmc1rank = myResultsRoot2.child("cmc1rank");
    DatabaseReference cmc1points = myResultsRoot2.child("cmc1pts");

    DatabaseReference cmc2name = myResultsRoot2.child("cmc2name");
    DatabaseReference cmc2rank = myResultsRoot2.child("cmc2rank");
    DatabaseReference cmc2points = myResultsRoot2.child("cmc2pts");

    DatabaseReference cmc3name = myResultsRoot2.child("cmc3name");
    DatabaseReference cmc3rank = myResultsRoot2.child("cmc3rank");
    DatabaseReference cmc3points = myResultsRoot2.child("cmc3pts");

    DatabaseReference myResultsRoot6 = FirebaseDatabase.getInstance().getReference("Results/Icefrog Doto");
    DatabaseReference ifc1name = myResultsRoot6.child("ifc1name");
    DatabaseReference ifc1rank = myResultsRoot6.child("ifc1rank");
    DatabaseReference ifc1points = myResultsRoot6.child("ifc1pts");

    DatabaseReference ifc2name = myResultsRoot6.child("ifc2name");
    DatabaseReference ifc2rank = myResultsRoot6.child("ifc2rank");
    DatabaseReference ifc2points = myResultsRoot6.child("ifc2pts");

    DatabaseReference ifc3name = myResultsRoot6.child("ifc3name");
    DatabaseReference ifc3rank = myResultsRoot6.child("ifc3rank");
    DatabaseReference ifc3points = myResultsRoot6.child("ifc3pts");


    DatabaseReference myResultsRoot3 = FirebaseDatabase.getInstance().getReference("Results/Game of Memes");
    DatabaseReference gmc1name = myResultsRoot3.child("gmc1name");
    DatabaseReference gmc1rank = myResultsRoot3.child("gmc1rank");
    DatabaseReference gmc1points = myResultsRoot3.child("gmc1pts");

    DatabaseReference gmc2name = myResultsRoot3.child("gmc2name");
    DatabaseReference gmc2rank = myResultsRoot3.child("gmc2rank");
    DatabaseReference gmc2points = myResultsRoot3.child("gmc2pts");

    DatabaseReference gmc3name = myResultsRoot3.child("gmc3name");
    DatabaseReference gmc3rank = myResultsRoot3.child("gmc3rank");
    DatabaseReference gmc3points = myResultsRoot3.child("gmc3pts");


    DatabaseReference myResultsRoot4 = FirebaseDatabase.getInstance().getReference("Results/Enigma");
    DatabaseReference egc1name = myResultsRoot4.child("egc1name");
    DatabaseReference egc1rank = myResultsRoot4.child("egc1rank");
    DatabaseReference egc1points = myResultsRoot4.child("egc1pts");

    DatabaseReference egc2name = myResultsRoot4.child("egc2name");
    DatabaseReference egc2rank = myResultsRoot4.child("egc2rank");
    DatabaseReference egc2points = myResultsRoot4.child("egc2pts");

    DatabaseReference egc3name = myResultsRoot4.child("egc3name");
    DatabaseReference egc3rank = myResultsRoot4.child("egc3rank");
    DatabaseReference egc3points = myResultsRoot4.child("egc3pts");


    DatabaseReference myResultsRoot5 = FirebaseDatabase.getInstance().getReference("Results/Mini Monsters");
    DatabaseReference mmc1name = myResultsRoot5.child("mmc1name");
    DatabaseReference mmc1rank = myResultsRoot5.child("mmc1rank");
    DatabaseReference mmc1points = myResultsRoot5.child("mmc1pts");

    DatabaseReference mmc2name = myResultsRoot5.child("mmc2name");
    DatabaseReference mmc2rank = myResultsRoot5.child("mmc2rank");
    DatabaseReference mmc2points = myResultsRoot5.child("mmc2pts");

    DatabaseReference mmc3name = myResultsRoot5.child("mmc3name");
    DatabaseReference mmc3rank = myResultsRoot5.child("mmc3rank");
    DatabaseReference mmc3points = myResultsRoot5.child("mmc3pts");



    DatabaseReference myResultsRoot7 = FirebaseDatabase.getInstance().getReference("Results/Typomania");
    DatabaseReference tyc1name = myResultsRoot7.child("tyc1name");
    DatabaseReference tyc1rank = myResultsRoot7.child("tyc1rank");
    DatabaseReference tyc1points = myResultsRoot7.child("tyc1pts");

    DatabaseReference tyc2name = myResultsRoot7.child("tyc2name");
    DatabaseReference tyc2rank = myResultsRoot7.child("tyc2rank");
    DatabaseReference tyc2points = myResultsRoot7.child("tyc2pts");

    DatabaseReference tyc3name = myResultsRoot7.child("tyc3name");
    DatabaseReference tyc3rank = myResultsRoot7.child("tyc3rank");
    DatabaseReference tyc3points = myResultsRoot7.child("tyc3pts");


    DatabaseReference myResultsRoot9 = FirebaseDatabase.getInstance().getReference("Results/Jack of all");
    DatabaseReference jac1name = myResultsRoot9.child("jac1name");
    DatabaseReference jac1rank = myResultsRoot9.child("jac1rank");
    DatabaseReference jac1points = myResultsRoot9.child("jac1pts");

    DatabaseReference jac2name = myResultsRoot9.child("jac2name");
    DatabaseReference jac2rank = myResultsRoot9.child("jac2rank");
    DatabaseReference jac2points = myResultsRoot9.child("jac2pts");

    DatabaseReference jac3name = myResultsRoot9.child("jac3name");
    DatabaseReference jac3rank = myResultsRoot9.child("jac3rank");
    DatabaseReference jac3points = myResultsRoot9.child("jac3pts");


    DatabaseReference myResultsRoot8 = FirebaseDatabase.getInstance().getReference("Results/Elclassico");
    DatabaseReference llc1name = myResultsRoot8.child("ecc1name");
    DatabaseReference llc1rank = myResultsRoot8.child("ecc1rank");
    DatabaseReference llc1points = myResultsRoot8.child("ecc1pts");

    DatabaseReference llc2name = myResultsRoot8.child("ecc2name");
    DatabaseReference llc2rank = myResultsRoot8.child("ecc2rank");
    DatabaseReference llc2points = myResultsRoot8.child("ecc2pts");

    DatabaseReference llc3name = myResultsRoot8.child("ecc3name");
    DatabaseReference llc3rank = myResultsRoot8.child("ecc3rank");
    DatabaseReference llc3points = myResultsRoot8.child("ecc3pts");

    DatabaseReference myResultsRoot10 = FirebaseDatabase.getInstance().getReference("Results/Da Vinci Code");
    DatabaseReference dvc1name = myResultsRoot10.child("dvc1name");
    DatabaseReference dvc1rank = myResultsRoot10.child("dvc1rank");
    DatabaseReference dvc1points = myResultsRoot10.child("dvc1pts");

    DatabaseReference dvc2name = myResultsRoot10.child("dvc2name");
    DatabaseReference dvc2rank = myResultsRoot10.child("dvc2rank");
    DatabaseReference dvc2points = myResultsRoot10.child("dvc2pts");

    DatabaseReference dvc3name = myResultsRoot10.child("dvc3name");
    DatabaseReference dvc3rank = myResultsRoot10.child("dvc3rank");
    DatabaseReference dvc3points = myResultsRoot10.child("dvc3pts");



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.content_tally2, container, false);

        ConnectivityManager connectivityManager = (ConnectivityManager)getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        try {

            if (networkInfo.isConnected()) {
                //Toast.makeText(getContext(), "Network is connected", Toast.LENGTH_SHORT).show();
                Snackbar.make(container,"Network is Connected",Snackbar.LENGTH_SHORT).show();
            }
        }catch(Exception e){

            Snackbar.make(container,"Network is not Connected",Snackbar.LENGTH_LONG).show();
        }


        tevent1 = (HorizontalScrollView)rootView.findViewById(R.id.layout1);
        tevent2 = (HorizontalScrollView)rootView.findViewById(R.id.layout2);
        tevent3 = (HorizontalScrollView)rootView.findViewById(R.id.layout3);
        tevent4 = (HorizontalScrollView)rootView.findViewById(R.id.layout4);
        tevent5 = (HorizontalScrollView)rootView.findViewById(R.id.layout5);
        tevent6 = (HorizontalScrollView)rootView.findViewById(R.id.layout6);
        tevent7 = (HorizontalScrollView)rootView.findViewById(R.id.layout7);
        tevent8 = (HorizontalScrollView)rootView.findViewById(R.id.layout8);
        tevent9 = (HorizontalScrollView)rootView.findViewById(R.id.layout9);
        tevent10 = (HorizontalScrollView)rootView.findViewById(R.id.layout10);


        tevent1.setHorizontalScrollBarEnabled(false);
        tevent2.setHorizontalScrollBarEnabled(false);
        tevent3.setHorizontalScrollBarEnabled(false);
        tevent4.setHorizontalScrollBarEnabled(false);
        tevent5.setHorizontalScrollBarEnabled(false);
        tevent6.setHorizontalScrollBarEnabled(false);
        tevent7.setHorizontalScrollBarEnabled(false);
        tevent8.setHorizontalScrollBarEnabled(false);
        tevent9.setHorizontalScrollBarEnabled(false);
        tevent10.setHorizontalScrollBarEnabled(false);


        teve1c1rank = (TextView)rootView.findViewById(R.id.tevent1rank);
        teve1c1nam = (TextView)rootView.findViewById(R.id.tevent1name);
        teve1c1pts = (TextView)rootView.findViewById(R.id.tevent1points);
        teve1c2rank = (TextView)rootView.findViewById(R.id.tevent1c2rank);
        teve1c2nam = (TextView)rootView.findViewById(R.id.tevent1c2name);
        teve1c2pts = (TextView)rootView.findViewById(R.id.tevent1c2points);
        teve1c3rank = (TextView)rootView.findViewById(R.id.tevent1c3rank);
        teve1c3nam = (TextView)rootView.findViewById(R.id.tevent1c3name);
        teve1c3pts = (TextView)rootView.findViewById(R.id.tevent1c3points);


        teve2c1rank = (TextView)rootView.findViewById(R.id.tevent2rank);
        teve2c1nam = (TextView)rootView.findViewById(R.id.tevent2name);
        teve2c1pts = (TextView)rootView.findViewById(R.id.tevent2points);
        teve2c2rank = (TextView)rootView.findViewById(R.id.tevent2c2rank);
        teve2c2nam = (TextView)rootView.findViewById(R.id.tevent2c2name);
        teve2c2pts = (TextView)rootView.findViewById(R.id.tevent2c2points);
        teve2c3rank = (TextView)rootView.findViewById(R.id.tevent2c3rank);
        teve2c3nam = (TextView)rootView.findViewById(R.id.tevent2c3name);
        teve2c3pts = (TextView)rootView.findViewById(R.id.tevent2c3points);


        teve3c1rank = (TextView)rootView.findViewById(R.id.tevent3rank);
        teve3c1nam = (TextView)rootView.findViewById(R.id.tevent3name);
        teve3c1pts = (TextView)rootView.findViewById(R.id.tevent3points);
        teve3c2rank = (TextView)rootView.findViewById(R.id.tevent3c2rank);
        teve3c2nam = (TextView)rootView.findViewById(R.id.tevent3c2name);
        teve3c2pts = (TextView)rootView.findViewById(R.id.tevent3c2points);
        teve3c3rank = (TextView)rootView.findViewById(R.id.tevent3c3rank);
        teve3c3nam = (TextView)rootView.findViewById(R.id.tevent3c3name);
        teve3c3pts = (TextView)rootView.findViewById(R.id.tevent3c3points);


        teve4c1rank = (TextView)rootView.findViewById(R.id.tevent4rank);
        teve4c1nam = (TextView)rootView.findViewById(R.id.tevent4name);
        teve4c1pts = (TextView)rootView.findViewById(R.id.tevent4points);
        teve4c2rank = (TextView)rootView.findViewById(R.id.tevent4c2rank);
        teve4c2nam = (TextView)rootView.findViewById(R.id.tevent4c2name);
        teve4c2pts = (TextView)rootView.findViewById(R.id.tevent4c2points);
        teve4c3rank = (TextView)rootView.findViewById(R.id.tevent4c3rank);
        teve4c3nam = (TextView)rootView.findViewById(R.id.tevent4c3name);
        teve4c3pts = (TextView)rootView.findViewById(R.id.tevent4c3points);

        teve5c1rank = (TextView)rootView.findViewById(R.id.tevent5rank);
        teve5c1nam = (TextView)rootView.findViewById(R.id.tevent5name);
        teve5c1pts = (TextView)rootView.findViewById(R.id.tevent5points);
        teve5c2rank = (TextView)rootView.findViewById(R.id.tevent5c2rank);
        teve5c2nam = (TextView)rootView.findViewById(R.id.tevent5c2name);
        teve5c2pts = (TextView)rootView.findViewById(R.id.tevent5c2points);
        teve5c3rank = (TextView)rootView.findViewById(R.id.tevent5c3rank);
        teve5c3nam = (TextView)rootView.findViewById(R.id.tevent5c3name);
        teve5c3pts = (TextView)rootView.findViewById(R.id.tevent5c3points);

        teve6c1rank = (TextView)rootView.findViewById(R.id.tevent6rank);
        teve6c1nam = (TextView)rootView.findViewById(R.id.tevent6name);
        teve6c1pts = (TextView)rootView.findViewById(R.id.tevent6points);
        teve6c2rank = (TextView)rootView.findViewById(R.id.tevent6c2rank);
        teve6c2nam = (TextView)rootView.findViewById(R.id.tevent6c2name);
        teve6c2pts = (TextView)rootView.findViewById(R.id.tevent6c2points);
        teve6c3rank = (TextView)rootView.findViewById(R.id.tevent6c3rank);
        teve6c3nam = (TextView)rootView.findViewById(R.id.tevent6c3name);
        teve6c3pts = (TextView)rootView.findViewById(R.id.tevent6c3points);

        teve7c1rank = (TextView)rootView.findViewById(R.id.tevent7rank);
        teve7c1nam = (TextView)rootView.findViewById(R.id.tevent7name);
        teve7c1pts = (TextView)rootView.findViewById(R.id.tevent7points);
        teve7c2rank = (TextView)rootView.findViewById(R.id.tevent7c2rank);
        teve7c2nam = (TextView)rootView.findViewById(R.id.tevent7c2name);
        teve7c2pts = (TextView)rootView.findViewById(R.id.tevent7c2points);
        teve7c3rank = (TextView)rootView.findViewById(R.id.tevent7c3rank);
        teve7c3nam = (TextView)rootView.findViewById(R.id.tevent7c3name);
        teve7c3pts = (TextView)rootView.findViewById(R.id.tevent7c3points);

        teve8c1rank = (TextView)rootView.findViewById(R.id.tevent8rank);
        teve8c1nam = (TextView)rootView.findViewById(R.id.tevent8name);
        teve8c1pts = (TextView)rootView.findViewById(R.id.tevent8points);
        teve8c2rank = (TextView)rootView.findViewById(R.id.tevent8c2rank);
        teve8c2nam = (TextView)rootView.findViewById(R.id.tevent8c2name);
        teve8c2pts = (TextView)rootView.findViewById(R.id.tevent8c2points);
        teve8c3rank = (TextView)rootView.findViewById(R.id.tevent8c3rank);
        teve8c3nam = (TextView)rootView.findViewById(R.id.tevent8c3name);
        teve8c3pts = (TextView)rootView.findViewById(R.id.tevent8c3points);

        teve9c1rank = (TextView)rootView.findViewById(R.id.tevent9rank);
        teve9c1nam = (TextView)rootView.findViewById(R.id.tevent9name);
        teve9c1pts = (TextView)rootView.findViewById(R.id.tevent9points);
        teve9c2rank = (TextView)rootView.findViewById(R.id.tevent9c2rank);
        teve9c2nam = (TextView)rootView.findViewById(R.id.tevent9c2name);
        teve9c2pts = (TextView)rootView.findViewById(R.id.tevent9c2points);
        teve9c3rank = (TextView)rootView.findViewById(R.id.tevent9c3rank);
        teve9c3nam = (TextView)rootView.findViewById(R.id.tevent9c3name);
        teve9c3pts = (TextView)rootView.findViewById(R.id.tevent9c3points);


        teve10c1rank = (TextView)rootView.findViewById(R.id.tevent10rank);
        teve10c1nam = (TextView)rootView.findViewById(R.id.tevent10name);
        teve10c1pts = (TextView)rootView.findViewById(R.id.tevent10points);
        teve10c2rank = (TextView)rootView.findViewById(R.id.tevent10c2rank);
        teve10c2nam = (TextView)rootView.findViewById(R.id.tevent10c2name);
        teve10c2pts = (TextView)rootView.findViewById(R.id.tevent10c2points);
        teve10c3rank = (TextView)rootView.findViewById(R.id.tevent10c3rank);
        teve10c3nam = (TextView)rootView.findViewById(R.id.tevent10c3name);
        teve10c3pts = (TextView)rootView.findViewById(R.id.tevent10c3points);

        return rootView;
    }


    @Override
    public void onStart() {
        super.onStart();

        qzc1name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name))
                {
                    teve1c1nam.setText(R.string.lnresult);
                }else{
                    teve1c1nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        qzc1rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve1c1rank.setText(R.string.lnresult);
                }else{
                    teve1c1rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        qzc1points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve1c1pts.setText(R.string.lnresult);
                }else{
                    teve1c1pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        qzc2name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name))
                {
                    teve1c2nam.setText(R.string.lnresult);
                }else{
                    teve1c2nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        qzc2rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve1c2rank.setText(R.string.lnresult);
                }else{
                    teve1c2rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        qzc2points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve1c2pts.setText(R.string.lnresult);
                }else{
                    teve1c2pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        qzc3name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name))
                {
                    teve1c3nam.setText(R.string.lnresult);
                }else{
                    teve1c3nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        qzc3rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve1c3rank.setText(R.string.lnresult);
                }else{
                    teve1c3rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        qzc3points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve1c3pts.setText(R.string.lnresult);
                }else{
                    teve1c3pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        cmc1name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve2c1nam.setText(R.string.lnresult);
                }else{
                    teve2c1nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        cmc1rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve2c1rank.setText(R.string.lnresult);
                }else{
                    teve2c1rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        cmc1points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve2c1pts.setText(R.string.lnresult);
                }else{
                    teve2c1pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        cmc2name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve2c2nam.setText(R.string.lnresult);
                }else{
                    teve2c2nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        cmc2rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve2c2rank.setText(R.string.lnresult);
                }else{
                    teve2c2rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        cmc2points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve2c2pts.setText(R.string.lnresult);
                }else{
                    teve2c2pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        cmc3name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve2c3nam.setText(R.string.lnresult);
                }else{
                    teve2c3nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        cmc3rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve2c3rank.setText(R.string.lnresult);
                }else{
                    teve2c3rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        cmc3points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve2c3pts.setText(R.string.lnresult);
                }else{
                    teve2c3pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ifc1name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve3c1nam.setText(R.string.lnresult);
                }else{
                    teve3c1nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ifc1rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve3c1rank.setText(R.string.lnresult);
                }else{
                    teve3c1rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ifc1points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve3c1pts.setText(R.string.lnresult);
                }else{
                    teve3c1pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ifc2name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve3c2nam.setText(R.string.lnresult);
                }else{
                    teve3c2nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ifc2rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve3c2rank.setText(R.string.lnresult);
                }else{
                    teve3c2rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ifc2points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve3c2pts.setText(R.string.lnresult);
                }else{
                    teve3c2pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ifc3name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve3c3nam.setText(R.string.lnresult);
                }else{
                    teve3c3nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ifc3rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve3c3rank.setText(R.string.lnresult);
                }else{
                    teve3c3rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ifc3points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve3c3pts.setText(R.string.lnresult);
                }else{
                    teve3c3pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mmc1name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve6c1nam.setText(R.string.lnresult);
                }else{
                    teve6c1nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mmc1rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve6c1rank.setText(R.string.lnresult);
                }else{
                    teve6c1rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mmc1points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve6c1pts.setText(R.string.lnresult);
                }else{
                    teve6c1pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mmc2name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve6c2nam.setText(R.string.lnresult);
                }else{
                    teve6c2nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mmc2rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve6c2rank.setText(R.string.lnresult);
                }else{
                    teve6c2rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mmc2points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve6c2pts.setText(R.string.lnresult);
                }else{
                    teve6c2pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mmc3name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve6c3nam.setText(R.string.lnresult);
                }else{
                    teve6c3nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mmc3rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve6c3rank.setText(R.string.lnresult);
                }else{
                    teve6c3rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mmc3points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve6c3pts.setText(R.string.lnresult);
                }else{
                    teve6c3pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        gmc1name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve4c1nam.setText(R.string.lnresult);
                }else{
                    teve4c1nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        gmc1rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve4c1rank.setText(R.string.lnresult);
                }else{
                    teve4c1rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        gmc1points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve4c1pts.setText(R.string.lnresult);
                }else{
                    teve4c1pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        gmc2name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve4c2nam.setText(R.string.lnresult);
                }else{
                    teve4c2nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        gmc2rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve4c2rank.setText(R.string.lnresult);
                }else{
                    teve4c2rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        gmc2points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve4c2pts.setText(R.string.lnresult);
                }else{
                    teve4c2pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        gmc3name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve4c3nam.setText(R.string.lnresult);
                }else{
                    teve4c3nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        gmc3rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve4c3rank.setText(R.string.lnresult);
                }else{
                    teve4c3rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        gmc3points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve4c3pts.setText(R.string.lnresult);
                }else{
                    teve4c3pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        egc1name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve5c1nam.setText(R.string.lnresult);
                }else{
                    teve5c1nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        egc1rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve5c1rank.setText(R.string.lnresult);
                }else{
                    teve5c1rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        egc1points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve5c1pts.setText(R.string.lnresult);
                }else{
                    teve5c1pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        egc2name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve5c2nam.setText(R.string.lnresult);
                }else{
                    teve5c2nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        egc2rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve5c2rank.setText(R.string.lnresult);
                }else{
                    teve5c2rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        egc2points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve5c2pts.setText(R.string.lnresult);
                }else{
                    teve5c2pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        egc3name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve5c3nam.setText(R.string.lnresult);
                }else{
                    teve5c3nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        egc3rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve5c3rank.setText(R.string.lnresult);
                }else{
                    teve5c3rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        egc3points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve5c3pts.setText(R.string.lnresult);
                }else{
                    teve5c3pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        tyc1name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve7c1nam.setText(R.string.lnresult);
                }else{
                    teve7c1nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        tyc1rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve7c1rank.setText(R.string.lnresult);
                }else{
                    teve7c1rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        tyc1points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve7c1pts.setText(R.string.lnresult);
                }else{
                    teve7c1pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        tyc2name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve7c2nam.setText(R.string.lnresult);
                }else{
                    teve7c2nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        tyc2rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve7c2rank.setText(R.string.lnresult);
                }else{
                    teve7c2rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        tyc2points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve7c2pts.setText(R.string.lnresult);
                }else{
                    teve7c2pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        tyc3name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve7c3nam.setText(R.string.lnresult);
                }else{
                    teve7c3nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        tyc3rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve7c3rank.setText(R.string.lnresult);
                }else{
                    teve7c3rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        tyc3points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve7c3pts.setText(R.string.lnresult);
                }else{
                    teve7c3pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        jac1name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve8c1nam.setText(R.string.lnresult);
                }else{
                    teve8c1nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        jac1rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve8c1rank.setText(R.string.lnresult);
                }else{
                    teve8c1rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        jac1points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve8c1pts.setText(R.string.lnresult);
                }else{
                    teve8c1pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        jac2name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve8c2nam.setText(R.string.lnresult);
                }else{
                    teve8c2nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        jac2rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve8c2rank.setText(R.string.lnresult);
                }else{
                    teve8c2rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        jac2points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve8c2pts.setText(R.string.lnresult);
                }else{
                    teve8c2pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        jac3name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve8c3nam.setText(R.string.lnresult);
                }else{
                    teve8c3nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        jac3rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve8c3rank.setText(R.string.lnresult);
                }else{
                    teve8c3rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        jac3points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve8c3pts.setText(R.string.lnresult);
                }else{
                    teve8c3pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        llc1name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve9c1nam.setText(R.string.lnresult);
                }else{
                    teve9c1nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        llc1rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve9c1rank.setText(R.string.lnresult);
                }else{
                    teve9c1rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        llc1points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve9c1pts.setText(R.string.lnresult);
                }else{
                    teve9c1pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        llc2name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve9c2nam.setText(R.string.lnresult);
                }else{
                    teve9c2nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        llc2rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve9c2rank.setText(R.string.lnresult);
                }else{
                    teve9c2rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        llc2points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve9c2pts.setText(R.string.lnresult);
                }else{
                    teve9c2pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        llc3name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve9c3nam.setText(R.string.lnresult);
                }else{
                    teve9c3nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        llc3rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve9c3rank.setText(R.string.lnresult);
                }else{
                    teve9c3rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        llc3points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve9c3pts.setText(R.string.lnresult);
                }else{
                    teve9c3pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        dvc1name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve10c1nam.setText(R.string.lnresult);
                }else{
                    teve10c1nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        dvc1rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve10c1rank.setText(R.string.lnresult);
                }else{
                    teve10c1rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        dvc1points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve10c1pts.setText(R.string.lnresult);
                }else{
                    teve10c1pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        dvc2name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve10c2nam.setText(R.string.lnresult);
                }else{
                    teve10c2nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        dvc2rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve10c2rank.setText(R.string.lnresult);
                }else{
                    teve10c2rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        dvc2points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve10c2pts.setText(R.string.lnresult);
                }else{
                    teve10c2pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        dvc3name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(name)){
                    teve10c3nam.setText(R.string.lnresult);
                }else{
                    teve10c3nam.setText(name);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        dvc3rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(rank)){
                    teve10c3rank.setText(R.string.lnresult);
                }else{
                    teve10c3rank.setText(rank);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        dvc3points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(pts)){
                    teve10c3pts.setText(R.string.lnresult);
                }else{
                    teve10c3pts.setText(pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}
