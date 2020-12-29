package org.example.groov.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Temperature {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String temperature;
    private Date date;

public Temperature() {

}
    public Temperature(String temperature, Date date) {
        this.temperature = temperature.substring(0,4);
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
