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
@Table(name = "BRACNH_SHOP", schema = "public")
public class BranchShop implements Serializable {

    @Id
    @Column(name = "branch_shop_code", nullable = false, length = 60)
    private String branchShopCode;

    @ManyToOne
    @JoinColumn(name = "district_or_city_code", nullable = false)
    private DistrictsOrCity districtOrCityCode;

    @Column(name = "branch_shop_phone_number", nullable = false, length = 20)
    private String branchShopPhoneNumber;

    @Column(name = "branch_shop_desc", nullable = true, length = 200)
    private String branchShopDesc;

    @Column(name = "branch_shop_address", nullable = false)
    private String branchShopAddress;

    @Column(name = "latitude", nullable = false, length = 30)
    private String latitude;

    @Column(name = "longitude", nullable = false, length = 30)
    private String longitude;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}
