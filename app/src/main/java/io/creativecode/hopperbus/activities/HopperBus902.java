package io.creativecode.hopperbus.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import io.creativecode.hopperbus.R;

/**
 * Created by emmanuelabola on 01/01/2017.
 */

//this class is to dummy show list of bus times
public class HopperBus902 extends AppCompatActivity {

    //attempt to dummy app
    private TextView mBusTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hopperbus902);

        //Attempt to make app look finished
        mBusTextView = (TextView) findViewById(R.id.text_stop_name);

        String []  dummyBusData = {

                "University Park, East Drive",
                "University Park, Arts Centre",
                "Kings Meadow",
                "University East Entrance",
                "9 Triumph Road",
                "Jubilee Campus, Newark Hall",
                "Jubilee Campus, The Exchange",
                "University Park, George Green Library",
                "University Park, East Drive",
        };


        for (String dummyBusDay : dummyBusData) {
            mBusTextView.append(dummyBusDay + "\n\n\n\n");
        }

    };
}