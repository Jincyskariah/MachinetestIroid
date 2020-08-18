package com.example.machinetestiroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.machinetestiroid.model.Categories;
import com.example.machinetestiroid.retrofit.RetroConfig;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Categories categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview_categories);
        RetroConfig retroConfig=new RetroConfig();
        retroConfig.getApis().getcategories().enqueue(new Callback<Categories>() {
            @Override
            public void onResponse(Call<Categories> call, Response<Categories> response) {

                categories=response.body();

                GridLayoutManager layoutManager=new GridLayoutManager(getApplicationContext(),3);
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(new Adapter(categories,MainActivity.this));

            }

            @Override
            public void onFailure(Call<Categories> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
