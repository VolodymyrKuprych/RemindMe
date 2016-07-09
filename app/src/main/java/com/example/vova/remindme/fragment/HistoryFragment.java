package com.example.vova.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vova.remindme.R;
import com.example.vova.remindme.adapter.RemindListAdapter;
import com.example.vova.remindme.dto.RemindDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vova on 08/07/2016.
 */
public class HistoryFragment extends AbstractTabFragment {

    public static HistoryFragment getInstance(Context ctx){
        Bundle args = new Bundle();
        HistoryFragment fragment = new HistoryFragment();
        fragment.setTitle(ctx.getString(R.string.tab_history));
        fragment.setContext(ctx);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_history, container, false);

        RecyclerView rv = (RecyclerView)view.findViewById(R.id.recycleview);
        rv.setLayoutManager(new LinearLayoutManager(context));
        rv.setAdapter(new RemindListAdapter(createMockRemindListData()));

        return view;
    }

    private List<RemindDTO> createMockRemindListData() {
        List<RemindDTO> testData = new ArrayList<>();
        testData.add(new RemindDTO("Item 1"));
        testData.add(new RemindDTO("Item 2"));
        testData.add(new RemindDTO("Item 3"));
        testData.add(new RemindDTO("Item 4"));
        testData.add(new RemindDTO("Item 5"));
        testData.add(new RemindDTO("Item 6"));
        return testData;
    }

}
