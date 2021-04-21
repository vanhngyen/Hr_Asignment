package com.example.hrassignment.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Inventory")
public class Inventory {

    @EmbeddedId
    private InventoryID id;

    @ManyToOne
    @MapsId("wareHouseId")
    @JoinColumn(name = "wareHouseId")
    private WareHouse wareHouse;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "productId")
    private ProductInformation product;

    @Column(name = "qtyOnHand")
    private int qtyOnHand;

    public Inventory (WareHouse wareHouse, ProductInformation product, int qtyOnHand) {
        this.id = new InventoryID(wareHouse.getWareHoseId(), product.getProductId());
        this.wareHouse = wareHouse;
        this.product = product;
        this.qtyOnHand = qtyOnHand;
    }
}
