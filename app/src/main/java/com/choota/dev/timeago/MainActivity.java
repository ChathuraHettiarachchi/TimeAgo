package com.choota.dev.timeago;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

import com.choota.dev.ctimeago.TimeAgo;

import org.joda.time.DateTime;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_time, tv_timeago, tv_time1, tv_timeago1;

        tv_time = (TextView) findViewById(R.id.tv_time);
        tv_timeago = (TextView) findViewById(R.id.tv_timeago);

        tv_time1 = (TextView) findViewById(R.id.tv_time1);
        tv_timeago1 = (TextView) findViewById(R.id.tv_timeago1);

        tv_time.setText(new Date().toString());
        tv_time1.setText(new DateTime(new Date()).minusDays(1).toDate().toString());

        tv_timeago.setText(new TimeAgo().getTimeAgo(new Date()));
        tv_timeago1.setText(new TimeAgo().getTimeAgo(new DateTime(new Date()).minus(2).toDate()));

    }
}
