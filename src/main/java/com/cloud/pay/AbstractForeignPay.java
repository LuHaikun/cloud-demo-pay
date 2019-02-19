package com.cloud.pay;

import com.cloud.bean.PayResquest;
import com.cloud.pay.Payment;

/**
 * @Author: luhk
 * @Email lhk2014@163.com
 * @Date: 2018/12/20 9:29 AM
 * @Description: 国外支付抽象类
 * @Created with cloud-demo-pay
 * @Version: 1.0
 */
public abstract class AbstractForeignPay implements Payment {

    protected void payment (PayResquest payResquest) {
        prePay();
        checkPay();
        pay(payResquest);
        postPay();
    }

    protected abstract String checkPay();

    protected abstract void prePay ();

    protected abstract void postPay ();


}
