package com.example.d2a.aplikasipesan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMessage(View v){
        EditText txtPesan = (EditText) findViewById(R.id.inp_pesan);
        String pesan = txtPesan.getText().toString();

     //   Toast.makeText(this, pesan, Toast.LENGTH_SHORT).show();
        Intent it = new Intent(this, ShowMessage.class);
        startActivity(it);
    }
}
