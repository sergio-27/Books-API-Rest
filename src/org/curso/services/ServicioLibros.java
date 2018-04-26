package org.curso.services;


import org.curso.domain.Libro;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.Arrays;
import java.util.List;

//si en la url despues de /rest/gestion, se encargara esta clase
@Path("/gestion")
public class ServicioLibros {
    //clase que actua como api rest
    static List<Libro> LIBROS;
    //inicializador estatico
    {
        LIBROS = Arrays.asList(
                new Libro("libro 1", "libro 1 muy bueno", 20.0),
                new Libro("libro 2", "libro 2 really bueno", 20.0),
                new Libro("libro 3", "libro 3 really good", 20.0));
    }


    @GET //metodo para obtener todos los libros, con get hacemos
    @Produces(MediaType.APPLICATION_JSON) //con esto le decimos que nos retorne el array en JSON, AWESOME!!!!!
    //@Produces(MediaType.APPLICATION_XML)
    public List<Libro> getAllBooks(){
        return LIBROS;
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String altaLibro(Libro libro){
        LIBROS.add(libro);

        return "Book created motherfucker";
    }
}
