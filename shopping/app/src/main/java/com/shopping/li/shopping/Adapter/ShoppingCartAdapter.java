package com.shopping.li.shopping.Adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.shopping.li.shopping.Entity.ShoppingCart;
import com.shopping.li.shopping.R;

import java.util.List;

/**
 * Created by li on 2018/2/25.
 */

public class ShoppingCartAdapter extends BaseAdapter {
    private Context context;
    private List<ShoppingCart> mList;

    public ShoppingCartAdapter(Context context, List mList) {
        this.context = context;
        this.mList = mList;
    }

    @Override
    public int getCount() {
        if (mList==null){
            return 0;
        }else {
            return  this.mList.size();
        }
    }

    @Override
    public Object getItem(int position) {
        if (mList==null){
            return null;
        }else{
            return  mList.get(position);
        }
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder  holder = null;
        if (convertView==null){
            holder = new ViewHolder();
            convertView = LayoutInflater.from(this.context).inflate(R.layout.activity_shoppingcart_item,null,true);
            holder.image = convertView.findViewById(R.id.pro_image);
            holder.checkBox= convertView.findViewById(R.id.pro_checkbox);
            holder.name = convertView.findViewById(R.id.pro_name);
            holder.price = convertView.findViewById(R.id.pro_shopPrice);
            holder.count = convertView.findViewById(R.id.pro_count);
            convertView.setTag(holder);

        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        if (this.mList!=null){
            ShoppingCart shoppingCart =  this.mList.get(position);
            holder.name.setText(shoppingCart.getProName().toString());
            holder.price.setText(shoppingCart.getShopPrice());
            holder.count.setText(shoppingCart.getProCount().toString());
        }

       return convertView;
    }

    private class ViewHolder {
        ImageView image;
        TextView name;
        TextView price;
        CheckBox  checkBox;
        TextView  count;
    }
}
