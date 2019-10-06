package com.giant.cloud.soap.model;

import java.io.Serializable;

public class SerialNoUpdateResult implements Serializable {

    private Integer faultCnt;

    private Integer noUpdateCnt;

    private Integer successCnt;

    private Integer totalCnt;

    public SerialNoUpdateResult() {
    }

    public SerialNoUpdateResult(
            Integer faultCnt,
            Integer noUpdateCnt,
            Integer successCnt,
            Integer totalCnt) {
        this.faultCnt = faultCnt;
        this.noUpdateCnt = noUpdateCnt;
        this.successCnt = successCnt;
        this.totalCnt = totalCnt;
    }

    public Integer getFaultCnt() {
        return faultCnt;
    }

    public void setFaultCnt(Integer faultCnt) {
        this.faultCnt = faultCnt;
    }

    public Integer getNoUpdateCnt() {
        return noUpdateCnt;
    }

    public void setNoUpdateCnt(Integer noUpdateCnt) {
        this.noUpdateCnt = noUpdateCnt;
    }

    public Integer getSuccessCnt() {
        return successCnt;
    }

    public void setSuccessCnt(Integer successCnt) {
        this.successCnt = successCnt;
    }

    public Integer getTotalCnt() {
        return totalCnt;
    }

    public void setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
    }
}
