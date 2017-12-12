package com.example.javi.javiervivesurbina;

/**
 * Created by Javi on 12/12/2017.
 */

public class Producto {
    private String nombreProducto,descripción;
    private int idProducto,imagen;
    private double precio;

    public Producto (int idProducto, String nombreProducto, int imagen, double precio, String descripción) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.imagen = imagen;
        this.precio = precio;
        this.descripción = descripción;
    }

    public int getIdProducto(){return idProducto;}

    public void setIdProducto(int idProducto) {this.idProducto = idProducto;}

    public String getNombreProducto(){return  nombreProducto;}

    public void setNombreProducto(String nombreProducto) {this.nombreProducto = nombreProducto;}

    public int getImagen() {return imagen;}

    public void setImagen(int imagen){this.imagen = imagen;}

    public double getPrecio(){return precio;}

    public void setPrecio(double precio) {this.precio = precio;}

    public String getDescripción() {return descripción;}

    public void setDescripción(String descripción) {this.descripción = descripción;}

}
