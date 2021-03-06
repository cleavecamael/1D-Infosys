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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RoomListFragment extends Fragment {

    RecyclerView recycleView;
    public RoomListFragment(){
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_groupstudyroom, container, false);
        String[] s = {"Hello", "World","yes"};
        recycleView = (RecyclerView) view.findViewById(R.id.roomsRecyclerView);
        RoomAdapter adapter = new RoomAdapter(getActivity(), s);
        recycleView.setAdapter(adapter);
        recycleView.setLayoutManager(new LinearLayoutManager(getActivity()));

        View studyButton = view.findViewById(R.id.createRoomButton);
        studyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { ;
                //Setup popup window when create room is clicked
                int width = container.getWidth();
                int height =container.getHeight();

                View popupView = inflater.inflate(R.layout.create_room_popup, null);
                PopupWindow popupWindow = new PopupWindow(popupView, width, height+400, true);
                popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);
                //close the popup window when cross is clicked
                ImageButton close = (ImageButton) popupView.findViewById(R.id.closeButton);
                close.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View popupView) {
                       popupWindow.dismiss();
                    }
                });
                Button create = (Button) popupView.findViewById(R.id.finalCreateRoom);
                create.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View popupView) {
                        Intent intent = new Intent(getActivity(), GroupStudyActivity.class);
                        popupWindow.dismiss();
                        startActivity(intent);
                    }
                });

            }
        });


        return view;
    }
}