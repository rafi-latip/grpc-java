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
@Table(name = "logers", schema = "public")
public class Logers implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private UUID longerId;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users users;

    @Column(name = "user_agent", nullable = false, length = 255)
    private String userAgent;

    @Column(name = "user_agent_code", nullable = false, length = 8)
    private String userAgentCode;

    @Column(name = "agent")
    private Boolean agent;

    @Column(name = "access_token")
    private String accessToken;

    @Column(name = "refresh_token")
    private String refreshToken;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

}
