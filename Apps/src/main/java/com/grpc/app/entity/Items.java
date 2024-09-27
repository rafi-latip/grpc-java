package com.grpc.app.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ITEMS", schema = "public")
public class Items implements Serializable {

    @Id
    @Column(name = "item_code", nullable = false, length = 100)
    private String itemCode;

    @ManyToOne
    @JoinColumn(name = "branch_shop_code", nullable = false)
    private BranchShop branchShopCode;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category_Items categoryId;

    @Column(name = "item_name", length = 200, nullable = false)
    private String itemName;

    @Column(name = "item_price", length = 200, nullable = false)
    private Double itemPrice;

    @Column(name = "item_total", length = 200, nullable = false)
    private Double itemTotal;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}
