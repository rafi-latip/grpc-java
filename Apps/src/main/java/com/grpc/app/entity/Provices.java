package com.grpc.app.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Setter
@Getter
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PROVICES", schema = "public")
public class Provices implements Serializable {
    @Id
    @Column(name = "provice_code", nullable = false, length = 10)
    private String proviceCode;

    @Column(name = "provice_name", nullable = false, length = 100)
    private String proviceName;

    @Column(name = "latitude", nullable = false, length = 30)
    private String latitude;

    @Column(name = "longitude", nullable = false, length = 30)
    private String longitude;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

}
