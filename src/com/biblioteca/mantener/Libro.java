package com.biblioteca.mantener;

public class Libro extends General{
    private int edicion;
    private int añoPublicacion;
    private Autor autor;

    public Libro() {

    }

    public Libro(int edicion, int añoPublicacion, Autor autor) {
        this.edicion = edicion;
        this.añoPublicacion = añoPublicacion;
        this.autor = autor;
    }
}
