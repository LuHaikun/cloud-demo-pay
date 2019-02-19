package com.cloud.pay.impl;

import com.cloud.bean.PayResponse;
import com.cloud.bean.PayResquest;
import com.cloud.pay.AbstractForeignPay;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2018/12/20 9:33 AM
 * @Description:
 * @Created with cloud-demo-pay
 * @Version: 1.0
 */
public class ApplePay extends AbstractForeignPay {
    @Override
    protected String checkPay() {
        System.out.println("苹果支付前校验接口实现");
        return null;
    }

    @Override
    protected void prePay() {
        System.out.println("苹果支付前置接口实现");
    }

    @Override
    protected void postPay() {
        System.out.println("苹果支付后置接口实现");
    }

    @Override
    public PayResponse pay(PayResquest payResquest) {
        System.out.println("苹果支付调用接口具体实现");
        return null;
    }
}
