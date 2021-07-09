package com.example.mybeautyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import ru.tinkoff.decoro.MaskImpl;
import ru.tinkoff.decoro.slots.PredefinedSlots;
import ru.tinkoff.decoro.watchers.FormatWatcher;
import ru.tinkoff.decoro.watchers.MaskFormatWatcher;

public class LoginActivity extends AppCompatActivity {

    private EditText etPassword, etPhoneNumber;
    private Button bLogin, bReg, bForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etPassword = findViewById(R.id.etPassword);
        etPhoneNumber = findViewById(R.id.etPhoneNumber);
        FormatWatcher formatWatcher = new MaskFormatWatcher(MaskImpl.createNonTerminated(PredefinedSlots.RUS_PHONE_NUMBER));
        formatWatcher.installOn(etPhoneNumber);

        bLogin = findViewById(R.id.bReg);
        bLogin.setOnClickListener(v -> checkLogin());

        bForgotPassword = findViewById(R.id.bForgotPassword);
        bForgotPassword.setOnClickListener(v -> goToForgotPasswordActivity());

        bReg = findViewById(R.id.bReg);
        bReg.setOnClickListener(v -> goToRegActivity());
    }

    private void checkLogin(){
        String login = etPhoneNumber.getText()+"beauty.com";
        String password = String.valueOf(etPassword.getText());
    }
    private void goToForgotPasswordActivity(){}
    private void goToRegActivity(){}
}
