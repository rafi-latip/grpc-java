package com.grpc.app.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Setter
@Getter
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USERS", schema = "public")
public class Users implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "user_id", nullable = false)
    private UUID userId;

    //id_role //fk
    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Roles roleId;

    //code_district //fk
    @ManyToOne
    @JoinColumn(name = "district_or_city_code", nullable = false)
    private DistrictsOrCity districtOrCityCode;

    //shop_code //fk
    @ManyToOne
    @JoinColumn(name = "branch_shop_code", nullable = false)
    private BranchShop branchShopCode;

    @Column(name = "username", nullable = false, unique = true, length = 80)
    private String userName;

    @Column(name = "email", nullable = false, length = 80)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "photo", nullable = true)
    private String photo;

    @Column(name = "user_status")
    private Boolean userStatus;

    @Column(name = "address", nullable = true)
    private String address;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

}

