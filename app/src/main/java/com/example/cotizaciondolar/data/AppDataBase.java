package com.example.cotizaciondolar.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.cotizaciondolar.data.dao.CotizacionDao;
import com.example.cotizaciondolar.data.entity.CotizacionEntity;

@Database(entities = {
        CotizacionEntity.class
}, version = 2)
public abstract class AppDataBase extends RoomDatabase {
    public abstract CotizacionDao cotizacionDao();
}
