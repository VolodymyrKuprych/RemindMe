package com.example.vova.remindme.fragment;

import android.support.v4.app.Fragment;

/**
 * Created by vova on 08/07/2016.
 */
public class AbstractTabFragment extends Fragment{
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;
}
