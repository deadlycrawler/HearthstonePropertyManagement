package com.tools.radio.hearthstonepropertymanagement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class seal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seal);
        TextView sealText = (TextView) findViewById(R.id.sealText);

        sealText.setText(
                R.string.sealingWaxP1 + "\n\n" + R.string.sealingWaxP2 + "\n\n" + R.string.sealingWaxP3 + "\n\n" + R.string.sealingWaxP4 + "\n\n" + R.string.sealingWaxP5 + "\n\n" + R.string.sealingWaxP6);

    }
}