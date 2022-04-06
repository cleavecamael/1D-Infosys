package com.example.prac3;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.prac3.databinding.GroupstudyBinding;

public class GroupStudyActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private GroupstudyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = GroupstudyBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_groupstudy);

    }


}