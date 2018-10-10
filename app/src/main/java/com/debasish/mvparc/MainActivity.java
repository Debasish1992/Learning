package com.debasish.mvparc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.debasish.mvparc.Presenter.ILoginPresenter;
import com.debasish.mvparc.Presenter.LoginPresenter;
import com.debasish.mvparc.View.ILoginView;

public class MainActivity extends AppCompatActivity implements
        ILoginView{


    EditText etEmail, etPassword;
    Button btnLogin;

    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        etEmail = (EditText) findViewById(R.id.etUserId);
        etPassword = (EditText) findViewById(R.id.etPassword);

        loginPresenter = new LoginPresenter(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.onLogin(etEmail.getText().toString().trim(),
                        etPassword.getText().toString().trim());
            }
        });

        Toast.makeText(this, "Newly Added.", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Test Message is added.", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Test Message added later", Toast.LENGTH_SHORT).show();


        Toast.makeText(this, "Kuch bhi.", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Log toh Kuch bhi kehete hai.", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginResult(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginValidation(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
