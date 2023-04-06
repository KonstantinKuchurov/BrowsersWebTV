package com.browserswebtv.app;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
public class ActivityTV extends Activity implements View.OnClickListener {
    EditText et;
    Button btGO;
    ImageButton ibYouTube;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv);
        et = (EditText) findViewById(R.id.et);
        btGO = (Button) findViewById(R.id.btGO);
        ibYouTube = (ImageButton) findViewById(R.id.ibYouTube);
        ibYouTube.setOnClickListener(this);
        btGO.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.ibYouTube:
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com"));
                startActivity(intent);
                break;
            case R.id.btGO:
                String url = et.getText().toString();
                if (!url.startsWith("http://") && !url.startsWith("https://")) {
                    url = "http://" + url;
                }
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(url)));
                break;
        }
    }
}
