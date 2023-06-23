package com.example.m4l5a1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class BlankFragment extends Fragment {
    EditText editTextName;
    TextView textViewResult;

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.blankfragment, container, false);
        editTextName = view.findViewById(R.id.editTextName);
        Button buttonSubmit = view.findViewById(R.id.buttonSubmit);
        textViewResult = view.findViewById(R.id.textViewResult);

        buttonSubmit.setOnClickListener(v -> {
            String name = editTextName.getText().toString();
            textViewResult.setText("Hello, " + name + "!");
        });

        return view;
    }
}
