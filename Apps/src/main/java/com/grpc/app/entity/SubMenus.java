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
@Table(name = "SUB_MENUS", schema = "public")
public class SubMenus implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "sub_menu_id", nullable = false)
    private UUID subMenuId;

    @Column(name = "sub_menu_name", nullable = false, length = 100)
    private String subMenuName;

    @ManyToOne
    @JoinColumn(name = "path_menu_id", nullable = false)
    private PathsMenu pathMenuId;

    @ManyToOne
    @JoinColumn(name = "menu_id", nullable = false)
    private Menus menuId;

    @Column(name = "icon", nullable = false, length = 30)
    private String icon;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}
