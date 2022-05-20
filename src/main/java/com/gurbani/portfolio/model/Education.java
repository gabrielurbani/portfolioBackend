package com.gurbani.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Education {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String school;
    private String descripcion;
    private String fecha;
    private String url_school;
    private String img;

    public Education() {
    }

    public Education(Long id, String school, String descripcion, String fecha, String url_school, String img) {
        this.id = id;
        this.school = school;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.url_school = url_school;
        this.img = img;
    }
    
    

}
