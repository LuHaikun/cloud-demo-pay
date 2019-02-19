package com.cloud.pay.impl;

import com.cloud.pay.IPaymentFactory;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2018/12/20 10:09 AM
 * @Description:
 * @Created with cloud-demo-pay
 * @Version: 1.0
 */
public class PaymentFactory implements IPaymentFactory {
    @Override
    public AliPay createAlipay() {
        return new AliPay();
    }

    @Override
    public WechatPay createWechatPay() {
        return new WechatPay();
    }

    @Override
    public ApplePay createApplePay() {
        return new ApplePay();
    }
}
