package com.developer.gavinejoyce.icubeofficial;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignIn extends AppCompatActivity {

    private Button login;
    private EditText logema;
    private EditText logpass;
    private TextView signin;

    private FirebaseAuth firebaseAuth;

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        login = (Button)findViewById(R.id.logloginbtn);
        logema = (EditText)findViewById(R.id.logauthemail);
        logpass = (EditText)findViewById(R.id.logauthpasswd);
        signin = (TextView)findViewById(R.id.logtextSignin);

        progressDialog = new ProgressDialog(this);

        firebaseAuth = FirebaseAuth.getInstance();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    userLogin();
            }
        });

    }

    private void userLogin()
    {
        String email = logema.getText().toString();
        String passwd = logpass.getText().toString();

        if(TextUtils.isEmpty(email)){
            Toast.makeText(getApplicationContext(),"Please enter Email ID",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(passwd)){
            Toast.makeText(getApplicationContext(),"Please enter Password",Toast.LENGTH_SHORT).show();
            return;
        }

        progressDialog.setMessage("Logging in the User...");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(email,passwd)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful()){
                            progressDialog.cancel();
                            startActivity(new Intent(SignIn.this, MainActivity.class));
                            Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_SHORT).show();
                        }
                        else{
                            progressDialog.cancel();
                            Toast.makeText(getApplicationContext(),"Couldn't Login...",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
}