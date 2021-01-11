package com.hongdroid.recyclerviewsample.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hongdroid.recyclerviewsample.R;
import com.hongdroid.recyclerviewsample.adapter.CustomAdapter;
import com.hongdroid.recyclerviewsample.model.UserInfo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private CustomAdapter mAdapter;
    private ArrayList<UserInfo> mUserInfos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUserInfos = new ArrayList<>();

        RecyclerView rv_main = findViewById(R.id.rv_main);
        Button btn_add = findViewById(R.id.btn_add);

        rv_main.setHasFixedSize(true);
        mAdapter = new CustomAdapter(mUserInfos);
        rv_main.setAdapter(mAdapter);

        // 추가
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAdapter.addListItem(new UserInfo("홍드로이드", "28", "컴퓨터"));
            }
        });

    }
}