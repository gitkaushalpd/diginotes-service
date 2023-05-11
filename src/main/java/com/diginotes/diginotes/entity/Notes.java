package com.diginotes.diginotes.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.Id;
@NoArgsConstructor
@Entity
@Table(name="Notes")
public class Notes {

    // define properties
     @Id
     @GeneratedValue(strategy =GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "text")
    private String text;

    // define constructor

    public Notes( String name, String text) {
        this.name = name;
        this.text = text;
    }

    // define getter and setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    // define to string

    @Override
    public String toString() {
        return "Notes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
