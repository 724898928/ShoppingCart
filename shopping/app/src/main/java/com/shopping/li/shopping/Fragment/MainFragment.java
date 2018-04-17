package com.shopping.li.shopping.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shopping.li.shopping.R;

/**
 * Created by li on 2018/2/24.
 */

public class MainFragment extends BaseFragment {
TextView tvContent;
private  View mView;
String tag= "tag";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        if(mView==null){
            mView = View.inflate(getContext(),R.layout.fragment_test,null);
            tvContent = mView.findViewById(R.id.tv_content);

            Bundle arguments = getArguments();
            if (arguments!=null){
                String string = arguments.getString(tag);
                tvContent.setText(string);

            }
        }
        ViewGroup parent = (ViewGroup) mView.getParent();
        if (parent!=null){
            parent.removeView(mView);
        }
        return mView;
        // return inflater.inflate(R.layout.activity_good,container,false);
    }
}
