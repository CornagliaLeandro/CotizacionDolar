package com.example.cotizaciondolar.data.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class CotizacionEntity {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String fecha;
    public float compra;
    public float venta;
}
