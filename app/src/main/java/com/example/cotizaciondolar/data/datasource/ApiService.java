package com.example.cotizaciondolar.data.datasource;

import com.example.cotizaciondolar.data.dto.CotizacionDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("https://www.dolarsi.com/api/api.php?type=valoresprincipales")
    Call<List<CotizacionDTO>> getCasas();
}
