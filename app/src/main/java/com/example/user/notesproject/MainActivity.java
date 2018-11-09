package com.example.user.notesproject;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.user.notesproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public String myText = "Hello binding";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setMyData(this);
        myText = "data changed";
        binding.notifyChange();
    }
}
