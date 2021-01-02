package com.example.demopostgresql.dto;

import java.util.Date;

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
public class OrderDetailsDto {

  private String customerName;
  private String contactName;
  private String address;
  private String city;
  private String postalCode;
  private String country;
  private Date orderDate;
  private long quantity;
  private String lastName;
  private String firstName;
  private Date birthDate;
  private String photo;
  private String notes;
  private int task;
  private String productName;
  private String unit;
  private double price;
  private String shipperName;
  private String phoneNumber;
  private int priority;
}
