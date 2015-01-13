package com.marshalchen.common.demoofui;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class HowToUseActivity extends ActionBarActivity {

    @InjectView(R.id.howToUseGradleTag)
    TextView mHowToUseGradleTag;
    @InjectView(R.id.howToUseDetail)
    TextView mHowToUseDetail;
    @InjectView(R.id.howToUseProjectTag)
    TextView mHowToUseProjectTag;
    @InjectView(R.id.howToUseProjectDetail)
    TextView mHowToUseProjectDetail;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_use);
        ButterKnife.inject(this);
        data=getIntent().getStringExtra("data");
        judgeProjectInfo();
    }

    private void judgeProjectInfo() {
        switch (data){
            case "SwipeLayoutActivity":
                mHowToUseDetail.setText("compile \"com.daimajia.swipelayout:library:1.1.7@aar\"");
                mHowToUseProjectDetail.setText("https://github.com/daimajia/AndroidSwipeLayout");
                break;
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_how_to_use, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
