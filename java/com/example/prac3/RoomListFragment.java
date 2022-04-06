package com.example.prac3;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;
import android.app.*;
import android.content.Intent;
import android.os.*;
import android.graphics.Point;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.*;

import androidx.fragment.app.Fragment;

public class RoomListFragment extends Fragment {

    public RoomListFragment(){
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_groupstudyroom, container, false);
        View studyButton = view.findViewById(R.id.createRoomButton);
        studyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { ;

                int width = container.getWidth();
                int height =container.getHeight();
                View popupView = inflater.inflate(R.layout.create_room_popup, null);
                PopupWindow popupWindow = new PopupWindow(popupView, width, height+400, true);
                popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
                ImageButton close = (ImageButton) popupView.findViewById(R.id.closeButton);
                close.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View popupView) {
                       popupWindow.dismiss();
                    }
                });

            }
        });
        return view;
    }
}