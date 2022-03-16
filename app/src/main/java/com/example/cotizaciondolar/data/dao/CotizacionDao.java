package com.example.cotizaciondolar.data.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.cotizaciondolar.data.entity.CotizacionEntity;

import java.util.List;

@Dao
public interface CotizacionDao {
    @Query("SELECT * FROM CotizacionEntity")
    List<CotizacionEntity> getAll();

    @Insert
    void insert(CotizacionEntity cotizacion);

    @Delete
    void delete(CotizacionEntity cotizacion);
}
