package com.grpc.app.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemListDTO {

    private String itemCode;

    private String itemName;

    private Double itemPrice;

    private Double itemTotal;

    private String createdAt;

    private String updatedAt;

    private List<ShopDTO>shopDTO;

    private List<CategoryDTO>categoryDTO;



}
