package com.example.prac3;

import java.io.*;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import  android.os.Bundle;


public class CreateRoomDialogFragment extends DialogFragment {

    public CreateRoomDialogFragment() {
        // require a empty public constructor
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setMessage("hello World")
                .setTitle("Hello world");
        AlertDialog dialog = builder.create();
        return dialog;
    }


}