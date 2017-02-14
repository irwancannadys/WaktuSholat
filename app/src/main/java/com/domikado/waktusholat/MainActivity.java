package com.domikado.waktusholat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.domikado.waktusholat.model.Example;
import com.domikado.waktusholat.services.ApiServices;

import java.util.Calendar;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String URL = "http://ibacor.com/";

    private Button btn;
    private EditText edittext;
    String d,e,f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        edittext = (EditText) findViewById(R.id.editText);

        Calendar calendar = Calendar.getInstance();
        int a = calendar.get(Calendar.YEAR);
        int b = calendar.get(Calendar.MONTH);
        int z = b + 1;
        int c = calendar.get(Calendar.DATE);
        d = String.valueOf(a);
        e = String.valueOf(z);
        f = String.valueOf(c);
        Log.d("tanggal", d + e + f);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getData();
            }
        });

    }

    private void getData(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        String lokasi = edittext.getText().toString();
        ApiServices apiServices = retrofit.create(ApiServices.class);
        Call<Example> call = apiServices.getData(lokasi,d,e,f);
        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {

                String a = response.body().getResult().getFajr();
                String b = response.body().getResult().getDhuhr();
                Toast.makeText(MainActivity.this, "waktu : " + a,  Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "waktu : " + b,  Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {

            }
        });

    }
}
