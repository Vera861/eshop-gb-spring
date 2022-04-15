package ru.gb.controller.dto;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class BrandDto implements Serializable {

    private Long id;

    @NotBlank
    private String name;

    public BrandDto() {
    }

    public BrandDto(Long id) {
        this.id = id;
    }

    public BrandDto(Long id, @NotBlank String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
