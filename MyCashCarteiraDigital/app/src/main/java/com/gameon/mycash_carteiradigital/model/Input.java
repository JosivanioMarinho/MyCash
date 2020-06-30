package com.gameon.mycash_carteiradigital.model;

import java.io.Serializable;

public class Input implements Serializable {

    private Long idInput;
    private String dateInput;
    private Double valueInput;
    private String descriptionInput;
    private Long idCategory;

    public Input(Long idInput, String dateInput, String descriptionInput, Double valueInput, Long idCategory) {
        this.idInput = idInput;
        this.dateInput = dateInput;
        this.descriptionInput = descriptionInput;
        this.valueInput = valueInput;
        this.idCategory = idCategory;
    }

    public Long getIdInput() {
        return idInput;
    }

    public void setIdInput(Long idInput) {
        this.idInput = idInput;
    }

    public String getDateInput() {
        return dateInput;
    }

    public void setDateInput(String dateInput) {
        this.dateInput = dateInput;
    }

    public String getDescriptionInput() {
        return descriptionInput;
    }

    public void setDescriptionInput(String descriptionInput) {
        this.descriptionInput = descriptionInput;
    }

    public Double getValueInput() {
        return valueInput;
    }

    public void setValueInput(Double valueInput) {
        this.valueInput = valueInput;
    }

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }
}
