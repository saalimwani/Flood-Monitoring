package com.example.android.app;




        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

        import org.w3c.dom.Text;

        import java.util.Random;

/**
 * Created by muhammad saalim wani on 20-03-2018.
 */

public class jeh extends AppCompatActivity {
    Button button;
    Button leftHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeh);
//        setUserTypeOnButtonClick();
        EditText status = (EditText) findViewById(R.id.message);
//        button = (Button) findViewById(R.id.help);


//      //.  button.setVisibility(View.INVISIBLE);
//        Random r = new Random();
//        int low = 20;
//       int high = 30;
//        int result ;//= 65;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
//            String address = extras.getString("MessageNumber");
            String message = extras.getString("Message");
//            TextView addressField = (TextView) findViewById(R.id.address);
            EditText messageField = (EditText) findViewById(R.id.message);
            EditText ReadingField = (EditText) findViewById(R.id.status);
//            addressField.setText("Message from: " + address);
                       if(message.charAt(0)=='B') {
                           messageField.setText("Message : " + message.replace("From: fahad.hilal11@gmail.com ", ""), TextView.BufferType.EDITABLE);
                           ReadingField.setText("Evacuate as soon as possible!");
                       }
            }
//            if(message.equals("Between 0 to 5ft"))
//            {
//                status.setText("Safe");
//            }
//            else if(message.equals("Between 5 to 10ft"))
//           {
//               status.setText("Monitor the updates");
//           }
//           else if(message.equals("Between 10 to 15ft"))
//            {
//                status.setText("Pack the essentials for evacuation, refer to help");
//            }
//            else
//            {
//                status.setText("Evacuate now");
//            }


//         result=r.nextInt(high - low) + low;
//        editText.setText("55");
//        if (result > 25) {
//            button.setVisibility(View.VISIBLE);
//        button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                Log.v("myTag", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//                Intent i = new Intent(jeh.this,fahad.class);
//                startActivity(i);
//
//            }
//        });
////            leftHome.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
////                    Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
////                            "mailto","saalimwani@gmail.com", null));
////                    emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
////                    emailIntent.putExtra(Intent.EXTRA_TEXT, "Body");
////                    startActivity(Intent.createChooser(emailIntent, "Send email..."));
//                    Intent intent = new Intent(Intent.ACTION_SEND);
//                    intent.setType("text/html");
//                    intent.putExtra(Intent.EXTRA_EMAIL, "emailaddress@emailaddress.com");+
//                    intent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
//                    intent.putExtra(Intent.EXTRA_TEXT, "I'm email body.");
//
//                    startActivity(Intent.createChooser(intent, "Send Email"));
//                }
//            });


//    }
        }
    }


