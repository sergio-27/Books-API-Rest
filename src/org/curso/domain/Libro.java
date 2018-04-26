package org.curso.domain;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Libro {

    private int id = ++contador;
    private String titulo;
    private String descripcion;
    private Double precio;

    public static int contador;

    public Libro(){}

    public Libro (String titulo, String descripcion, Double precio) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getPrecio() {
        return precio;
    }
}
