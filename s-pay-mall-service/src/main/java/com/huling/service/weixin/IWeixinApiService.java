package com.huling.service.weixin;

import com.huling.domain.req.WeixinQrCodeReq;
import com.huling.domain.res.WeixinQrCodeRes;
import com.huling.domain.res.WeixinTokenRes;
import com.huling.domain.vo.WeixinTemplateMessageVO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface IWeixinApiService {

    // 获取Access Token
    @GET("cgi-bin/token")
    Call<WeixinTokenRes> getToken(@Query("grant_type") String grantType,
                                  @Query("appid") String appId,
                                  @Query("secret") String appSecret);

    // 获取二维码Ticket
    @POST("cgi-bin/qrcode/create")
    Call<WeixinQrCodeRes> createQrCodeTicket(@Query("access_token") String accessToken,
                                       @Body WeixinQrCodeReq weixinQrCodeReq);

    // 发送模板消息
    @POST("cgi-bin/message/template/send")
    Call<Void> sendMessage(@Query("access_token") String accessToken,
                           @Body WeixinTemplateMessageVO weixinTemplateMessageVO);

}
