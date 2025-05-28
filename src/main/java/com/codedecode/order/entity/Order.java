package com.codedecode.order.entity;

import com.codedecode.order.dto.FoodItemDTO;
import com.codedecode.order.dto.RestaurantDTO;
import com.codedecode.order.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("order")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
    private Integer orderId;
    private List<FoodItemDTO> foodItemListDTO;
    private RestaurantDTO restaurantDTO;
    private UserDTO userDTO;
}
