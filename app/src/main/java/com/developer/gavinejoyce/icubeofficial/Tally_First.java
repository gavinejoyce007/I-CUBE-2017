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

public class Tally_First extends Fragment {

    HorizontalScrollView tevent1,tevent2,tevent3,tevent4,tevent5,tevent6,tevent7,tevent8,tevent9,tevent10;

    TextView teve1c1rank,teve1c1nam,teve1c1pts,teve1c2rank,teve1c2nam,teve1c2pts,teve1c3rank,teve1c3nam,teve1c3pts,teve2c1rank,teve2c1nam,teve2c1pts,
            teve2c2rank,teve2c2nam,teve2c2pts,teve2c3rank,teve2c3nam,teve2c3pts,teve3c1rank,teve3c1nam,teve3c1pts,teve3c2rank,teve3c2nam,teve3c2pts,
            teve3c3rank,teve3c3nam,teve3c3pts,teve4c1rank,teve4c1nam,teve4c1pts,teve4c2rank,teve4c2nam,teve4c2pts,teve4c3rank,teve4c3nam,teve4c3pts,
            teve5c1rank,teve5c1nam,teve5c1pts,teve5c2rank,teve5c2nam,teve5c2pts,teve5c3rank,teve5c3nam,teve5c3pts,teve6c1rank,teve6c1nam,teve6c1pts,
            teve6c2rank,teve6c2nam,teve6c2pts,teve6c3rank,teve6c3nam,teve6c3pts,teve7c1rank,teve7c1nam,teve7c1pts,teve7c2rank,teve7c2nam,teve7c2pts,
            teve7c3rank,teve7c3nam,teve7c3pts,teve8c1rank,teve8c1nam,teve8c1pts,teve8c2rank,teve8c2nam,teve8c2pts,teve8c3rank,teve8c3nam,teve8c3pts,
            teve9c1rank,teve9c1nam,teve9c1pts,teve9c2rank,teve9c2nam,teve9c2pts,teve9c3rank,teve9c3nam,teve9c3pts,teve10c1rank,teve10c1nam,teve10c1pts,
            teve10c2rank,teve10c2nam,teve10c2pts,teve10c3rank,teve10c3nam,teve10c3pts;

    DatabaseReference myResultsRoot = FirebaseDatabase.getInstance().getReference("Results/App Feste");
    DatabaseReference afc1name = myResultsRoot.child("afc1name");
    DatabaseReference afc1rank = myResultsRoot.child("afc1rank");
    DatabaseReference afc1points = myResultsRoot.child("afc1pts");

    DatabaseReference afc2name = myResultsRoot.child("afc2name");
    DatabaseReference afc2rank = myResultsRoot.child("afc2rank");
    DatabaseReference afc2points = myResultsRoot.child("afc2pts");

    DatabaseReference afc3name = myResultsRoot.child("afc3name");
    DatabaseReference afc3rank = myResultsRoot.child("afc3rank");
    DatabaseReference afc3points = myResultsRoot.child("afc3pts");


    DatabaseReference myResultsRoot2 = FirebaseDatabase.getInstance().getReference("Results/Brain Bogglers");
    DatabaseReference bbc1name = myResultsRoot2.child("bbc1name");
    DatabaseReference bbc1rank = myResultsRoot2.child("bbc1rank");
    DatabaseReference bbc1points = myResultsRoot2.child("bbc1pts");

    DatabaseReference bbc2name = myResultsRoot2.child("bbc2name");
    DatabaseReference bbc2rank = myResultsRoot2.child("bbc2rank");
    DatabaseReference bbc2points = myResultsRoot2.child("bbc2pts");

    DatabaseReference bbc3name = myResultsRoot2.child("bbc3name");
    DatabaseReference bbc3rank = myResultsRoot2.child("bbc3rank");
    DatabaseReference bbc3points = myResultsRoot2.child("bbc3pts");

    DatabaseReference myResultsRoot6 = FirebaseDatabase.getInstance().getReference("Results/import java");
    DatabaseReference cjc1name = myResultsRoot6.child("cjc1name");
    DatabaseReference cjc1rank = myResultsRoot6.child("cjc1rank");
    DatabaseReference cjc1points = myResultsRoot6.child("cjc1pts");

    DatabaseReference cjc2name = myResultsRoot6.child("cjc2name");
    DatabaseReference cjc2rank = myResultsRoot6.child("cjc2rank");
    DatabaseReference cjc2points = myResultsRoot6.child("cjc2pts");

    DatabaseReference cjc3name = myResultsRoot6.child("cjc3name");
    DatabaseReference cjc3rank = myResultsRoot6.child("cjc3rank");
    DatabaseReference cjc3points = myResultsRoot6.child("cjc3pts");


    DatabaseReference myResultsRoot3 = FirebaseDatabase.getInstance().getReference("Results/Code tussle");
    DatabaseReference cdc1name = myResultsRoot3.child("cdc1name");
    DatabaseReference cdc1rank = myResultsRoot3.child("cdc1rank");
    DatabaseReference cdc1points = myResultsRoot3.child("cdc1pts");

    DatabaseReference cdc2name = myResultsRoot3.child("cdc2name");
    DatabaseReference cdc2rank = myResultsRoot3.child("cdc2rank");
    DatabaseReference cdc2points = myResultsRoot3.child("cdc2pts");

    DatabaseReference cdc3name = myResultsRoot3.child("cdc3name");
    DatabaseReference cdc3rank = myResultsRoot3.child("cdc3rank");
    DatabaseReference cdc3points = myResultsRoot3.child("cdc3pts");


    DatabaseReference myResultsRoot4 = FirebaseDatabase.getInstance().getReference("Results/Web Wizards");
    DatabaseReference wwc1name = myResultsRoot4.child("wwc1name");
    DatabaseReference wwc1rank = myResultsRoot4.child("wwc1rank");
    DatabaseReference wwc1points = myResultsRoot4.child("wwc1pts");

    DatabaseReference wwc2name = myResultsRoot4.child("wwc2name");
    DatabaseReference wwc2rank = myResultsRoot4.child("wwc2rank");
    DatabaseReference wwc2points = myResultsRoot4.child("wwc2pts");

    DatabaseReference wwc3name = myResultsRoot4.child("wwc3name");
    DatabaseReference wwc3rank = myResultsRoot4.child("wwc3rank");
    DatabaseReference wwc3points = myResultsRoot4.child("wwc3pts");


    DatabaseReference myResultsRoot5 = FirebaseDatabase.getInstance().getReference("Results/Mend your minds");
    DatabaseReference cocc1name = myResultsRoot5.child("cocc1name");
    DatabaseReference cocc1rank = myResultsRoot5.child("cocc1rank");
    DatabaseReference cocc1points = myResultsRoot5.child("cocc1pts");

    DatabaseReference cocc2name = myResultsRoot5.child("cocc2name");
    DatabaseReference cocc2rank = myResultsRoot5.child("cocc2rank");
    DatabaseReference cocc2points = myResultsRoot5.child("cocc2pts");

    DatabaseReference cocc3name = myResultsRoot5.child("cocc3name");
    DatabaseReference cocc3rank = myResultsRoot5.child("cocc3rank");
    DatabaseReference cocc3points = myResultsRoot5.child("cocc3pts");




    DatabaseReference myResultsRoot7 = FirebaseDatabase.getInstance().getReference("Results/Elclassico");
    DatabaseReference ecc1name = myResultsRoot7.child("ecc1name");
    DatabaseReference ecc1rank = myResultsRoot7.child("ecc1rank");
    DatabaseReference ecc1points = myResultsRoot7.child("ecc1pts");

    DatabaseReference ecc2name = myResultsRoot7.child("ecc2name");
    DatabaseReference ecc2rank = myResultsRoot7.child("ecc2rank");
    DatabaseReference ecc2points = myResultsRoot7.child("ecc2pts");

    DatabaseReference ecc3name = myResultsRoot7.child("ecc3name");
    DatabaseReference ecc3rank = myResultsRoot7.child("ecc3rank");
    DatabaseReference ecc3points = myResultsRoot7.child("ecc3pts");

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.content_tally__board, container, false);

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


        tevent1.setHorizontalScrollBarEnabled(false);
        tevent2.setHorizontalScrollBarEnabled(false);
        tevent3.setHorizontalScrollBarEnabled(false);
        tevent4.setHorizontalScrollBarEnabled(false);
        tevent5.setHorizontalScrollBarEnabled(false);
        tevent6.setHorizontalScrollBarEnabled(false);





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

       /* teve7c1rank = (TextView)rootView.findViewById(R.id.tevent7rank);
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
        teve10c3pts = (TextView)rootView.findViewById(R.id.tevent10c3points);*/

        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();

        afc1name.addValueEventListener(new ValueEventListener() {
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

        afc1rank.addValueEventListener(new ValueEventListener() {
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

        afc1points.addValueEventListener(new ValueEventListener() {
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


        afc2name.addValueEventListener(new ValueEventListener() {
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

        afc2rank.addValueEventListener(new ValueEventListener() {
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

        afc2points.addValueEventListener(new ValueEventListener() {
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

        afc3name.addValueEventListener(new ValueEventListener() {
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

        afc3rank.addValueEventListener(new ValueEventListener() {
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

        afc3points.addValueEventListener(new ValueEventListener() {
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

        bbc1name.addValueEventListener(new ValueEventListener() {
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

        bbc1rank.addValueEventListener(new ValueEventListener() {
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

        bbc1points.addValueEventListener(new ValueEventListener() {
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

        bbc2name.addValueEventListener(new ValueEventListener() {
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

        bbc2rank.addValueEventListener(new ValueEventListener() {
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

        bbc2points.addValueEventListener(new ValueEventListener() {
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

        bbc3name.addValueEventListener(new ValueEventListener() {
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

        bbc3rank.addValueEventListener(new ValueEventListener() {
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

        bbc3points.addValueEventListener(new ValueEventListener() {
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

        cjc1name.addValueEventListener(new ValueEventListener() {
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

        cjc1rank.addValueEventListener(new ValueEventListener() {
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

        cjc1points.addValueEventListener(new ValueEventListener() {
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

        cjc2name.addValueEventListener(new ValueEventListener() {
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

        cjc2rank.addValueEventListener(new ValueEventListener() {
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

        cjc2points.addValueEventListener(new ValueEventListener() {
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

        cjc3name.addValueEventListener(new ValueEventListener() {
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

        cjc3rank.addValueEventListener(new ValueEventListener() {
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

        cjc3points.addValueEventListener(new ValueEventListener() {
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

        cocc1name.addValueEventListener(new ValueEventListener() {
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

        cocc1rank.addValueEventListener(new ValueEventListener() {
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

        cocc1points.addValueEventListener(new ValueEventListener() {
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

        cocc2name.addValueEventListener(new ValueEventListener() {
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

        cocc2rank.addValueEventListener(new ValueEventListener() {
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

        cocc2points.addValueEventListener(new ValueEventListener() {
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

        cocc3name.addValueEventListener(new ValueEventListener() {
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

        cocc3rank.addValueEventListener(new ValueEventListener() {
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

        cocc3points.addValueEventListener(new ValueEventListener() {
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


        cdc1name.addValueEventListener(new ValueEventListener() {
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

        cdc1rank.addValueEventListener(new ValueEventListener() {
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

        cdc1points.addValueEventListener(new ValueEventListener() {
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

        cdc2name.addValueEventListener(new ValueEventListener() {
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

        cdc2rank.addValueEventListener(new ValueEventListener() {
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

        cdc2points.addValueEventListener(new ValueEventListener() {
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

        cdc3name.addValueEventListener(new ValueEventListener() {
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

        cdc3rank.addValueEventListener(new ValueEventListener() {
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

        cdc3points.addValueEventListener(new ValueEventListener() {
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


        wwc1name.addValueEventListener(new ValueEventListener() {
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

        wwc1rank.addValueEventListener(new ValueEventListener() {
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

        wwc1points.addValueEventListener(new ValueEventListener() {
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

        wwc2name.addValueEventListener(new ValueEventListener() {
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

        wwc2rank.addValueEventListener(new ValueEventListener() {
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

        wwc2points.addValueEventListener(new ValueEventListener() {
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

        wwc3name.addValueEventListener(new ValueEventListener() {
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

        wwc3rank.addValueEventListener(new ValueEventListener() {
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

        wwc3points.addValueEventListener(new ValueEventListener() {
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


        /*ecc1name.addValueEventListener(new ValueEventListener() {
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

        ecc1rank.addValueEventListener(new ValueEventListener() {
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

        ecc1points.addValueEventListener(new ValueEventListener() {
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

        ecc2name.addValueEventListener(new ValueEventListener() {
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

        ecc2rank.addValueEventListener(new ValueEventListener() {
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

        ecc2points.addValueEventListener(new ValueEventListener() {
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

        ecc3name.addValueEventListener(new ValueEventListener() {
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

        ecc3rank.addValueEventListener(new ValueEventListener() {
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

        ecc3points.addValueEventListener(new ValueEventListener() {
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
        });*/

    }
}
