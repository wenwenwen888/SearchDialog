package com.wyt.searchbox.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wyt.searchbox.R;
import com.wyt.searchbox.custom.IOnItemClickListener;

import java.util.ArrayList;

public class SearchHistoryAdapter extends RecyclerView.Adapter<SearchHistoryAdapter.MyViewHolder> {

    private Context context;

    private ArrayList<String> historys = new ArrayList<>();

    public SearchHistoryAdapter(Context context, ArrayList<String> historys) {
        this.context = context;
        this.historys = historys;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(context).
                inflate(R.layout.item_search_history, parent, false));
        return holder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.historyInfo.setText(historys.get(position));

        holder.historyInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iOnItemClickListener.onItemClick(historys.get(position));
            }
        });

        holder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iOnItemClickListener.onItemDeleteClick(historys.get(position));
            }
        });

    }

    @Override
    public int getItemCount() {
        return historys.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView historyInfo;
        ImageView delete;

        public MyViewHolder(View view) {
            super(view);
            historyInfo = (TextView) view.findViewById(R.id.tv_item_search_history);
            delete = (ImageView) view.findViewById(R.id.iv_item_search_delete);
        }
    }

    private IOnItemClickListener iOnItemClickListener;

    public void setOnItemClickListener(IOnItemClickListener iOnItemClickListener) {
        this.iOnItemClickListener = iOnItemClickListener;
    }

}
