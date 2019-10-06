package com.giant.cloud.soap.model;

import java.io.Serializable;
import java.util.Calendar;

public class CustSerialNo implements Serializable {

    private String backWheel;

    private String custId;

    private String custPart;

    private String frontWheel;

    private String lindId;

    private Calendar onBoardDate;

    private String PO;

    private Calendar PTDate;

    private Calendar PTQRDate;

    private Calendar prodDate;

    private String prodFact;

    private String QRWeb;

    private String frno;

    private Integer isdownload;

    private String mo;

    private String partno;

    private String security_code;

    public CustSerialNo() {
    }

    public CustSerialNo(
            String backWheel,
            String custId,
            String custPart,
            String frontWheel,
            String lindId,
            Calendar onBoardDate,
            String PO,
            Calendar PTDate,
            Calendar PTQRDate,
            Calendar prodDate,
            String prodFact,
            String QRWeb,
            String frno,
            Integer isdownload,
            String mo,
            String partno,
            String security_code) {
        this.backWheel = backWheel;
        this.custId = custId;
        this.custPart = custPart;
        this.frontWheel = frontWheel;
        this.lindId = lindId;
        this.onBoardDate = onBoardDate;
        this.PO = PO;
        this.PTDate = PTDate;
        this.PTQRDate = PTQRDate;
        this.prodDate = prodDate;
        this.prodFact = prodFact;
        this.QRWeb = QRWeb;
        this.frno = frno;
        this.isdownload = isdownload;
        this.mo = mo;
        this.partno = partno;
        this.security_code = security_code;
    }

    public String getBackWheel() {
        return backWheel;
    }

    public void setBackWheel(String backWheel) {
        this.backWheel = backWheel;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustPart() {
        return custPart;
    }

    public void setCustPart(String custPart) {
        this.custPart = custPart;
    }

    public String getFrontWheel() {
        return frontWheel;
    }

    public void setFrontWheel(String frontWheel) {
        this.frontWheel = frontWheel;
    }

    public String getLindId() {
        return lindId;
    }

    public void setLindId(String lindId) {
        this.lindId = lindId;
    }

    public Calendar getOnBoardDate() {
        return onBoardDate;
    }

    public void setOnBoardDate(Calendar onBoardDate) {
        this.onBoardDate = onBoardDate;
    }

    public String getPO() {
        return PO;
    }

    public void setPO(String PO) {
        this.PO = PO;
    }

    public Calendar getPTDate() {
        return PTDate;
    }

    public void setPTDate(Calendar PTDate) {
        this.PTDate = PTDate;
    }

    public Calendar getPTQRDate() {
        return PTQRDate;
    }

    public void setPTQRDate(Calendar PTQRDate) {
        this.PTQRDate = PTQRDate;
    }

    public Calendar getProdDate() {
        return prodDate;
    }

    public void setProdDate(Calendar prodDate) {
        this.prodDate = prodDate;
    }

    public String getProdFact() {
        return prodFact;
    }

    public void setProdFact(String prodFact) {
        this.prodFact = prodFact;
    }

    public String getQRWeb() {
        return QRWeb;
    }

    public void setQRWeb(String QRWeb) {
        this.QRWeb = QRWeb;
    }

    public String getFrno() {
        return frno;
    }

    public void setFrno(String frno) {
        this.frno = frno;
    }

    public Integer getIsdownload() {
        return isdownload;
    }

    public void setIsdownload(Integer isdownload) {
        this.isdownload = isdownload;
    }

    public String getMo() {
        return mo;
    }

    public void setMo(String mo) {
        this.mo = mo;
    }

    public String getPartno() {
        return partno;
    }

    public void setPartno(String partno) {
        this.partno = partno;
    }

    public String getSecurity_code() {
        return security_code;
    }

    public void setSecurity_code(String security_code) {
        this.security_code = security_code;
    }
}
