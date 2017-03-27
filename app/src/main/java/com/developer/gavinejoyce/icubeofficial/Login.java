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

public class Login extends AppCompatActivity {

    private Button Register;
    private EditText authema;
    private EditText authpass;
    private TextView signup;

    private FirebaseAuth firebaseAuth;

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        firebaseAuth = FirebaseAuth.getInstance();

        progressDialog = new ProgressDialog(this);

        Register = (Button)findViewById(R.id.loginbtn);
        authema = (EditText)findViewById(R.id.authemail);
        authpass = (EditText)findViewById(R.id.authpasswd);
        signup = (TextView)findViewById(R.id.textSignin);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    startActivity(new Intent(Login.this,SignIn.class));
            }
        });

    }
    private  void registerUser()
    {
        String email = authema.getText().toString();
        String passwd = authpass.getText().toString();

        if(TextUtils.isEmpty(email)){

            Toast.makeText(getApplicationContext(),"Please enter Email ID",Toast.LENGTH_SHORT).show();
            return;
        }
        if(TextUtils.isEmpty(passwd)){

            Toast.makeText(getApplicationContext(),"Please enter Password",Toast.LENGTH_SHORT).show();
            return;
        }

        progressDialog.setMessage("Registering User...");
        progressDialog.show();

        firebaseAuth.createUserWithEmailAndPassword(email,passwd)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if(task.isSuccessful())
                        {
                            Toast.makeText(getApplicationContext(),"Registered Successfully...",Toast.LENGTH_SHORT).show();
                            progressDialog.cancel();
                            startActivity(new Intent(Login.this,MainActivity.class));
                        }
                        else{
                            Toast.makeText(getApplicationContext(),"Couldnt Register, Try Again...",Toast.LENGTH_SHORT).show();
                            progressDialog.cancel();
                        }
                    }
                });

    }

}
