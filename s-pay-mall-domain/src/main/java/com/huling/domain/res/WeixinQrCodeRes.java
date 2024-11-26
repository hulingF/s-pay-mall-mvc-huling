package com.huling.domain.res;

import lombok.Data;

@Data
public class WeixinQrCodeRes {

    private String ticket;
    private Long expire_seconds;
    private String url;

}
