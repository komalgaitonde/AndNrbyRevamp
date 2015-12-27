package com.ascentsmartwaves.andnrby.activities;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.Display;
import android.provider.SyncStateContract;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;


import com.ascentsmartwaves.andnrby.R;
import com.ascentsmartwaves.andnrby.utils.Constants;


public class SplashScreenActivity extends Activity {
    private ImageView iv;
    private int width, height;
    LinearLayout screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

       getScreenResolution();
        findViews();
       // setViews();
       // getExtras();
       // fetchData();
    }
    public void getScreenResolution() {

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        width = size.x;
        height = size.y;

        SharedPreferences sharedPreferences = getSharedPreferences(Constants.APP_NAME, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("width", width);
        editor.putInt("height", height);
        editor.commit();

    }

    public void findViews() {

        screen = (LinearLayout) findViewById(R.id.main);
        iv = (ImageView) findViewById(R.id.logo_splashscreen);
        iv.setImageResource(R.drawable.logo_splash);
        iv.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.splash_screen_zoom));
    }
      setViews()
      {
      }
        getExtras()
        {
        }
        
        fetchData()
        {
        }
}

