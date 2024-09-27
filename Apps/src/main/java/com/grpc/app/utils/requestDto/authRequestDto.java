package com.grpc.app.utils.requestDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class authRequestDto {
    private String userName;
    private String password;
    private String userAgent;
}
