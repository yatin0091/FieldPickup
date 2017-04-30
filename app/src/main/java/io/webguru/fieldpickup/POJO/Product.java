package io.webguru.fieldpickup.POJO;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;

import io.webguru.fieldpickup.ApiHandler.dto.QcQuestionDTO;

/**
 * Created by yatin on 20/03/17.
 */

public class Product implements Serializable{
//    private int id;
    @JsonIgnore
    private FieldData fieldData;
    private String description;
    private String reason;
    private Integer quantity;
    private String productId;
    private String image1;
    private String image2;
    private String image3;
    private String remarks;
    private List<QcQuestionDTO> qcQuestions;

    public Product( FieldData fieldData, String description, String reason, Integer quantity, String productId, List<QcQuestionDTO> qcQuestions) {
//        this.id = id;
        this.fieldData = fieldData;
        this.description = description;
        this.reason = reason;
        this.quantity = quantity;
        this.productId = productId;
        this.qcQuestions = qcQuestions;
    }

    public Product() {
    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public FieldData getFieldData() {
        return fieldData;
    }

    public void setFieldData(FieldData fieldData) {
        this.fieldData = fieldData;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public List<QcQuestionDTO> getQcQuestions() {
        return qcQuestions;
    }

    public void setQcQuestions(List<QcQuestionDTO> qcQuestions) {
        this.qcQuestions = qcQuestions;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
