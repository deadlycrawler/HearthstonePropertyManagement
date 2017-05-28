package com.tools.radio.hearthstonepropertymanagement;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);
//        getActionBar().setDisplayHomeAsUpEnabled(true);


        ImageView email = (ImageView) findViewById(R.id.email);
        ImageView phone = (ImageView) findViewById(R.id.phone);


        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                composeEmail(Address(), subject(), emailContent());
            }
        });

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialOffice("5306324507");
            }
        });
    }

    //intent that composes an email
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

    public String emailContent() {
        String emailContent = getString(R.string.emailContent);
        return emailContent;
    }

    private String[] Address() {
        String[] emailAddresses = {"Deadlycrawler2@gmail.com"};
        return emailAddresses;
    }

    private String subject() {
        return getString(R.string.emailSubject);
    }

    //intent to Dial a number

    private void dialOffice(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }

}
