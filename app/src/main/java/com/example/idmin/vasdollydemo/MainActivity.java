package com.example.idmin.vasdollydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.leon.channel.helper.ChannelReaderUtil;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //https://blog.csdn.net/baiorwhite/article/details/79487975
        Log.d(TAG, "渠道: "+ChannelReaderUtil.getChannel(this));
    }
}
