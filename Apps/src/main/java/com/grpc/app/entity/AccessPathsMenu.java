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
@Table(name = "ACCESS_PATH_MENU", schema = "public")
public class AccessPathsMenu implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "access_path_menu_id", nullable = false)
    private UUID accessPathMenuId;

    @ManyToOne
    @JoinColumn(name = "path_menu_id", nullable = false)
    private PathsMenu pathMenuId;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Roles roleId;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}
