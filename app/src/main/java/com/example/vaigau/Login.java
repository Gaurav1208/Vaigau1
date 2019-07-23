package com.example.vaigau;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends Fragment {
    Button btlogin;
    EditText name, password;
    TextView tvlogin;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    private Login() {

    }

    public static Login getInstance() {
        return new Login();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_login2, container, false);
        mFirebaseAuth = FirebaseAuth.getInstance();
        name = view.findViewById(R.id.name);
        password = view.findViewById(R.id.etpass);
        btlogin = view.findViewById(R.id.pass);
        tvlogin = view.findViewById(R.id.ftpass);

        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mfFirebaseUser = mFirebaseAuth.getCurrentUser();
                if (mfFirebaseUser != null) {
                    Toast.makeText(getActivity(), "You are logged in", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getActivity(), Welcome.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getActivity(), "Please Login", Toast.LENGTH_SHORT).show();
                }
            }
        };

        mFirebaseAuth.addAuthStateListener(mAuthStateListener);

        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String emailid = name.getText().toString();
                String passwords = password.getText().toString();
                if (emailid.isEmpty()) {
                    name.setError("Please enter email");
                    name.requestFocus();
                } else if (passwords.isEmpty()) {
                    password.setError("Please enter password");
                    password.requestFocus();
                } else if (emailid.isEmpty() && passwords.isEmpty()) {
                    Toast.makeText(getContext(), "Fields are empty", Toast.LENGTH_SHORT).show();
                } else if (!(emailid.isEmpty() && passwords.isEmpty())) {
                    mFirebaseAuth.signInWithEmailAndPassword(emailid, passwords).addOnCompleteListener(getActivity(), new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()) {
                                Toast.makeText(getContext(), "Login Error, Please try again", Toast.LENGTH_SHORT).show();
                            } else {
                                Intent j = new Intent(getContext(), Welcome.class);
                                startActivity(j);
                            }
                        }
                    });

                } else {
                    Toast.makeText(getContext(), "Error occurred", Toast.LENGTH_SHORT).show();
                }

            }
        });

        tvlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getContext(), SignUp.class);
                startActivity(k);
            }
        });
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}

