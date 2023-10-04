package me.HenriqueGouveia1.Santander.Bootcamp.Java.API.Domain.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_barItem")
public class BarItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String URi;
    private String name;
    private int quantity;

    public String getURi() {
        return URi;
    }

    public void setURi(String URi) {
        this.URi = URi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
