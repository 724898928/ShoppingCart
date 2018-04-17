package com.shopping.li.shopping.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

import com.shopping.li.shopping.Adapter.BaseAdapter;
import com.shopping.li.shopping.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by li on 2018/2/24.
 */

public class BaseFragment extends Fragment {

     List<String> mDatas= new ArrayList<>();
     BaseExpandableListAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.expandablelist_layout,container,false);
        adapter = new BaseAdapter();


        return view;
    }

    class  MyViewHolder extends RecyclerView.ViewHolder{
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
