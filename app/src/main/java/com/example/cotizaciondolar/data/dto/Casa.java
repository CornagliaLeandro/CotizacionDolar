package com.example.cotizaciondolar.data.dto;

public class Casa {
    public String compra;
    public String venta;
    public int agencia;
    public String nombre;
    public String decimales;
    public boolean mejor_compra;
    public boolean mejor_venta;

    public Casa() {
    }

    public Casa(String compra, String venta, int agencia, String nombre, String decimales, boolean mejor_compra, boolean mejor_venta) {
        this.compra = compra;
        this.venta = venta;
        this.agencia = agencia;
        this.nombre = nombre;
        this.decimales = decimales;
        this.mejor_compra = mejor_compra;
        this.mejor_venta = mejor_venta;
    }
}
