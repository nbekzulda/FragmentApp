package com.example.nis;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.LENGTH_SHORT;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>  {
    public int counter = 0;
    Context mContext;
    List<Home> mData;

    private FragmentHome listener;



    public RecyclerViewAdapter(Context mContext, List<Home> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }


    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_home, parent, false);
        final MyViewHolder viewHolder = new MyViewHolder(v);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Post " + String.valueOf(viewHolder.getAdapterPosition()+ 1), LENGTH_SHORT).show();
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder( MyViewHolder holder, int position) {

        holder.img.setImageResource(mData.get(position).getPhoto());
        holder.imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;

                Toast.makeText(mContext, "Likes " + String.valueOf(counter), LENGTH_SHORT).show();



            }
        });



    }



    interface FragmentHomeListener{
        void counterResult(int count);
    }



    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView img;
        private ImageButton imageButton;




        public MyViewHolder( View itemView) {
            super(itemView);
            imageButton = (ImageButton) itemView.findViewById(R.id.imbut);
            img = (ImageView) itemView.findViewById(R.id.img_post);


        }


    }

}
