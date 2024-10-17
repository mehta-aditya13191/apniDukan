package com.teamInfinity.Ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String code;
    private double discountPercentage;
    private LocalDate validityStartDate;
    private LocalDate validityaEndDate;
    private double minimumOrderValue;

    private boolean isActive=true;

   @ManyToMany(mappedBy = "usedCoupons")
   private Set<User>usedByUsers=new HashSet<>();
}
