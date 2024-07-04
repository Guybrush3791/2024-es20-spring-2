package org.java.spring_test2.geometry.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Circle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {

        setRadius(radius);
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public double getArea() {

        return Math.PI * getRadius() * getRadius();
    }

    public double getPerimetro() {

        return 2 * Math.PI * getRadius();
    }

    @Override
    public String toString() {

        return "Circle [radius=" + getRadius() + ", area=" + getArea() + ", perimetro=" +
                getPerimetro() + "]";
    }
}
