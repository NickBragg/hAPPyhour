package com.example.patrick.happyhour;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button buttonLogin = (Button)findViewById(R.id.loginButton);
        buttonLogin.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.loginButton: UserLogin();
            case R.id.buttonRegister: UserRegister();
        }
    }

    private void UserLogin() {
        EditText editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);

        startActivity( new Intent(this,BarListActivity.class));
        if (editTextUsername.getText().toString() == "admin" && editTextPassword.getText().toString() == "admin")
        {

        }


    }

    private void UserRegister()
    {

    }
}
