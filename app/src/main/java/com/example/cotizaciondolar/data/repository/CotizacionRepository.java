package com.example.cotizaciondolar.data.repository;

import android.content.Context;

import androidx.room.Room;

import com.example.cotizaciondolar.data.datasource.ApiAdapter;
import com.example.cotizaciondolar.data.datasource.ApiService;
import com.example.cotizaciondolar.data.dto.CotizacionDTO;
import com.example.cotizaciondolar.data.entity.CotizacionEntity;

import java.util.List;

import retrofit2.Callback;

public class CotizacionRepository {
    private final ApiService api;


    public CotizacionRepository() {
        this.api =  ApiAdapter.getApiService();
    }

    public void getCotizacionHoy(Callback<List<CotizacionDTO>> callback) {
        api.getCasas().enqueue(callback);
    }


}
