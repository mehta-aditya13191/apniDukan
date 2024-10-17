package com.teamInfinity.Ecommerce.model;

import com.teamInfinity.Ecommerce.domain.HomeCategorySection;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class HomeCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String image;
    private String categoryId;
    private HomeCategorySection categorySection;



}


//@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@EqualsAndHashCode
//public class HomeCategory {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    private String name;
//    private String image;
//    private String categoryId;
//
//    @Enumerated(EnumType.STRING)  // or EnumType.ORDINAL depending on how you want it stored
//    private HomeCategorySection section;
//}
