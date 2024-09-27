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
@Table(name = "DISTRICTS_OR_CITY", schema = "public")
public class DistrictsOrCity implements Serializable {

    @Id
    @Column(name = "district_or_city_code", nullable = false, length = 10)
    private String districtOrCityCode;

    @Column(name = "district_or_city_name", nullable = false, length = 100)
    private String districtOrCityName;

    @ManyToOne
    @JoinColumn(name = "provice_code", nullable = false)
    private Provices proviceCode;

    @Column(name = "latitude", nullable = false, length = 30)
    private String latitude;

    @Column(name = "longitude", nullable = false, length = 30)
    private String longitude;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}
