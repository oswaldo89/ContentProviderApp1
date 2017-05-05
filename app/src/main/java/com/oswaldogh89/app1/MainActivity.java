package com.oswaldogh89.app1;

import android.content.ContentValues;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ContentValues values = new ContentValues();
        values.put(MyProvider.users, "oswaldo.gomez@dominio.com");
        getContentResolver().insert(MyProvider.CONTENT_URI, values);


        Toast.makeText(getBaseContext(), "New record inserted", Toast.LENGTH_LONG).show();
    }
}
