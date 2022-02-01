package com.example.task9.Adapter;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.task9.Model.Member;
import com.example.task9.R;
import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    Context context;
    ArrayList<Member> members;

    public RecyclerAdapter(Context context, ArrayList<Member> members){
        this.context = context;
        this.members = members;
    }

    @Override
    public int getItemCount() {
        return members.size();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_horizontal, parent, false);
            return new MemberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Member member = members.get(position);
        if(holder instanceof MemberViewHolder){
           //TextView  name = ((MemberViewHolder)holder).name;
           //TextView  surname = ((MemberViewHolder)holder).surname;
           ImageView profile = ((MemberViewHolder)holder).profile;

           //name.setText(member.getName());
           //surname.setText(member.getSurname());
           profile.setImageResource(member.getProfile());
        }
    }

     class MemberViewHolder extends RecyclerView.ViewHolder {
        public View view;
        //TextView name,surname;
        ImageView profile;

        public MemberViewHolder(@NonNull View v) {
            super(v);
            this.view = v;

            //name = view.findViewById(R.id.tv_name);
            //surname = view.findViewById(R.id.tv_surname);
            profile = view.findViewById(R.id.iv_profile);
        }
    }

}

