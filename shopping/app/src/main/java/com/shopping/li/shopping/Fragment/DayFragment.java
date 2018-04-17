package com.shopping.li.shopping.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by li on 2018/2/24.
 */

public class DayFragment extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        for (int i= 0;i<50;i++){
            mDatas.add("我是Day"+i);
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
