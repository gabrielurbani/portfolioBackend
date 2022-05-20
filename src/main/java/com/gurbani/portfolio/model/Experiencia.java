package com.gurbani.portfolio.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String cliente;
    private String descripcion;
    private String fecha;
    private String url_cliente;
    private String tecnologias;
    private String img;
   
     public Experiencia() {
    }

    public Experiencia(Long id, String cliente, String descripcion, String fecha, String url_cliente, String tecnologias,  String img) {
        this.id = id;
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.url_cliente = url_cliente;
        this.tecnologias = tecnologias;
        this.img = img;
    }
   
}
