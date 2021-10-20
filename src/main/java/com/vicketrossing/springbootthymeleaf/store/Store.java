package com.vicketrossing.springbootthymeleaf.store;

import javax.persistence.*;

@Entity
@Table(name="store")
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "type", nullable = false, unique = false)
    private String type;

    @Column(name = "name", nullable = false, unique = false)
    private String name;

    @Column(name = "description", nullable = false, unique = false)
    private String description;

    @Column(name = "stock", nullable = false, unique = false)
    private int stock;

    @Column(name = "price", nullable = false, unique = false)
    private double price;

    @Column(name = "in_stock", nullable = false, unique = false)
    private boolean in_stock;




    public Store(String type, String name, String description, int stock, double price, boolean in_stock) {
        this.type = type;
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.price = price;
        this.in_stock = in_stock;
    }

    public Store(){}




    public Store(Long id, String type, String name, String description, int stock, double price, boolean in_stock){
        this.setId(id);
        this.setType(type);
        this.setName(name);
        this.setDescription(description);
        this.setStock(stock);
        this.setPrice(price);
        this.setIn_stock(in_stock);
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isIn_stock() {
        return in_stock;
    }

    public void setIn_stock(boolean in_stock) {
        this.in_stock = in_stock;
    }



    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                ", in_stock=" + in_stock +
                '}';
    }
}
