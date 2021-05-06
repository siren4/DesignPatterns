package com.siren.liu.sample.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.siren.liu.click.repeat.RepeatClick;
import com.siren.liu.sample.R;
import com.siren.liu.sample.aop.Report;
import com.siren.liu.sample.ui.login2.Login2Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enterAccountSDK(View view) {
        startActivity(new Intent(this, Login2Activity.class));
    }

    @RepeatClick
    @Report(eventId = "MainActivity", data = "view:222")
    public void onRepeat(View view) {
        Log.d("siren4", "++我被点击啦++");
    }
}
