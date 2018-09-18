package com.example.android.app;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.mail);
        TextView textview = (TextView) findViewById(R.id.jhelum);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, jeh.class);
                startActivity(i);

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "abc@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"abc@gmail.com", "test@gmail.com", "xyz@test.com"});
                emailIntent.putExtra(Intent.EXTRA_TEXT, "LEft Home");

                startActivity(emailIntent);
//                Intent intent = null;
//                intent = new Intent(Intent.ACTION_SEND);
//                intent.setType("plain/text");
//                intent.putExtra(Intent.EXTRA_EMAIL,new String[] { "abc@gmail.com" , "test@gmail.com", "xyz@test.com"});
//                startActivity(intent);
            }
        });
        Button b2 = (Button) findViewById(R.id.msg);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {
                    String smsNumber = "9595343356"; // E164 format without '+' sign
                    Intent sendIntent = new Intent(Intent.ACTION_SEND);
                    sendIntent.setType("text/plain");
                    sendIntent.putExtra(Intent.EXTRA_TEXT, "LEFT HOME");
                    sendIntent.putExtra("jid", smsNumber + "@s.whatsapp.net"); //phone number without "+" prefix
                    sendIntent.setPackage("com.whatsapp");

                    startActivity(sendIntent);
                }


            }


        });
        Button b3 = (Button) findViewById(R.id.help);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,helpp.class);
                startActivity(i);

            }


        });

    }
}