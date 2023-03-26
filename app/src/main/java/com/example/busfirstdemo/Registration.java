package com.example.busfirstdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Patterns;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.regex.Pattern;

public class Registration extends AppCompatActivity {

    Animation rightanim,leftanim;
    TextView uppertext,lowertext;
    private TextView login;
    private EditText name,email,password;
    private FirebaseAuth auth;
    private Button register;
    DatabaseReference databaseReference;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_registration);

        rightanim= AnimationUtils.loadAnimation(this,R.anim.right_to_left_anim);
        leftanim=AnimationUtils.loadAnimation(this,R.anim.left_to_right);

        uppertext=findViewById(R.id.uppertext);
        lowertext=findViewById(R.id.lowrtext);

        uppertext.setAnimation(rightanim);
        lowertext.setAnimation(leftanim);
        login=findViewById(R.id.login);

        databaseReference= FirebaseDatabase.getInstance().getReference().child("Users");

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        auth=FirebaseAuth.getInstance();
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        register=findViewById(R.id.registerbtn);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nametxt=name.getText().toString().trim();
                String emailtxt=email.getText().toString().trim();
                String pass=password.getText().toString().trim();
                UserRegi userRegi=new UserRegi();
                userRegi.setName(nametxt);
                userRegi.setEmail(emailtxt);
                String newmail=emailtxt.replace(".",",");
                if(!nametxt.isEmpty() && !emailtxt.isEmpty() && pass.length()>=6) {
                    if(Patterns.EMAIL_ADDRESS.matcher(emailtxt).matches()) {
                        auth.createUserWithEmailAndPassword(emailtxt, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                                    user.sendEmailVerification();
                                    databaseReference.child(newmail).child("Profile").setValue(userRegi);
                                    Toast.makeText(Registration.this, "Check Your Email To Verify", Toast.LENGTH_LONG).show();
                                    finish();
                            }

                        });
                    }
                    else{
                        Toast.makeText(Registration.this, "Enter a valid Email", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(Registration.this, "Fill All the Blanks", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}