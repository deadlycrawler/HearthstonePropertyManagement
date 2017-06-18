package com.tools.radio.hearthstonepropertymanagement;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);
//        getActionBar().setDisplayHomeAsUpEnabled(true);

        //TODO: add contact card for homespot *in progress*


        // address: 42479 US HWY 70, Portales, NM 88130

        ImageView email = (ImageView) findViewById(R.id.email);
        ImageView phone = (ImageView) findViewById(R.id.phone);
        TextView address = (TextView) findViewById(R.id.office_address);

        //adds an underline to the address so that its obvious that its a link
        //TODO: identify a modern way to let the user know that you can navigate by taping the address
        String underlineAddresss = "<u>42479 US Hwy 70\nPortales, NM 88130</u>";
        address.setText(Html.fromHtml(underlineAddresss));


        //intent to google maps to navigate to there office
        address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("google.navigation:q=42479 US Hwy 70,Portales, NM 88130");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }

        });

        //Click Listener for the Email Button
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                composeEmail(Address(), subject(), emailContent());
            }
        });

        //Click Listener for the call Button
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


    //Methods for contacting homespot
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

    //method for email content
    public String emailContent() {
        String emailContent = getString(R.string.emailContent);
        return emailContent;
    }

}
