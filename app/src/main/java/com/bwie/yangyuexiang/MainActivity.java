package com.bwie.yangyuexiang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import com.google.gson.Gson;

import java.util.List;

import adapter.Adapter;
import bean.Bean;
import di.IContract;
import di.IPresenter;

public class MainActivity extends AppCompatActivity implements IContract.iview {

    private IPresenter iPresenter;
    private RecyclerView recycler_view;
    private ImageView img_location;
    private CheckBox img_change;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iPresenter = new IPresenter();
        iPresenter.attachView(this);
        iPresenter.requestInfo();
        recycler_view = findViewById(R.id.recycler_view);
        img_location = findViewById(R.id.img_location);
        img_change = findViewById(R.id.img_change);
        img_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,WebActivity.class);
                startActivity(intent);
            }
        });

        img_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if (!img_change.isChecked()){
                        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
                        recycler_view.setLayoutManager(manager);
                        adapter.notifyDataSetChanged();

                    }else{
                        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 2, GridLayoutManager.VERTICAL, false);
                        recycler_view.setLayoutManager(gridLayoutManager);
                       adapter.notifyDataSetChanged();
                    }

                }

        });


    }

    @Override
    public void showData(final List<Bean.ResultBean.NearbyCinemaListBean> message) {
        runOnUiThread(new Runnable() {

            @Override
            public void run() {
                //Toast.makeText(MainActivity.this, "message:" + message, Toast.LENGTH_SHORT).show();
                LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
                recycler_view.setLayoutManager(manager);
                adapter = new Adapter(MainActivity.this, message);
                recycler_view.setAdapter(adapter);

            }
        });
    }
}
