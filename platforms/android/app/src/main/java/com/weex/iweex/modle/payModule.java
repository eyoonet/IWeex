package com.weex.iweex.modle;

import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import com.weixin.pay.WXPay;

import org.json.JSONObject;

public class PayModule extends WXModule{
    public PayModule(){
    }
    @JSMethod
    public void wxPay(JSONObject jsonObject){
        WXPay wxPay=new WXPay(mWXSDKInstance.getContext(),"",false);
        wxPay.pay(jsonObject);
    }
    @JSMethod
    public void aliPay(JSONObject jsonObject){

    }
}
