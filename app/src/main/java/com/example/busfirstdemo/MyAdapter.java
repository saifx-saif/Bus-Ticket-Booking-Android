package com.example.busfirstdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    ArrayList<Trip> list;

    public MyAdapter(Context context, ArrayList<Trip> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.userinfo,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            Trip trip=list.get(position);
           /* holder.name.setText(trip.getName());
            holder.email.setText(trip.getEmail());*/
        holder.from.setText(trip.getFrom());
        holder.destination.setText(trip.getDestination());
        holder.date.setText(trip.getDate());
        holder.coach.setText(trip.getCoach());
        holder.depart.setText(trip.getDepart());
        holder.arrive.setText(trip.getArrive());
        holder.seat.setText(trip.getSeat());
        holder.fare.setText(trip.getFare());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView from,destination,date,coach,depart,arrive,seat,fare;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            from=itemView.findViewById(R.id.from);
            destination=itemView.findViewById(R.id.destination);
            date=itemView.findViewById(R.id.date);
            coach=itemView.findViewById(R.id.coach);
            depart=itemView.findViewById(R.id.depart);
            arrive=itemView.findViewById(R.id.arrive);
            seat=itemView.findViewById(R.id.seat);
            fare=itemView.findViewById(R.id.fare);
        }
    }
}
