package com.example.stockofsocks.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocksDto {

    private long id;
    private String color;
    @Min(0)
    @Max(100)
    private int cottonPart;
    @Min(0)
    private int quantity;
}

