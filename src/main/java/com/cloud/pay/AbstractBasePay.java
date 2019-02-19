package com.cloud.pay;

import com.cloud.bean.PayResquest;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2018/12/20 9:17 AM
 * @Description: 基础支付抽象类
 * @Created with cloud-demo-pay
 * @Version: 1.0
 */
public abstract class AbstractBasePay implements Payment{

    protected void payment (PayResquest payResquest) {
        prePay();
        pay(payResquest);
        postPay();
    }

    protected abstract void prePay ();

    protected abstract void postPay ();

}
