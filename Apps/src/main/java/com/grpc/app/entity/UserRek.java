package com.grpc.app.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Setter
@Getter
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USERS_REK", schema = "public")
public class UserRek implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "user_rek_id", nullable = false)
    private UUID userRekId;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users users;

    @Column(name = "NOREK", unique = true, nullable = false, length = 80)
    private String noRek;

    @Column(name = "total_saldo", nullable = false)
    private BigDecimal totalSaldo;

    @Column(name = "total_point", nullable = false)
    private BigDecimal totalPoint;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}
