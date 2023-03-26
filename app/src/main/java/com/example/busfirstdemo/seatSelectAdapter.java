package com.example.busfirstdemo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class seatSelectAdapter extends RecyclerView.Adapter<seatSelectAdapter.MyViewHolder> {

    Context context;
    ArrayList<String >seatList;
    ArrayList<Seats>list;
    int fare;
    String from,to,mail,coach,dates;

    public seatSelectAdapter(Context context, ArrayList<Seats> list, int fare, String from, String to, String mail, String coach, String dates){
        this.context=context;
        this.list=list;
        this.fare=fare;
        this.from=from;
        this.to=to;
        this.mail=mail;
        this.coach=coach;
        this.dates=dates;
    }

    @NonNull
    @Override
    public seatSelectAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.seatdesign,parent,false);
        return new MyViewHolder(view);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Seats seats=list.get(position);
        if(seats.getSeat0().equals("false")){
            holder.a1.setClickable(false);
            holder.a1.setTextColor(R.color.white);
            holder.a1.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat1().equals("false")){
            holder.a2.setClickable(false);
            holder.a2.setTextColor(R.color.white);
            holder.a2.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat2().equals("false")){
            holder.a3.setClickable(false);
            holder.a3.setTextColor(R.color.white);
            holder.a3.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat3().equals("false")){
            holder.a4.setClickable(false);
            holder.a4.setTextColor(R.color.white);
            holder.a4.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat4().equals("false")){
            holder.b1.setClickable(false);
            holder.b1.setTextColor(R.color.white);
            holder.b1.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat5().equals("false")){
            holder.b2.setClickable(false);
            holder.b2.setTextColor(R.color.white);
            holder.b2.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat6().equals("false")){
            holder.b3.setClickable(false);
            holder.b3.setTextColor(R.color.white);
            holder.b3.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat7().equals("false")){
            holder.b4.setClickable(false);
            holder.b4.setTextColor(R.color.white);
            holder.b4.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat8().equals("false")){
            holder.c1.setClickable(false);
            holder.c1.setTextColor(R.color.white);
            holder.c1.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat9().equals("false")){
            holder.c2.setClickable(false);
            holder.c2.setTextColor(R.color.white);
            holder.c2.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat10().equals("false")){
            holder.c3.setClickable(false);
            holder.c3.setTextColor(R.color.white);
            holder.c3.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat11().equals("false")){
            holder.c4.setClickable(false);
            holder.c4.setTextColor(R.color.white);
            holder.c4.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat12().equals("false")){
            holder.d1.setClickable(false);
            holder.d1.setTextColor(R.color.white);
            holder.d1.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat13().equals("false")){
            holder.d2.setClickable(false);
            holder.d2.setTextColor(R.color.white);
            holder.d2.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat14().equals("false")){
            holder.d3.setClickable(false);
            holder.d3.setTextColor(R.color.white);
            holder.d3.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat15().equals("false")){
            holder.d4.setClickable(false);
            holder.d4.setTextColor(R.color.white);
            holder.d4.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat16().equals("false")){
            holder.e1.setClickable(false);
            holder.e1.setTextColor(R.color.white);
            holder.e1.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat17().equals("false")){
            holder.e2.setClickable(false);
            holder.e2.setTextColor(R.color.white);
            holder.e2.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat18().equals("false")){
            holder.e3.setClickable(false);
            holder.e3.setTextColor(R.color.white);
            holder.e3.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat19().equals("false")){
            holder.e4.setClickable(false);
            holder.e4.setTextColor(R.color.white);
            holder.e4.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat20().equals("false")){
            holder.f1.setClickable(false);
            holder.f1.setTextColor(R.color.white);
            holder.f1.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat21().equals("false")){
            holder.f2.setClickable(false);
            holder.f2.setTextColor(R.color.white);
            holder.f2.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat22().equals("false")){
            holder.f3.setClickable(false);
            holder.f3.setTextColor(R.color.white);
            holder.f3.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat23().equals("false")){
            holder.f4.setClickable(false);
            holder.f4.setTextColor(R.color.white);
            holder.f4.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat24().equals("false")){
            holder.g1.setClickable(false);
            holder.g1.setTextColor(R.color.white);
            holder.g1.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat25().equals("false")){
            holder.g2.setClickable(false);
            holder.g2.setTextColor(R.color.white);
            holder.g2.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat26().equals("false")){
            holder.g3.setClickable(false);
            holder.g3.setTextColor(R.color.white);
            holder.g3.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat27().equals("false")){
            holder.g4.setClickable(false);
            holder.g4.setTextColor(R.color.white);
            holder.g4.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat28().equals("false")){
            holder.h1.setClickable(false);
            holder.h1.setTextColor(R.color.white);
            holder.h1.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat29().equals("false")){
            holder.h2.setClickable(false);
            holder.h2.setTextColor(R.color.white);
            holder.h2.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat30().equals("false")){
            holder.h3.setClickable(false);
            holder.h3.setTextColor(R.color.white);
            holder.h3.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat31().equals("false")){
            holder.h4.setClickable(false);
            holder.h4.setTextColor(R.color.white);
            holder.h4.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat32().equals("false")){
            holder.i1.setClickable(false);
            holder.i1.setTextColor(R.color.white);
            holder.i1.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat33().equals("false")){
            holder.i2.setClickable(false);
            holder.i2.setTextColor(R.color.white);
            holder.i2.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat34().equals("false")){
            holder.i3.setClickable(false);
            holder.i3.setTextColor(R.color.white);
            holder.i3.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat35().equals("false")){
            holder.i4.setClickable(false);
            holder.i4.setTextColor(R.color.white);
            holder.i4.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat36().equals("false")){
            holder.j1.setClickable(false);
            holder.j1.setTextColor(R.color.white);
            holder.j1.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat37().equals("false")){
            holder.j2.setClickable(false);
            holder.j2.setTextColor(R.color.white);
            holder.j2.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat38().equals("false")){
            holder.j3.setClickable(false);
            holder.j3.setTextColor(R.color.white);
            holder.j3.setBackgroundColor(R.color.black);
        }
        if(seats.getSeat39().equals("false")){
            holder.j4.setClickable(false);
            holder.j4.setTextColor(R.color.white);
            holder.j4.setBackgroundColor(R.color.black);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        Button a1,b1,c1,d1,e1,f1,g1,h1,j1,i1;
        Button a2,b2,c2,d2,e2,f2,g2,h2,j2,i2;
        Button a3,b3,c3,d3,e3,f3,g3,h3,j3,i3;
        Button a4,b4,c4,d4,e4,f4,g4,h4,j4,i4;
        TextView seat,fare;
        ArrayList<String>hola;
        Button pay;
        int fares=seatSelectAdapter.this.fare;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            hola=new ArrayList<>();
            seat=itemView.findViewById(R.id.seats);
            fare=itemView.findViewById(R.id.fares);
            a1=itemView.findViewById(R.id.a1);
            pay=itemView.findViewById(R.id.pay);
            a1.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                   if(hola.size()<4) {
                       seat.setText(sona + " A1 ");
                       a1.setBackgroundColor(R.color.black);
                       a1.setTextColor(R.color.white);
                       a1.setClickable(false);
                       hola.add("seat0");
                       int total=hola.size()*fares;
                       fare.setText(String.valueOf(total));
                   }
                   else{
                       Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                   }
                }
            });
            b1=itemView.findViewById(R.id.b1);
            b1.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " B1 ");
                        b1.setBackgroundColor(R.color.black);
                        b1.setTextColor(R.color.white);
                        b1.setClickable(false);
                        hola.add("seat4");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            c1=itemView.findViewById(R.id.c1);
            c1.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " C1 ");
                        c1.setBackgroundColor(R.color.black);
                        c1.setTextColor(R.color.white);
                        c1.setClickable(false);
                        hola.add("seat8");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            d1=itemView.findViewById(R.id.d1);
            d1.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " D1 ");
                        d1.setBackgroundColor(R.color.black);
                        d1.setTextColor(R.color.white);
                        d1.setClickable(false);
                        hola.add("seat12");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            e1=itemView.findViewById(R.id.e1);
            e1.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " E1 ");
                        e1.setBackgroundColor(R.color.black);
                        e1.setTextColor(R.color.white);
                        e1.setClickable(false);
                        hola.add("seat16");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
          //  e1.setOnClickListener((View.OnClickListener) this);
            f1=itemView.findViewById(R.id.f1);
            f1.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " F1 ");
                        f1.setBackgroundColor(R.color.black);
                        f1.setTextColor(R.color.white);
                        f1.setClickable(false);
                        hola.add("seat20");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
          //  f1.setOnClickListener((View.OnClickListener) this);
            g1=itemView.findViewById(R.id.g1);
            g1.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " G1 ");
                        g1.setBackgroundColor(R.color.black);
                        g1.setTextColor(R.color.white);
                        g1.setClickable(false);
                        hola.add("seat24");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
          //  g1.setOnClickListener((View.OnClickListener) this);
            h1=itemView.findViewById(R.id.h1);
            h1.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " H1 ");
                        h1.setBackgroundColor(R.color.black);
                        h1.setTextColor(R.color.white);
                        h1.setClickable(false);
                        hola.add("seat28");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
         //   h1.setOnClickListener((View.OnClickListener) this);
            i1=itemView.findViewById(R.id.i1);
            i1.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " I1 ");
                        i1.setBackgroundColor(R.color.black);
                        i1.setTextColor(R.color.white);
                        i1.setClickable(false);
                        hola.add("seat32");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
          //  i1.setOnClickListener((View.OnClickListener) this);
            j1=itemView.findViewById(R.id.j1);
            j1.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " J1 ");
                        j1.setBackgroundColor(R.color.black);
                        j1.setTextColor(R.color.white);
                        j1.setClickable(false);
                        hola.add("seat36");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
          //  j1.setOnClickListener((View.OnClickListener) this);
            a2=itemView.findViewById(R.id.a2);
            a2.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " A2 ");
                        a2.setBackgroundColor(R.color.black);
                        a2.setTextColor(R.color.white);
                        a2.setClickable(false);
                        hola.add("seat1");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
          //  a2.setOnClickListener((View.OnClickListener) this);
            b2=itemView.findViewById(R.id.b2);
            b2.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " B2 ");
                        b2.setBackgroundColor(R.color.black);
                        b2.setTextColor(R.color.white);
                        b2.setClickable(false);
                        hola.add("seat5");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
          //  b2.setOnClickListener((View.OnClickListener) this);
            c2=itemView.findViewById(R.id.c2);
            c2.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " C2 ");
                        c2.setBackgroundColor(R.color.black);
                        c2.setTextColor(R.color.white);
                        c2.setClickable(false);
                        hola.add("seat9");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
          //  c2.setOnClickListener((View.OnClickListener) this);
            d2=itemView.findViewById(R.id.d2);
            d2.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " D2 ");
                        d2.setBackgroundColor(R.color.black);
                        d2.setTextColor(R.color.white);
                        d2.setClickable(false);
                        hola.add("seat13");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
         //   d2.setOnClickListener((View.OnClickListener) this);
            e2=itemView.findViewById(R.id.e2);
            e2.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " E2 ");
                        e2.setBackgroundColor(R.color.black);
                        e2.setTextColor(R.color.white);
                        e2.setClickable(false);
                        hola.add("seat17");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
         //   e2.setOnClickListener((View.OnClickListener) this);
            f2=itemView.findViewById(R.id.f2);
            f2.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " F2 ");
                        f2.setBackgroundColor(R.color.black);
                        f2.setTextColor(R.color.white);
                        f2.setClickable(false);
                        hola.add("seat21");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
         //   f2.setOnClickListener((View.OnClickListener) this);
            g2=itemView.findViewById(R.id.g2);
            g2.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " G2 ");
                        g2.setBackgroundColor(R.color.black);
                        g2.setTextColor(R.color.white);
                        g2.setClickable(false);
                        hola.add("seat25");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
         //   g2.setOnClickListener((View.OnClickListener) this);
            h2=itemView.findViewById(R.id.h2);
            h2.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " H2 ");
                        h2.setBackgroundColor(R.color.black);
                        h2.setTextColor(R.color.white);
                        h2.setClickable(false);
                        hola.add("seat29");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
         //   h2.setOnClickListener((View.OnClickListener) this);
            i2=itemView.findViewById(R.id.i2);
            i2.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " I2 ");
                        i2.setBackgroundColor(R.color.black);
                        i2.setTextColor(R.color.white);
                        i2.setClickable(false);
                        hola.add("seat33");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
           // i2.setOnClickListener((View.OnClickListener) this);
            j2=itemView.findViewById(R.id.j2);
            j2.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " J2 ");
                        j2.setBackgroundColor(R.color.black);
                        j2.setTextColor(R.color.white);
                        j2.setClickable(false);
                        hola.add("seat37");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
          //  j2.setOnClickListener((View.OnClickListener) this);
            a3=itemView.findViewById(R.id.a3);
            a3.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " A3 ");
                        a3.setBackgroundColor(R.color.black);
                        a3.setTextColor(R.color.white);
                        a3.setClickable(false);
                        hola.add("seat2");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
         //   a3.setOnClickListener((View.OnClickListener) this);
            b3=itemView.findViewById(R.id.b3);
            b3.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " B3 ");
                        b3.setBackgroundColor(R.color.black);
                        b3.setTextColor(R.color.white);
                        b3.setClickable(false);
                        hola.add("seat6");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
          //  b3.setOnClickListener((View.OnClickListener) this);
            c3=itemView.findViewById(R.id.c3);
            c3.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " C3 ");
                        c3.setBackgroundColor(R.color.black);
                        c3.setTextColor(R.color.white);
                        c3.setClickable(false);
                        hola.add("seat10");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
          //  c3.setOnClickListener((View.OnClickListener) this);
            d3=itemView.findViewById(R.id.d3);
            d3.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " D3 ");
                        d3.setBackgroundColor(R.color.black);
                        d3.setTextColor(R.color.white);
                        d3.setClickable(false);
                        hola.add("seat14");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
          //  d3.setOnClickListener((View.OnClickListener) this);
            e3=itemView.findViewById(R.id.e3);
            e3.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " E3 ");
                        e3.setBackgroundColor(R.color.black);
                        e3.setTextColor(R.color.white);
                        e3.setClickable(false);
                        hola.add("seat18");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
          //  e3.setOnClickListener((View.OnClickListener) this);
            f3=itemView.findViewById(R.id.f3);
            f3.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " F3 ");
                        f3.setBackgroundColor(R.color.black);
                        f3.setTextColor(R.color.white);
                        f3.setClickable(false);
                        hola.add("seat22");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
           // f3.setOnClickListener((View.OnClickListener) this);
            g3=itemView.findViewById(R.id.g3);
            g3.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " G3 ");
                        g3.setBackgroundColor(R.color.black);
                        g3.setTextColor(R.color.white);
                        g3.setClickable(false);
                        hola.add("seat26");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            //g3.setOnClickListener((View.OnClickListener) this);
            h3=itemView.findViewById(R.id.h3);
            h3.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " H3 ");
                        h3.setBackgroundColor(R.color.black);
                        h3.setTextColor(R.color.white);
                        h3.setClickable(false);
                        hola.add("seat30");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            //h3.setOnClickListener((View.OnClickListener) this);
            i3=itemView.findViewById(R.id.i3);
            i3.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " I3 ");
                        i3.setBackgroundColor(R.color.black);
                        i3.setTextColor(R.color.white);
                        i3.setClickable(false);
                        hola.add("seat34");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
            //i3.setOnClickListener((View.OnClickListener) this);
            j3=itemView.findViewById(R.id.j3);
            j3.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " J3 ");
                        j3.setBackgroundColor(R.color.black);
                        j3.setTextColor(R.color.white);
                        j3.setClickable(false);
                        hola.add("seat38");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
          //  j3.setOnClickListener((View.OnClickListener) this);
            a4=itemView.findViewById(R.id.a4);
            a4.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " A4 ");
                        a4.setBackgroundColor(R.color.black);
                        a4.setTextColor(R.color.white);
                        a4.setClickable(false);
                        hola.add("seat3");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
         //   a4.setOnClickListener((View.OnClickListener) this);
            b4=itemView.findViewById(R.id.b4);
            b4.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " B4 ");
                        b4.setBackgroundColor(R.color.black);
                        b4.setTextColor(R.color.white);
                        b4.setClickable(false);
                        hola.add("seat7");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
         //   b4.setOnClickListener((View.OnClickListener) this);
            c4=itemView.findViewById(R.id.c4);
            c4.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " C4 ");
                        c4.setBackgroundColor(R.color.black);
                        c4.setTextColor(R.color.white);
                        c4.setClickable(false);
                        hola.add("seat11");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
         //   c4.setOnClickListener((View.OnClickListener) this);
            d4=itemView.findViewById(R.id.d4);
            d4.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " D4 ");
                        d4.setBackgroundColor(R.color.black);
                        d4.setTextColor(R.color.white);
                        d4.setClickable(false);
                        hola.add("seat15");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
          //  d4.setOnClickListener((View.OnClickListener) this);
            e4=itemView.findViewById(R.id.e4);
            e4.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " E4 ");
                        e4.setBackgroundColor(R.color.black);
                        e4.setTextColor(R.color.white);
                        e4.setClickable(false);
                        hola.add("seat19");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
          //  e4.setOnClickListener((View.OnClickListener) this);
            f4=itemView.findViewById(R.id.f4);
            f4.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " F4 ");
                        f4.setBackgroundColor(R.color.black);
                        f4.setTextColor(R.color.white);
                        f4.setClickable(false);
                        hola.add("seat23");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
          //  f4.setOnClickListener((View.OnClickListener) this);
            g4=itemView.findViewById(R.id.g4);
            g4.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " G4 ");
                        g4.setBackgroundColor(R.color.black);
                        g4.setTextColor(R.color.white);
                        g4.setClickable(false);
                        hola.add("seat27");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
          //  g4.setOnClickListener((View.OnClickListener) this);
            h4=itemView.findViewById(R.id.h4);
            h4.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " H4 ");
                        h4.setBackgroundColor(R.color.black);
                        h4.setTextColor(R.color.white);
                        h4.setClickable(false);
                        hola.add("seat31");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
          //  h4.setOnClickListener((View.OnClickListener) this);
            i4=itemView.findViewById(R.id.i4);
            i4.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " I4 ");
                        i4.setBackgroundColor(R.color.black);
                        i4.setTextColor(R.color.white);
                        i4.setClickable(false);
                        hola.add("seat35");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
           // i4.setOnClickListener((View.OnClickListener) this);
            j4=itemView.findViewById(R.id.j4);
            j4.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("ResourceAsColor")
                @Override
                public void onClick(View view) {
                    String sona=seat.getText().toString().trim();
                    if(hola.size()<4) {
                        seat.setText(sona + " J4 ");
                        j4.setBackgroundColor(R.color.black);
                        j4.setTextColor(R.color.white);
                        j4.setClickable(false);
                        hola.add("seat39");
                        int total=hola.size()*fares;
                        fare.setText(String.valueOf(total));
                    }
                    else{
                        Toast.makeText(context, "Your Seat Limit Exceed", Toast.LENGTH_SHORT).show();
                    }
                }
            });
           // fares=fares*hola.size();
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,Payment.class);
                intent.putExtra("Seats",hola);
                intent.putExtra("fare",fares);
                intent.putExtra("from",seatSelectAdapter.this.from);
                intent.putExtra("to",seatSelectAdapter.this.to);
                intent.putExtra("mail",seatSelectAdapter.this.mail);
                intent.putExtra("coach",seatSelectAdapter.this.coach);
                intent.putExtra("date",seatSelectAdapter.this.dates);
                context.startActivity(intent);
            }
        });
        }
    }
}
