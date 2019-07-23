package com.example.vaigau;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends Fragment {

    Button button;
    EditText email,password,phone;
    TextView textsignin;
    FirebaseAuth mFirebaseAuth = FirebaseAuth.getInstance();

    private SignUp() {

    }

    public static SignUp getInstance() {
        return new SignUp();
    }

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_sign_up, container, false);
        email = view.findViewById(R.id.name);
        password = view.findViewById(R.id.etpass);
        phone = view.findViewById(R.id.phone);
        textsignin = view.findViewById(R.id.textsign);
        button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailid = email.getText().toString();
                String passwords = password.getText().toString();
                String number = phone.getText().toString();
                if(emailid.isEmpty()){
                    email.setError("Please enter email");
                    email.requestFocus();
                }
                else if(passwords.isEmpty()){
                    password.setError("Please enter password");
                    password.requestFocus();
                }
                else if(emailid.isEmpty() && passwords.isEmpty()){
                    Toast.makeText(getContext(),"Fields are empty",Toast.LENGTH_SHORT).show();
                }
                else if(!(emailid.isEmpty() && passwords.isEmpty())){
                    mFirebaseAuth.createUserWithEmailAndPassword(emailid,passwords).addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(getContext(),"Signup Unsuccessful,Please try again",Toast.LENGTH_SHORT).show();
                            }
                            else{
                                startActivity(new Intent(getContext(),Login.class));
                            }
                        }
                    });

                }

                else {
                    Toast.makeText(getContext(),"Error occurred",Toast.LENGTH_SHORT).show();
                }
            }
        });

        textsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),Login.class);
                startActivity(i);
            }
        });
        return view;
    }

}
