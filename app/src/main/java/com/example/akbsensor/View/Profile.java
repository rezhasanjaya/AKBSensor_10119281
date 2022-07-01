package com.example.akbsensor.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.akbsensor.R;
/**
 Rezha Satria SP
 10119281
 IF7
 **/
public class Profile extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup profile = (ViewGroup) inflater.inflate(R.layout.profile, container, false);
        return profile;
    }

}
