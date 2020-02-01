package com.oliverstudio.viewpager2demo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PendingFragment extends Fragment {

    private TextView mTextTextView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pending, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view) {
        mTextTextView = view.findViewById(R.id.text_tv);
    }

    public void setText(String someText) {
        mTextTextView.setText(someText);
    }

}
