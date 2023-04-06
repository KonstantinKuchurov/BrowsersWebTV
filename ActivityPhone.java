package com.browserswebtv.app;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
public class ActivityPhone extends AppCompatActivity implements View.OnClickListener {
    ImageButton ib1;
    ImageButton ib2;
    ImageButton ib3;
    ImageButton ib4;
    EditText editText;
    Button btnGO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        editText = (EditText) findViewById(R.id.editText);
        btnGO = (Button)  findViewById(R.id.btnGO);
        ib1 = (ImageButton) findViewById(R.id.ib1);
        ib2 = (ImageButton) findViewById(R.id.ib2);
        ib3 = (ImageButton) findViewById(R.id.ib3);
        ib4 = (ImageButton) findViewById(R.id.ib4);
        ib1.setOnClickListener(this);
        ib2.setOnClickListener(this);
        ib3.setOnClickListener(this);
        ib4.setOnClickListener(this);
        btnGO.setOnClickListener(this);
        btnGO.setBackgroundColor(Color.RED);
    }
    @Override
    public final void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.ib1:
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.com"));
                startActivity(intent);
                break;
            case R.id.ib2:
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://yandex.com"));
                startActivity(intent);
                break;
            case R.id.ib3:
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com"));
                startActivity(intent);
                break;
            case R.id.ib4:
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://duckduckgo.com"));
                startActivity(intent);
                break;
            case R.id.btnGO:
                String url = editText.getText().toString();
                if (!url.startsWith("http://") && !url.startsWith("https://")) {
                    url = "http://" + url;
                }
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse(url)));
                break;
        }
    }
}