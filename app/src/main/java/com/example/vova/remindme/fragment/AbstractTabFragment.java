package com.example.vova.remindme.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;

/**
 * Created by vova on 08/07/2016.
 */
public class AbstractTabFragment extends Fragment{

    private String title;
    protected Context context;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
