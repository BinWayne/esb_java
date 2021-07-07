package com.ncbank.esb.esb.domain;

import lombok.Data;

@Data
public class Overview {
    private String bigCategory;
    private String subCategory ;
    private String svcCode ;
    private String svcName ;
    private String sceneCode;
    private String sceneName ;
    private String tradeCode;
    private String tradeName;
    private String consumer;
    private String provider;
    private String status ;
    private String remarks ;
    private Integer id;
}
