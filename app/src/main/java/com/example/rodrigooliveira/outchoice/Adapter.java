package com.example.rodrigooliveira.outchoice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.myViewHolder>{

    //Context mContext;  nao da para criar context sendo fragmento -> getActivity() extends Context
    Context mContext;
    List<item> mData;

    public Adapter(Context mContext, List<item> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        Log.d("MyOtherTag", "entrei no AdapterOnCreate");
        LayoutInflater inflater = LayoutInflater.from(mContext); //se der erro pode ser aqui LOL
        View v = inflater.inflate(R.layout.card_item, parent, false);

        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.background_img.setImageResource(mData.get(position).getBackground());
        holder.title.setText(mData.get(position).getTitle());


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {


        ImageView background_img;
        TextView title;


        public myViewHolder(@NonNull View itemView) {

            super(itemView);
            background_img = itemView.findViewById(R.id.card_background);
            title = itemView.findViewById(R.id.card_title);
        }
    }
}
