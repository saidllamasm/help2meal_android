package com.itcg.help2meal;

public class Ingrediente {

    private int id;
    private String nombre;
    private String unidad;

    public String getUrl_imagen() {
        return url_imagen;
    }

    public void setUrl_imagen(String url_imagen) {
        this.url_imagen = url_imagen;
    }

    private String url_imagen;
    private int caducidad;
    private int clasificacion_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public int getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(int caducidad) {
        this.caducidad = caducidad;
    }

    public int getClasificacion_id() {
        return clasificacion_id;
    }

    public void setClasificacion_id(int clasificacion_id) {
        this.clasificacion_id = clasificacion_id;
    }

    public Ingrediente(int id, String nombre, String unidad, int caducidad, int clasificacion_id, String url_imagen){
        this.id = id;
        this.nombre = nombre;
        this.unidad = unidad;
        this.caducidad = caducidad;
        this.clasificacion_id = clasificacion_id;
        this.url_imagen = url_imagen;
    }

    public int getImageResourceId(){
        return 0;
    }

}
