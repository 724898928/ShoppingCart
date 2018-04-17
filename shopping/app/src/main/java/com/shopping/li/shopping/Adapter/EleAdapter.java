package com.shopping.li.shopping.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.shopping.li.shopping.R;

/**
 * Created by li on 2018/2/26.
 */

public class EleAdapter extends BaseAdapter {

    private Context mContext ;
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
      final GroupViewHolder groupViewHolder;
        if (convertView==null){
            mContext = convertView.getContext();
            convertView  = View.inflate(mContext, R.layout.item_shopcat_product,null);
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
        groupViewHolder.goodsSize=convertView.findViewById(R.id.goodsSize);
        groupViewHolder.del_goods=convertView.findViewById(R.id.del_goods);

        return convertView;

    }

    private class GroupViewHolder {
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

        public GroupViewHolder() {
        }
    }
}
