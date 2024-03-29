package io.webguru.fieldpickup.POJO;

import java.io.Serializable;

/**
 * Created by yatin on 21/01/17.
 */

public class FieldData implements Serializable{
    private Long id;
    private String isSameProduct;
    private int quantity;
    private String isAllPartsAvailable;
    private String isIssueCategoryCorrect;
    private String isProductClean;
    private String agentRemarks;
    private Long docketId;
    private int productId;
    private String rescheduleDate;
    private String status;
    private String isDamaged;
    private Integer isQcCleared;

    public FieldData(String isSameProduct, int quantity, String isAllPartsAvailable, String isIssueCategoryCorrect,
                     String isProductClean, String agentRemarks, Long docketId, String isDamaged,
                     Integer isQcCleared, int productId) {
        this.isSameProduct = isSameProduct;
        this.quantity = quantity;
        this.isAllPartsAvailable = isAllPartsAvailable;
        this.isIssueCategoryCorrect = isIssueCategoryCorrect;
        this.isProductClean = isProductClean;
        this.agentRemarks = agentRemarks;
        this.docketId = docketId;
        this.isDamaged = isDamaged;
        this.isQcCleared = isQcCleared;
        this.productId = productId;
    }

    public FieldData() {
    }

    public String getIsSameProduct() {
        return isSameProduct;
    }

    public void setIsSameProduct(String sameProduct) {
        isSameProduct = sameProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getIsAllPartsAvailable() {
        return isAllPartsAvailable;
    }

    public void setIsAllPartsAvailable(String allPartsAvailable) {
        isAllPartsAvailable = allPartsAvailable;
    }

    public String getIsIssueCategoryCorrect() {
        return isIssueCategoryCorrect;
    }

    public void setIsIssueCategoryCorrect(String issueCategoryCorrect) {
        isIssueCategoryCorrect = issueCategoryCorrect;
    }

    public String getIsProductClean() {
        return isProductClean;
    }

    public void setIsProductClean(String productDirty) {
        isProductClean = productDirty;
    }

    public String getAgentRemarks() {
        return agentRemarks;
    }

    public void setAgentRemarks(String agentRemarks) {
        this.agentRemarks = agentRemarks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDocketId() {
        return docketId;
    }

    public void setDocketId(Long docketId) {
        this.docketId = docketId;
    }

    public String getRescheduleDate() {
        return rescheduleDate;
    }

    public void setRescheduleDate(String rescheduleDate) {
        this.rescheduleDate = rescheduleDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIsDamaged() {
        return isDamaged;
    }

    public void setIsDamaged(String isDamaged) {
        this.isDamaged = isDamaged;
    }

    public Integer getIsQcCleared() {
        return isQcCleared;
    }

    public void setIsQcCleared(Integer isQcCleared) {
        this.isQcCleared = isQcCleared;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", isSameProduct='" + isSameProduct + '\'' +
                ", quantity=" + quantity +
                ", isAllPartsAvailable='" + isAllPartsAvailable + '\'' +
                ", isIssueCategoryCorrect='" + isIssueCategoryCorrect + '\'' +
                ", isProductClean='" + isProductClean + '\'' +
                ", agentRemarks='" + agentRemarks + '\'' +
                ", docketId=" + docketId +
                ", rescheduleDate='" + rescheduleDate + '\'' +
                ", status='" + status + '\'' +
                ", isDamaged='" + isDamaged + '\'' +
                ", isQcCleared='" + isQcCleared + '\'' +
                '}';
    }
}
