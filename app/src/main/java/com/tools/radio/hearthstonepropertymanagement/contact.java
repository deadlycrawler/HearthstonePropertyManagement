package com.tools.radio.hearthstonepropertymanagement;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.name;

public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);



        ImageView email = (ImageView) findViewById(R.id.email);

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                composeEmail(Address(),subject(),emailContent());
            }
        });
    }


    //intent that composes an email to "deadlycrawler2@gmail.com"
    public void composeEmail(String[] addresses, String subject, String emailContent) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, emailContent);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public String emailContent(){

        String emailContent = "Good after noon william i would like to give you a million dollars";

        return emailContent;
    }

    private String[] Address() {
        String[] emailAddresses= {"Deadlycrawler2@gmail.com"};
        return emailAddresses;
    }
    private String subject() {
        return "Reguarding your properties";
    }


}
