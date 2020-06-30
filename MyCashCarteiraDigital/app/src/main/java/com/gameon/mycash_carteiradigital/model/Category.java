package com.gameon.mycash_carteiradigital.model;

import java.io.Serializable;

public class Category implements Serializable {

    private Long idCategory;
    private String nameCategory;
    private String typeCategory;

    public Category(Long idCategory, String nameCategory, String typeCategory) {
        this.idCategory = idCategory;
        this.nameCategory = nameCategory;
        this.typeCategory = typeCategory;
    }

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getTypeCategory() {
        return typeCategory;
    }

    public void setTypeCategory(String typeCategory) {
        this.typeCategory = typeCategory;
    }
}
