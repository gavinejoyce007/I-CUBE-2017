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
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by Gavine Joyce on 07/01/2017.
 */

public class Leader_First extends Fragment {

    TextView teve1title,teve1c1name,teve1c1points,teve1c1rank,teve1c2name,teve1c2points,teve1c2rank, teve1c3rank,teve1c3name,teve1c3points,
            teve1c4name,teve1c4points,teve1c4rank,teve1c5name,teve1c5points,teve1c5rank,teve1c6name,teve1c6points,teve1c6rank;


    TextView teve2title,teve2c1name, teve2c1points,teve2c1rank,teve2c2name, teve2c2points,teve2c2rank,teve2c3name, teve2c3points,teve2c3rank,
            teve2c4name, teve2c4points,teve2c4rank,teve2c5name, teve2c5points,teve2c5rank,teve2c6name, teve2c6points,teve2c6rank;

    //DatabaseReference myFireRoot = FirebaseDatabase.getInstance().getReference();



    DatabaseReference QZroot = FirebaseDatabase.getInstance().getReference("Quizine");
    DatabaseReference qZtitle = QZroot.child("Title1");
    DatabaseReference qZc1rank = QZroot.child("QZc1rank");
    DatabaseReference qZc1name = QZroot.child("QZc1name");
    DatabaseReference qZc1points = QZroot.child("QZc1pts");

    DatabaseReference qZc2rank = QZroot.child("QZc2rank");
    DatabaseReference qZc2name = QZroot.child("QZc2name");
    DatabaseReference qZc2points = QZroot.child("QZc2pts");

    DatabaseReference qZc3rank = QZroot.child("QZc3rank");
    DatabaseReference qZc3name = QZroot.child("QZc3name");
    DatabaseReference qZc3points = QZroot.child("QZc3pts");

    DatabaseReference qZc4rank = QZroot.child("QZc4rank");
    DatabaseReference qZc4name = QZroot.child("QZc4name");
    DatabaseReference qZc4points = QZroot.child("QZc4pts");

    DatabaseReference qZc5rank = QZroot.child("QZc5rank");
    DatabaseReference qZc5name = QZroot.child("QZc5name");
    DatabaseReference qZc5points = QZroot.child("QZc5pts");

    DatabaseReference qZc6rank = QZroot.child("QZc6rank");
    DatabaseReference qZc6name = QZroot.child("QZc6name");
    DatabaseReference qZc6points = QZroot.child("QZc6pts");


    DatabaseReference ELroot = FirebaseDatabase.getInstance().getReference("ElQuiz");
    DatabaseReference ELtitle = ELroot.child("Title2");
    DatabaseReference ELc1rank = ELroot.child("ELc1rank");
    DatabaseReference ELc1name = ELroot.child("ELc1name");
    DatabaseReference ELc1points = ELroot.child("ELc1pts");

    DatabaseReference ELc2rank = ELroot.child("ELc2rank");
    DatabaseReference ELc2name = ELroot.child("ELc2name");
    DatabaseReference ELc2points = ELroot.child("ELc2pts");

    DatabaseReference ELc3rank = ELroot.child("ELc3rank");
    DatabaseReference ELc3name = ELroot.child("ELc3name");
    DatabaseReference ELc3points = ELroot.child("ELc3pts");

    DatabaseReference ELc4rank = ELroot.child("ELc4rank");
    DatabaseReference ELc4name = ELroot.child("ELc4name");
    DatabaseReference ELc4points = ELroot.child("ELc4pts");

    DatabaseReference ELc5rank = ELroot.child("ELc5rank");
    DatabaseReference ELc5name = ELroot.child("ELc5name");
    DatabaseReference ELc5points = ELroot.child("ELc5pts");

    DatabaseReference ELc6rank = ELroot.child("ELc6rank");
    DatabaseReference ELc6name = ELroot.child("ELc6name");
    DatabaseReference ELc6points = ELroot.child("ELc6pts");


    HorizontalScrollView tevent1,tevent2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.first_leaderboard_tabs, container, false);

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

        teve1title = (TextView)rootView.findViewById(R.id.techevent1);
        teve2title = (TextView)rootView.findViewById(R.id.techevent2);

        tevent1 = (HorizontalScrollView)rootView.findViewById(R.id.layout1);
        tevent2 = (HorizontalScrollView)rootView.findViewById(R.id.layout2);

        teve1c1name = (TextView)rootView.findViewById(R.id.tevent1name);
        teve1c1points = (TextView)rootView.findViewById(R.id.tevent1points);
        teve1c1rank = (TextView)rootView.findViewById(R.id.tevent1rank);
        teve1c2name = (TextView)rootView.findViewById(R.id.tevent1c2name);
        teve1c2points = (TextView)rootView.findViewById(R.id.tevent1c2points);
        teve1c2rank = (TextView)rootView.findViewById(R.id.tevent1c2rank);
        teve1c3name = (TextView)rootView.findViewById(R.id.tevent1c3name);
        teve1c3points = (TextView)rootView.findViewById(R.id.tevent1c3points);
        teve1c3rank = (TextView)rootView.findViewById(R.id.tevent1c3rank);

        teve1c4name = (TextView)rootView.findViewById(R.id.tevent1c4name);
        teve1c4points = (TextView)rootView.findViewById(R.id.tevent1c4points);
        teve1c4rank = (TextView)rootView.findViewById(R.id.tevent1c4rank);
        teve1c5name = (TextView)rootView.findViewById(R.id.tevent1c5name);
        teve1c5points = (TextView)rootView.findViewById(R.id.tevent1c5points);
        teve1c5rank = (TextView)rootView.findViewById(R.id.tevent1c5rank);
        teve1c6name = (TextView)rootView.findViewById(R.id.tevent1c6name);
        teve1c6points = (TextView)rootView.findViewById(R.id.tevent1c6points);
        teve1c6rank = (TextView)rootView.findViewById(R.id.tevent1c6rank);



        teve2c1name = (TextView)rootView.findViewById(R.id.tevent2name);
        teve2c1points = (TextView)rootView.findViewById(R.id.tevent2points);
        teve2c1rank = (TextView)rootView.findViewById(R.id.tevent2rank);
        teve2c2name = (TextView)rootView.findViewById(R.id.tevent2c2name);
        teve2c2points = (TextView)rootView.findViewById(R.id.tevent2c2points);
        teve2c2rank = (TextView)rootView.findViewById(R.id.tevent2c2rank);
        teve2c3name = (TextView)rootView.findViewById(R.id.tevent2c3name);
        teve2c3points = (TextView)rootView.findViewById(R.id.tevent2c3points);
        teve2c3rank = (TextView)rootView.findViewById(R.id.tevent2c3rank);

        teve2c4name = (TextView)rootView.findViewById(R.id.tevent2c4name);
        teve2c4points = (TextView)rootView.findViewById(R.id.tevent2c4points);
        teve2c4rank = (TextView)rootView.findViewById(R.id.tevent2c4rank);
        teve2c5name = (TextView)rootView.findViewById(R.id.tevent2c5name);
        teve2c5points = (TextView)rootView.findViewById(R.id.tevent2c5points);
        teve2c5rank = (TextView)rootView.findViewById(R.id.tevent2c5rank);
        teve2c6name = (TextView)rootView.findViewById(R.id.tevent2c6name);
        teve2c6points = (TextView)rootView.findViewById(R.id.tevent2c6points);
        teve2c6rank = (TextView)rootView.findViewById(R.id.tevent2c6rank);


        tevent1.setHorizontalScrollBarEnabled(false);
        tevent2.setHorizontalScrollBarEnabled(false);

        return rootView;
    }



    @Override
    public void onStart() {
        super.onStart();

        qZtitle.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMtitle = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMtitle)){
                    teve1title.setText(R.string.fevent1);
                }
                else{
                    teve1title.setText(aMtitle);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        ELtitle.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMtitle = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMtitle)){
                    teve2title.setText(R.string.fevent9);
                }
                else{
                    teve2title.setText(aMtitle);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        qZc1name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String aMc1name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1name))
                {
                    teve1c1name.setText(R.string.lnresult);
                }
                else{
                    teve1c1name.setText(aMc1name);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        qZc1points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1pts))
                {
                    teve1c1points.setText(R.string.lnresult);
                }
                else{
                    teve1c1points.setText(aMc1pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        qZc1rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1rank))
                {
                    teve1c1rank.setText(R.string.lnresult);
                }
                else{
                    teve1c1rank.setText(aMc1rank);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        qZc2name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String aMc1name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1name))
                {
                    teve1c2name.setText(R.string.lnresult);
                }
                else{
                    teve1c2name.setText(aMc1name);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        qZc2points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1pts))
                {
                    teve1c2points.setText(R.string.lnresult);
                }
                else{
                    teve1c2points.setText(aMc1pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        qZc2rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1rank))
                {
                    teve1c2rank.setText(R.string.lnresult);
                }
                else{
                    teve1c2rank.setText(aMc1rank);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        qZc3name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String aMc1name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1name))
                {
                    teve1c3name.setText(R.string.lnresult);
                }
                else{
                    teve1c3name.setText(aMc1name);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        qZc3points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1pts))
                {
                    teve1c3points.setText(R.string.lnresult);
                }
                else{
                    teve1c3points.setText(aMc1pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        qZc3rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1rank))
                {
                    teve1c3rank.setText(R.string.lnresult);
                }
                else{
                    teve1c3rank.setText(aMc1rank);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



        qZc4name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String aMc1name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1name))
                {
                    teve1c4name.setText(R.string.lnresult);
                }
                else{
                    teve1c4name.setText(aMc1name);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        qZc4points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1pts))
                {
                    teve1c4points.setText(R.string.lnresult);
                }
                else{
                    teve1c4points.setText(aMc1pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        qZc4rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1rank))
                {
                    teve1c4rank.setText(R.string.lnresult);
                }
                else{
                    teve1c4rank.setText(aMc1rank);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        qZc5name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String aMc1name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1name))
                {
                    teve1c5name.setText(R.string.lnresult);
                }
                else{
                    teve1c5name.setText(aMc1name);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        qZc5points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1pts))
                {
                    teve1c5points.setText(R.string.lnresult);
                }
                else{
                    teve1c5points.setText(aMc1pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        qZc5rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1rank))
                {
                    teve1c5rank.setText(R.string.lnresult);
                }
                else{
                    teve1c5rank.setText(aMc1rank);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        qZc6name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String aMc1name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1name))
                {
                    teve1c6name.setText(R.string.lnresult);
                }
                else{
                    teve1c6name.setText(aMc1name);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        qZc6points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1pts))
                {
                    teve1c6points.setText(R.string.lnresult);
                }
                else{
                    teve1c6points.setText(aMc1pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        qZc6rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1rank))
                {
                    teve1c6rank.setText(R.string.lnresult);
                }
                else{
                    teve1c6rank.setText(aMc1rank);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });






        ELc1name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String aMc1name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1name))
                {
                    teve2c1name.setText(R.string.lnresult);
                }
                else{
                    teve2c1name.setText(aMc1name);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ELc1points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1pts))
                {
                    teve2c1points.setText(R.string.lnresult);
                }
                else{
                    teve2c1points.setText(aMc1pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ELc1rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1rank))
                {
                    teve2c1rank.setText(R.string.lnresult);
                }
                else{
                    teve2c1rank.setText(aMc1rank);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ELc2name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String aMc1name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1name))
                {
                    teve2c2name.setText(R.string.lnresult);
                }
                else{
                    teve2c2name.setText(aMc1name);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ELc2points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1pts))
                {
                    teve2c2points.setText(R.string.lnresult);
                }
                else{
                    teve2c2points.setText(aMc1pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ELc2rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1rank))
                {
                    teve2c2rank.setText(R.string.lnresult);
                }
                else{
                    teve2c2rank.setText(aMc1rank);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        ELc3name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String aMc1name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1name))
                {
                    teve2c3name.setText(R.string.lnresult);
                }
                else{
                    teve2c3name.setText(aMc1name);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ELc3points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1pts))
                {
                    teve2c3points.setText(R.string.lnresult);
                }
                else{
                    teve2c3points.setText(aMc1pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ELc3rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1rank))
                {
                    teve2c3rank.setText(R.string.lnresult);
                }
                else{
                    teve2c3rank.setText(aMc1rank);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



        ELc4name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String aMc1name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1name))
                {
                    teve2c4name.setText(R.string.lnresult);
                }
                else{
                    teve2c4name.setText(aMc1name);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ELc4points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1pts))
                {
                    teve2c4points.setText(R.string.lnresult);
                }
                else{
                    teve2c4points.setText(aMc1pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ELc4rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1rank))
                {
                    teve2c4rank.setText(R.string.lnresult);
                }
                else{
                    teve2c4rank.setText(aMc1rank);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        ELc5name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String aMc1name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1name))
                {
                    teve2c5name.setText(R.string.lnresult);
                }
                else{
                    teve2c5name.setText(aMc1name);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ELc5points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1pts))
                {
                    teve2c5points.setText(R.string.lnresult);
                }
                else{
                    teve2c5points.setText(aMc1pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ELc5rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1rank))
                {
                    teve2c5rank.setText(R.string.lnresult);
                }
                else{
                    teve2c5rank.setText(aMc1rank);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        ELc6name.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String aMc1name = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1name))
                {
                    teve2c6name.setText(R.string.lnresult);
                }
                else{
                    teve2c6name.setText(aMc1name);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ELc6points.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1pts = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1pts))
                {
                    teve2c6points.setText(R.string.lnresult);
                }
                else{
                    teve2c6points.setText(aMc1pts);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        ELc6rank.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String aMc1rank = dataSnapshot.getValue(String.class);
                if(TextUtils.isEmpty(aMc1rank))
                {
                    teve2c6rank.setText(R.string.lnresult);
                }
                else{
                    teve2c6rank.setText(aMc1rank);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
