package com.grpc.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShopDTO {

    private String branchShopCode;

    private String branchShopPhoneNumber;

    private String branchShopDesc;

    private String branchShopAddress;

    private String latitude;

    private String longitude;

}
