package com.shopping.li.shopping.Fragment.Mall;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.shopping.li.shopping.Adapter.EleAdapter;
import com.shopping.li.shopping.Entity.GoodsInfo;
import com.shopping.li.shopping.Fragment.BaseFragment;
import com.shopping.li.shopping.R;

import java.util.ArrayList;

/**
 * Created by li on 2018/2/24.
 * 电子界面
 */

public class EleFragment extends BaseFragment {
    private  EleAdapter  eleAdapter;
    private ListView listView;
    private View view;
    private GoodsInfo goodsInfo ,ipad ,iphone,xianshiqi,jianpan,bijiben;
    private ArrayList<GoodsInfo> goodsInfoArrayList;
    private GoodsInfo.Builder builder;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        view =  inflater.inflate(R.layout.elefragment_main_layout,container,false);
        listView = view.findViewById(R.id.eleListView);
        goodsInfoArrayList = new ArrayList<>();

        ipad = new GoodsInfo("1","name", "desc",200,  100,
             "color", "size", R.drawable.ipad,1000 ,1);

        iphone = new GoodsInfo("1","name", "desc",200,  100,
                "color", "size", R.drawable.iphone,1000 ,1);
        xianshiqi = new GoodsInfo("1","name", "desc",200,  100,
                "color", "size", R.drawable.xianshiqi,1000 ,1);
        jianpan = new GoodsInfo("1","name", "desc",200,  100,
                "color", "size", R.drawable.jianpan,1000 ,1);
        bijiben = new GoodsInfo("1","name", "desc",200,  100,
                "color", "size", R.drawable.bijiben,1000 ,1);

        goodsInfoArrayList.add(ipad);
        goodsInfoArrayList.add(iphone);
        goodsInfoArrayList.add(xianshiqi);
        goodsInfoArrayList.add(jianpan);
        goodsInfoArrayList.add(bijiben);

        if (goodsInfoArrayList != null)
        {

            eleAdapter = new EleAdapter(getContext(),goodsInfoArrayList);
            listView.setAdapter(eleAdapter);
        }else
        {
            Toast.makeText(getContext(),"goodsInfoArrayList = null",Toast.LENGTH_LONG).show();
        }
        return view;
    }
}
