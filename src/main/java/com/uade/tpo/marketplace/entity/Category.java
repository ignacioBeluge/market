package com.uade.tpo.marketplace.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder // patron construir objetos

public class Category {
    private int id;
    private String description;
}
