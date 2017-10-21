package com.tools.radio.hearthstonepropertymanagement.Activitys.contact;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.tools.radio.hearthstonepropertymanagement.R;

import org.w3c.dom.Text;

public class seal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seal);
        TextView sealText = (TextView) findViewById(R.id.sealText);

        sealText.setText(
                getString(R.string.sealingWaxP1) + "\n\n" + getString(R.string.sealingWaxP2) + "\n\n" + getString(R.string.sealingWaxP3) + "\n\n" + getString(R.string.sealingWaxP4) + "\n\n" + getString(R.string.sealingWaxP5) + "\n\n" + getString(R.string.sealingWaxP6));

    }
}
