package com.example.busfirstdemo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TripAdapter extends RecyclerView.Adapter<TripAdapter.MyViewHolder> {

    String mail;
    Context context;
    ArrayList<TripAvailable>list;
    String date;

    public TripAdapter(Context context, ArrayList<TripAvailable> list, String date, String mail) {
        this.context = context;
        this.list = list;
        this.date=date;
        this.mail=mail;
    }

    @NonNull
    @Override
    public TripAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.trips,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TripAdapter.MyViewHolder holder, int position) {
        TripAvailable tripAvailable=list.get(position);

        holder.from.setText(tripAvailable.getFrom());
        holder.to.setText(tripAvailable.getDestine());
        holder.coach.setText(tripAvailable.getCoach());
        holder.date.setText(tripAvailable.getDate());
        holder.time.setText(tripAvailable.getTimes());
        holder.arrival.setText(tripAvailable.getArrival());
        holder.fare.setText(tripAvailable.getFare());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView from,to,date,coach,time,arrival,fare;
        Button select;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            from=itemView.findViewById(R.id.from);
            to=itemView.findViewById(R.id.to);
            date=itemView.findViewById(R.id.date);
            coach=itemView.findViewById(R.id.coach);
            time=itemView.findViewById(R.id.time);
            arrival=itemView.findViewById(R.id.arrival);
            fare=itemView.findViewById(R.id.fare);
            itemView.findViewById(R.id.selectseat).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(context,SelectSeat.class);
                    intent.putExtra("Date", TripAdapter.this.date);
                    intent.putExtra("mail", TripAdapter.this.mail);
                    intent.putExtra("from",list.get(getAdapterPosition()).getFrom());
                    intent.putExtra("to",list.get(getAdapterPosition()).getDestine());
                    intent.putExtra("coach",list.get(getAdapterPosition()).getCoach());
                    intent.putExtra("fare",list.get(getAdapterPosition()).getFare());
                    context.startActivity(intent);
                }
            });
        }
    }
}
