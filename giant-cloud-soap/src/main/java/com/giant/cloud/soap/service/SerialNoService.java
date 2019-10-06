package com.giant.cloud.soap.service;

import com.giant.cloud.soap.model.CustSerialNo;
import com.giant.cloud.soap.model.SerialNoData;
import com.giant.cloud.soap.model.SerialNoUpdateResult;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Calendar;

@WebService
public interface SerialNoService {

    @WebMethod
    public CustSerialNo[] getSerialNo(String custId, Calendar beginDate, Calendar endDate, Integer isDownloaded);

    @WebMethod
    public CustSerialNo getSerialNoBySerialNo(String serialNo);

    @WebMethod
    public SerialNoUpdateResult updateSerialFlag(String[] listSerialNo);

    @WebMethod
    public SerialNoData getSerialNoDataBySerialNo(String serialno);

    @WebMethod
    public SerialNoData getCadexDataBySerialNo(String serialno);

    @WebMethod
    public String EVBikeSerialData(String serialno);
}
