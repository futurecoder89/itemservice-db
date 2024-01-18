package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity //jpa객체로 인정
public class Item {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)//pk // Identity는 DB에서 값을 가져오는 전략
    private Long id;

    @Column(name = "item_name", length = 10)
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
