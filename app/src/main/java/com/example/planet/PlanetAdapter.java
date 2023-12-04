package com.example.planet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PlanetAdapter  extends RecyclerView.Adapter<PlanetAdapter.MyViewHolder>{
    Context context;
    ArrayList<Planet> planetList;
    private FirebaseServices fbs;
    public PlanetAdapter(Context context, ArrayList<Planet> planetList) {
        this.context = context;
        this.planetList = planetList;
        this.fbs = FirebaseServices.getInstance();
    }
    @NonNull
    @Override
    public PlanetAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.planet_item,parent,false);
        return  new PlanetAdapter.MyViewHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull PlanetAdapter.MyViewHolder holder, int position) {
        Planet planet = planetList.get(position);
        holder.tvName.setText(planet.getName());
        holder.tvOrbit.setText(planet.getOrbit());
        holder.tvSize.setText(planet.getSize());

    }

    @Override
    public int getItemCount() {
        return planetList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvName,tvSize,tvOrbit;
        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            tvName=itemView.findViewById(R.id.tvNamePlanetItem);
            tvSize=itemView.findViewById(R.id.tvSizePlanetItem);
            tvOrbit=itemView.findViewById(R.id.tvOrbitPlanetItem);
        }

    }


}
