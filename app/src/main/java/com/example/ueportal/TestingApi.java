package com.example.ueportal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ueportal.Api.RegisterApi;
import com.example.ueportal.Models.RegisterModel;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class TestingApi extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testing_api);

        listView = findViewById(R.id.listView);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RegisterApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        try{
            RegisterApi registerApi = retrofit.create(RegisterApi.class);
            Call<List<RegisterModel>> call = registerApi.getHeroes();
            Toast.makeText(TestingApi.this, "call:" + call, Toast.LENGTH_LONG).show();
            call.enqueue(new Callback<List<RegisterModel>>() {
                @Override
                public void onResponse(Call<List<RegisterModel>> call, Response<List<RegisterModel>> response) {
                    Log.d("before coming Response:", "response is:" + response);
                    List<RegisterModel> registerObject = response.body();
                    Log.d("after coming Response:", "response is:" + registerObject);
                    Toast.makeText(TestingApi.this, "in response:", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onFailure(Call<List<RegisterModel>> call, Throwable t) {
                    Toast.makeText(TestingApi.this, "in failure:", Toast.LENGTH_SHORT).show();
                }
            });
        }catch (Exception e){
            Toast.makeText(TestingApi.this, "error: " + e, Toast.LENGTH_SHORT).show();
        }

    }
}
