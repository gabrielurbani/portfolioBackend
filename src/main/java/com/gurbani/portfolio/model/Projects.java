
package com.gurbani.portfolio.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    
    @Basic
    private String name;
    private String descripcion;
    private String fecha;
    private String url_project;
    private String img;

    public Projects() {
    }

    public Projects(Long id, String name, String descripcion, String fecha, String url_project, String img) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.url_project = url_project;
        this.img = img;
    }
    
}
