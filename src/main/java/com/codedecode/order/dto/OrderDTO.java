package com.codedecode.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private Integer orderId;
    private List<FoodItemDTO> foodItemListDTO;
    private RestaurantDTO restaurantDTO;
    private UserDTO userDTO;
}
