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
@Table(name = "SPESIFICATION_ITEMS", schema = "public")
public class SpesificationItems implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "spesification_item", nullable = false)
    private UUID spesificationItem;

    @ManyToOne
    @JoinColumn(name = "item_code", nullable = false)
    private Items itemCode;

    @Column(name = "spesification_header", nullable = false, length = 80)
    private String spesification_header;

    @Column(name = "spesification_value", nullable = false, length = 200)
    private String spesificationValue;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}
