package com.example.e_softwarica;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class AboutCollegeFragment extends Fragment {
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup group, Bundle b) {
        rootView = inflater.inflate(R.layout.fragment_about_college, group, false);
        return rootView;
    }
}