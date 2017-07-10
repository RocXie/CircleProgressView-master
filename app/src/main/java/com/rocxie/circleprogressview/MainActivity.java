package com.rocxie.circleprogressview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rocxie.circleprogresslibrary.CircleProgressView;
/**
 * Created by RocXie on 2017/7/10.
 */
public class MainActivity extends AppCompatActivity {

    private CircleProgressView mCircleProgressView1;
    private CircleProgressView mCircleProgressView2;
    private CircleProgressView mCircleProgressView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCircleProgressView1 = (CircleProgressView) findViewById(R.id.circleProgressView1);
        mCircleProgressView2 = (CircleProgressView) findViewById(R.id.circleProgressView2);
        mCircleProgressView3 = (CircleProgressView) findViewById(R.id.circleProgressView3);
        mCircleProgressView3.setProgress(10);
        mCircleProgressView1.setProgress(10);
        mCircleProgressView2.setProgress(10);

    }
}
