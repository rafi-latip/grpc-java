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
@Table(name = "ACCESS_PATHS_API", schema = "public")
public class AccessPathsApi implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "access_path_api_id", nullable = false)
    private UUID accessPathApiId;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Roles roleId;

    //method ENUM (GET,POST, PUT, DELETE)
    public enum Method {
        GET, POST, PUT, DELETE
    }

    @Column(name = "method")
    private Method method;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}
