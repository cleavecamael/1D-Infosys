package com.example.prac3;

import java.io.*;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import  android.os.Bundle;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // require a empty public constructor
    }
    RoomListFragment GroupRoom = new RoomListFragment();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        View studyButton = view.findViewById(R.id.GroupStudy);
        studyButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //do what you want to do when button is clicked
                getParentFragmentManager().beginTransaction().replace(R.id.container, GroupRoom).commit();
            }
        });
        return view;

    }





}
