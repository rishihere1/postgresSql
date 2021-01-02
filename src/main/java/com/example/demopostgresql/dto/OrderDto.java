package com.example.demopostgresql.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author rishi - created on 02/01/21
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

  private String customerName;
  private String productId;
  private int speedPriority;
  private int quantity;
}
