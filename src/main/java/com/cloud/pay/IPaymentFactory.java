package com.cloud.pay;

import com.cloud.pay.impl.AliPay;
import com.cloud.pay.impl.ApplePay;
import com.cloud.pay.impl.WechatPay;

/**
 * @Created with IntelliJ IDEA.
 * @Description: cloud-demo-pay
 * @Author: luhk
 * @Date: 2018-12-20
 * @Time: 9:59 AM
 * @Version: 1.0
 */
public interface IPaymentFactory {
    public AliPay createAlipay();
    public WechatPay createWechatPay();
    public ApplePay createApplePay();
}
