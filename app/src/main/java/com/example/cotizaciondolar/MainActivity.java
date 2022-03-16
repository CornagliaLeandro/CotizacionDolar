package com.example.cotizaciondolar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.cotizaciondolar.data.datasource.ApiAdapter;
import com.example.cotizaciondolar.data.dto.CotizacionDTO;
import com.example.cotizaciondolar.data.repository.CotizacionRepository;
import com.example.cotizaciondolar.ui.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<List<CotizacionDTO>> {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CotizacionRepository().getCotizacionHoy(this);

        recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void onResponse(Call<List<CotizacionDTO>> call, Response<List<CotizacionDTO>> response) {
        if(response.isSuccessful()){
            List<CotizacionDTO> cotizaciones = response.body();
            List<String> resumenes = new ArrayList<>();

            for (CotizacionDTO coti: cotizaciones) {
                resumenes.add("Casa: " + coti.casa.nombre + " \n" +
                                "Compra: " + coti.casa.compra + " - " + "Venta: " + coti.casa.venta);
            }

            recyclerView.setAdapter(new RecyclerAdapter(getApplicationContext(),resumenes));


        }
    }

    @Override
    public void onFailure(Call<List<CotizacionDTO>> call, Throwable t) {

    }
}