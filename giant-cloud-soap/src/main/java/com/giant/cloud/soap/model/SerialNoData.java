package com.giant.cloud.soap.model;

import java.io.Serializable;
import java.util.Calendar;

public class SerialNoData implements Serializable {

    private SerialNoData[] listComponentsSerialNoData;

    private Calendar PKProdDate;

    private String serialNo;

    private Integer serialType;

    public SerialNoData() {
    }

    public SerialNoData(
            SerialNoData[] listComponentsSerialNoData,
            Calendar PKProdDate,
            String serialNo,
            Integer serialType) {
        this.listComponentsSerialNoData = listComponentsSerialNoData;
        this.PKProdDate = PKProdDate;
        this.serialNo = serialNo;
        this.serialType = serialType;
    }

    public SerialNoData[] getListComponentsSerialNoData() {
        return listComponentsSerialNoData;
    }

    public void setListComponentsSerialNoData(SerialNoData[] listComponentsSerialNoData) {
        this.listComponentsSerialNoData = listComponentsSerialNoData;
    }

    public Calendar getPKProdDate() {
        return PKProdDate;
    }

    public void setPKProdDate(Calendar PKProdDate) {
        this.PKProdDate = PKProdDate;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public Integer getSerialType() {
        return serialType;
    }

    public void setSerialType(Integer serialType) {
        this.serialType = serialType;
    }
}
