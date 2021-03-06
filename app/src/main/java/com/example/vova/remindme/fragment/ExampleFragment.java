package com.example.vova.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vova.remindme.R;

/**
 * Created by vova on 08/07/2016.
 */
public class ExampleFragment extends Fragment {
    private View view;
    private String title;
    private Context context;

    public static ExampleFragment getInstance(Context ctx){
        Bundle args = new Bundle();
        ExampleFragment fragment = new ExampleFragment();
        fragment.setContext(ctx);
        fragment.setTitle("ExampleFragment");
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_example, container, false);
        return view;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
