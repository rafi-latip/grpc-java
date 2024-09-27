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
@Table(name = "IMAGE_ITEMS", schema = "public")
public class ImageItems implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "image_item_id", nullable = false)
    private UUID imageItemId;

    @ManyToOne
    @JoinColumn(name = "item_code", nullable = false)
    private Items itemCode;

    @Column(name = "image_value", nullable = false, length = 200)
    private String imageValue;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}
