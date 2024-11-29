package com.huling.service;

import com.huling.domain.req.ShopCartReq;
import com.huling.domain.res.PayOrderRes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IOrderService {

    PayOrderRes createOrder(ShopCartReq shopCartReq) throws Exception;

    void changeOrderPaySuccess(String orderId);

    List<String> queryNoPayNotifyOrderList();

    List<String> queryTimeoutCloseOrderList();

    boolean changeOrderClose(String orderId);

}
