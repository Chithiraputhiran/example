package com.app.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bikes")
public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Brand")
    private String brand;

    @Column(name = "Models")
    private String models;

    private String varient;

    public Bike() {

    }

    public Bike(String brand, String models, String varient) {
        super();
        this.brand = brand;
        this.models = models;
        this.varient = varient ;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModels() {
        return models;
    }
    public void setLastName(String lastName, String models) {
        this.models = models;
    }
    public String getVarient() {
        return varient;
    }
    public void setVarient(String varient) {
        this.varient = varient;
    }
}