package com.example.busfirstdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {
    Animation rightanim,leftanim;
    TextView uppertext,lowertext;
    private TextView forgotpass,register;
    ImageView admin;
    private EditText email,password;
    private FirebaseAuth auth;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
        rightanim= AnimationUtils.loadAnimation(this,R.anim.right_to_left_anim);
        leftanim=AnimationUtils.loadAnimation(this,R.anim.left_to_right);

        uppertext=findViewById(R.id.uppertext);
        lowertext=findViewById(R.id.lowrtext);
        admin=findViewById(R.id.admin);
        uppertext.setAnimation(rightanim);
        lowertext.setAnimation(leftanim);
        admin.setAnimation(leftanim);
        forgotpass=findViewById(R.id.forgotpass);
        register=findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login.this,Registration.class);
                startActivity(intent);
            }
        });

        auth=FirebaseAuth.getInstance();
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        login=findViewById(R.id.loginbtn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailtxt=email.getText().toString().trim();
                String pass=password.getText().toString().trim();
                auth.signInWithEmailAndPassword(emailtxt,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            FirebaseUser user=FirebaseAuth.getInstance().getCurrentUser();
                            if(user.isEmailVerified()){
                                Toast.makeText(Login.this, "Log In Successful", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(Login.this, Welcome.class);
                                intent.putExtra("email",emailtxt);
                                startActivity(intent);
                            }
                            else{
                                Toast.makeText(Login.this, "Please Verify your email", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(Login.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login.this, Admin.class);
                startActivity(intent);
            }
        });

    }
}