package com.example.pcpv.unittestdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static Intent createNewIntent(Context context, String username) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra("USER", username);
        return intent;
    }

    public String getName() {
        return "";
    }

    public void doSomeThings(String name) {
    }
}
