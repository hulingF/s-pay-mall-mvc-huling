package com.huling.common.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class Constants {

    public final static String SPLIT = ",";

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public enum ResponseCode {
        SUCCESS("0000", "调用成功"),
        UN_ERROR("0001", "调用失败"),
        ILLEGAL_PARAMETER("0002", "非法参数"),
        NO_LOGIN("0003", "未登录"),
        ;

        private String code;
        private String info;

    }

    @Getter
    @AllArgsConstructor
    public enum OrderStatusEnum {

        CREATE("CREATE", "创建流水单完成"),
        PAY_WAIT("PAY_WAIT", "创建支付单完成"),
        PAY_SUCCESS("PAY_SUCCESS", "用户支付成功"),
        DEAL_DONE("DEAL_DONE", "交易完成"),
        CLOSE("CLOSE", "超时关单"),
        ;

        private final String code;
        private final String desc;

    }

}
