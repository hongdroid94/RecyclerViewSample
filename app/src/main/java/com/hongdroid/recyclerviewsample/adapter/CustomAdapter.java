package com.hongdroid.recyclerviewsample.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hongdroid.recyclerviewsample.R;
import com.hongdroid.recyclerviewsample.model.UserInfo;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    private ArrayList<UserInfo> mUserInfos;

    public CustomAdapter(ArrayList<UserInfo> mUserInfos) {
        this.mUserInfos = mUserInfos;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View holder = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_user, parent, false);
        return new CustomViewHolder(holder);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.tv_userName.setText(mUserInfos.get(position).getUserName());
        holder.tv_userAge.setText(mUserInfos.get(position).getUserAge());
        holder.tv_userHobby.setText(mUserInfos.get(position).getUserHobby());
    }

    @Override
    public int getItemCount() {
        return mUserInfos.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        protected TextView tv_userName, tv_userAge, tv_userHobby;
        protected Button btn_delete;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_userName = itemView.findViewById(R.id.tv_userName);
            tv_userAge = itemView.findViewById(R.id.tv_userAge);
            tv_userHobby = itemView.findViewById(R.id.tv_userHobby);
            btn_delete = itemView.findViewById(R.id.btn_delete);

            // 리스트 아이템 클릭
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int curPos = getAdapterPosition();
                    UserInfo item = mUserInfos.get(curPos);

                }
            });

            // 삭제
            btn_delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int curPos = getAdapterPosition();
                    mUserInfos.remove(curPos);
                    notifyDataSetChanged();
                }
            });
        }
    }


    /**
     * 액티비티로 부터 데이터가 담긴 모델클래스를 전달받는다.
     * @param item
     */
    public void addListItem(UserInfo item) {
        mUserInfos.add(item);
        notifyDataSetChanged();
    }
}
