package com.example.practicat3;
import com.squareup.picasso.Picasso;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;


public class MyStringAdapter extends RecyclerView.Adapter<MyStringAdapter.MyStringViewHolder> {

    private List<String> mData;
    private List<MainActivity.Anime> mAnime;
    private MainActivity mainActivity;


    public MyStringAdapter(List<MainActivity.Anime> anime, MainActivity mainActivity){
        //mData = data;
        this.mAnime = anime;
        this.mainActivity=mainActivity;

    }


    @NonNull
    @Override
    public MyStringViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_layout,parent,false);



        return new MyStringViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyStringViewHolder holder, int position) {
        TextView tvNombre =holder.mView.findViewById(R.id.tvNombre);
        TextView tvDesc =holder.mView.findViewById(R.id.descripcion);
        ImageView ivAvatar =holder.mView.findViewById(R.id.ivAvatar);



        MainActivity.Anime anime = mAnime.get(position);
        tvNombre.setText(anime.nombreanime);
        tvDesc.setText(anime.descripcion);
        Picasso.with(mainActivity.getApplicationContext()).load( mAnime.get(position).imagen).resize(120, 60).into(ivAvatar);

    }

    @Override
    public int getItemCount() {
        //return mData.size();
        return mAnime.size();
    }

    public class MyStringViewHolder extends RecyclerView.ViewHolder{

        private View mView;
        public MyStringViewHolder(@NonNull View itemView){
            super(itemView);
            mView=itemView;
        }
    }
}
