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
public class HistoryFragment extends AbstractTabFragment {

    public static HistoryFragment getInstance(Context ctx){
        Bundle args = new Bundle();
        HistoryFragment fragment = new HistoryFragment();
        fragment.setTitle(ctx.getString(R.string.tab_history));
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_history, container, false);
        return view;
    }

}
