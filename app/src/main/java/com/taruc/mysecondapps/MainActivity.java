package com.taruc.mysecondapps;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bView ;
    private Button bCall;
    private Button bHome ;
    private Button bEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bView = findViewById(R.id.btnView);
        bCall = findViewById((R.id.btnCall));
        bHome  = findViewById(R.id.btnHome);
        bEmail = findViewById(R.id.btnEmail);
    }

    public void vtarc(View v)
    {

        String url = "http://www.tarc.edu.my";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void call(View v)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"0165154323"));
        startActivity(intent);

    }


    public void home(View v)
    {

        Intent intent = new Intent(Intent.ACTION_MAIN);

        startActivity(intent);
    }

    public void send(View v)
    {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"+"limfj@tarc.edu.my"));
        startActivity(intent);
    }

}
