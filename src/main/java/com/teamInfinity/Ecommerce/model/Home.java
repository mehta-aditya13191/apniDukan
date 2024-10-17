package com.teamInfinity.Ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private List<HomeCategory> grid;
    private List<HomeCategory> shopByCategories;

    private List<HomeCategory> electricCategories;
    private List<HomeCategory> dealCategories;


    private List<Deal> deals;
}
