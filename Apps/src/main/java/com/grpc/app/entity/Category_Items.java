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
@Table(name = "CATEGORY_ITEM", schema = "public")
public class Category_Items implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "category_id", nullable = false)
    private UUID categoryId;

    @Column(name = "category_name", nullable = false, unique = true, length = 200)
    private String categoryName;

    @Column(name = "category_desc", nullable = true)
    private String categoryDesc;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}
