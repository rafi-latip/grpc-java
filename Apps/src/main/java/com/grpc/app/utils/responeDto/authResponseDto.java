package com.grpc.app.utils.responeDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class authResponseDto {
    private String accessToken;
    private String refreshToken;
}
