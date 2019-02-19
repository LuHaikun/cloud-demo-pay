package com.cloud.pay.impl;

import com.cloud.bean.PayResponse;
import com.cloud.bean.PayResquest;
import com.cloud.pay.AbstractBasePay;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2018/12/20 9:21 AM
 * @Description:
 * @Created with cloud-demo-pay
 * @Version: 1.0
 */
public class WechatPay extends AbstractBasePay {

    @Override
    protected void prePay() {
        System.out.println("微信支付前置接口实现");
    }

    @Override
    protected void postPay() {
        System.out.println("微信支付后置接口实现");
    }

    @Override
    public PayResponse pay(PayResquest payResquest) {
        System.out.println("微信支付接口调用实现");
        return null;
    }

}
