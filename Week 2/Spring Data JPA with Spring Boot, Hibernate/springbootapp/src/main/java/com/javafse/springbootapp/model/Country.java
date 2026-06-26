package com.javafse.springbootapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
    /*
        Table: Country
        Column: [
            "code": varchar(2) PRIMARY KEY
            "name": varchar(50)        
        ]
    */
    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    /*
        Getters and Setters for Attributes
    */
    public void setCode(String code) { this.code = code; }
    public String getCode() { return this.code; }

    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }

    /*
        Convert to String
    */
    @Override
    public String toString() {
        return "Country: "+this.name+", "+"Code: "+this.code;
    }
}
