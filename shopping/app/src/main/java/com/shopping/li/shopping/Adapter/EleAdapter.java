package com.shopping.li.shopping.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.shopping.li.shopping.Entity.GoodsInfo;
import com.shopping.li.shopping.R;

import java.util.ArrayList;

/**
 * Created by li on 2018/2/26.
 */

public class EleAdapter extends BaseAdapter implements ListAdapter {



    private ArrayList<GoodsInfo> goodsList;
    private Context mContext ;
    private GoodsInfo goods;

    public EleAdapter(Context context, ArrayList<GoodsInfo> goodsInfoArrayList) {
        this.mContext = context;
        this.goodsList = goodsInfoArrayList;
    }

    @Override
    public boolean isEnabled(int position) {
        return false;
    }

    @Override
    public int getCount() {
        return goodsList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final GroupViewHolder groupViewHolder;
        if (convertView==null){
            convertView  = LayoutInflater.from(mContext).inflate(R.layout.elelistview_layout,null);
            groupViewHolder =new GroupViewHolder();
            convertView.setTag(groupViewHolder);

        }else{
            groupViewHolder = (GroupViewHolder) convertView.getTag();
        }
        groupViewHolder.storeCheckBox=convertView.findViewById(R.id.single_checkBox);
        groupViewHolder.imageView=convertView.findViewById(R.id.goods_image);
        groupViewHolder.goods_name=convertView.findViewById(R.id.goods_name);
        groupViewHolder.goods_size=convertView.findViewById(R.id.goods_size);
        groupViewHolder.goods_price=convertView.findViewById(R.id.goods_price);
        groupViewHolder.goods_prime_price=convertView.findViewById(R.id.goods_prime_price);
        groupViewHolder.goods_buyNum=convertView.findViewById(R.id.goods_buyNum);
        groupViewHolder.reduce_goodsNum=convertView.findViewById(R.id.reduce_goodsNum);
        groupViewHolder.goods_Num=convertView.findViewById(R.id.goods_Num);
        groupViewHolder.increase_goods_Num=convertView.findViewById(R.id.increase_goods_Num);
       // groupViewHolder.goodsSize=convertView.findViewById(R.id.goodsSize);
        groupViewHolder.del_goods=convertView.findViewById(R.id.del_goods);
        goods = goodsList.get(position);
        if (goods!=null){

            groupViewHolder.imageView.setImageResource(goods.getGoodsImg());
            groupViewHolder.goods_name.setText(goods.getName());
            groupViewHolder.goods_size.setText(goods.getSize()+"");
            groupViewHolder.goods_price.setText(goods.getPrice()+"");
            groupViewHolder.goods_prime_price.setText(goods.getPrime_price()+"");
            groupViewHolder.goods_buyNum.setText(goods.getBuyNum()+"");
            groupViewHolder.goods_Num.setText(goods.getCount()+"");
        }else {
            goods = goodsList.get(position);
        }



        return convertView;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getViewTypeCount() {
        return goodsList.size();
    }

    private class GroupViewHolder {
        public GroupViewHolder() {
        }
        CheckBox  storeCheckBox;
        TextView goods_name;
        TextView goods_size;
        TextView goods_price;
        TextView goods_prime_price;
        TextView goods_buyNum;
        TextView reduce_goodsNum;
        TextView goods_Num;
        TextView increase_goods_Num;
        TextView goodsSize;
        TextView del_goods;

        TextView storeEdit;
        ImageView imageView;


    }
}
