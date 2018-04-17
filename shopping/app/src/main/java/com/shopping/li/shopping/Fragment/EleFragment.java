package com.shopping.li.shopping.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import com.shopping.li.shopping.Adapter.EleAdapter;
import com.shopping.li.shopping.R;

/**
 * Created by li on 2018/2/24.
 */

public class EleFragment extends BaseFragment {

    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.expandablelist_layout,
                container,false);
        ExpandableListView  listView = view.findViewById(R.id.listView);
        adapter = new EleAdapter();
        listView.setAdapter(adapter);
        return view;
    }
}
