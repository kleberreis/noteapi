package br.com.kandrade.noteapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Nota {
    @Id
    private String id;
    private String titulo;
    private String texto;

    public Nota(String id, String titulo, String texto) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
    }

    public Nota(){
        super();
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
