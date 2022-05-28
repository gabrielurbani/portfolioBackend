package com.gurbani.portfolio.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class About {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    @Basic
    private String name;
    private String title;
    private String about_text;
    private String img_avatar;

    public About() {
    }

    public About(Long id, String name, String title, String about_text, String img_avatar) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.about_text = about_text;
        this.img_avatar = img_avatar;
    }

}
