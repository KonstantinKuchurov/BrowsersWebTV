package com.browserswebtv.app;

import android.app.UiModeManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        myMethod();
        /*UiModeManager uiModeManager = (UiModeManager) getSystemService(UI_MODE_SERVICE);
        if (uiModeManager.getCurrentModeType() != Configuration.UI_MODE_TYPE_TELEVISION) {
            startActivity(new Intent(this, ActivityPhone.class));
        } else {
            startActivity(new Intent(this, ActivityTv.class));
        }*/
        //startActivity(new Intent(this, MainActivity.class));
        //startActivity(new Intent(this, ActivityPhone.class));
        /*Intent intent = new Intent();
        intent.setClassName("com.browserswebtv.app", "com.browserswebtv.app.ActivityPhone");
        startActivity(intent);*/
    }
    // Так работает нормально
    private void myMethod() {
        UiModeManager uiModeManager = (UiModeManager) getSystemService(UI_MODE_SERVICE);
        if (uiModeManager.getCurrentModeType() != Configuration.UI_MODE_TYPE_TELEVISION) {
            //setContentView(R.layout.activity_phone);
            startActivity(new Intent(this, ActivityPhone.class));
        } else {
            setContentView(R.layout.activity_tv);
            //startActivity(new Intent(this, ActivityTV.class));
        }
    }
}
    