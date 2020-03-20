package com.example.profilesetting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;

import com.example.profilesetting.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setupEvents();
        setValues();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("화면재등장","화면에 다시 등장할때 마다 실행");
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }
}
