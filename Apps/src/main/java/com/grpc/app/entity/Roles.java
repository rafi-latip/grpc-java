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
@Table(name = "ROLES", schema = "public")
public class Roles implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "role_id", nullable = false)
    private UUID roleId;

    @Column(name = "role_name", nullable = false, length = 80)
    private String roleName;

    @Column(name = "role_status")
    private Boolean roleStatus;

//    public enum RoleStatus {
//        Enable,Disable
//    }
//    @Column(name = "role_status")
//    private RoleStatus roleStatus;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}
