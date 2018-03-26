package com.example.administrator.yongdaoapp;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2018/3/24 0024.
 */

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder>{
    private List<Home> mHomeList;
    static  class ViewHolder extends RecyclerView.ViewHolder{
        ImageView homeImage;
        ImageView avatarImage;
        TextView homeContext;
        TextView authorName;

        public ViewHolder(View view){
            super(view);
            homeImage=(ImageView) view.findViewById(R.id.image1);
            avatarImage=(ImageView) view.findViewById(R.id.avatar);
            authorName=(TextView) view.findViewById(R.id.author_name);
            homeContext=(TextView) view.findViewById(R.id.home_context);
        }
    }
    public HomeAdapter(List<Home> HomeList){
        mHomeList=HomeList;
    }
    @Override
    public  ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }
    @Override
    public  void onBindViewHolder(ViewHolder holder,int position){
        Home home=mHomeList.get(position);
        holder.homeImage.setImageResource(home.getImageid());
        holder.avatarImage.setImageResource(home.getAvatarid());
        holder.homeContext.setText(home.getContext());
        holder.authorName.setText(home.getAuthorName());
    }
    @Override
    public  int getItemCount(){
        return mHomeList.size();
    }
}
