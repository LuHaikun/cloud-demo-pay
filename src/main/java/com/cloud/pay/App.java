package com.cloud.pay;

import com.cloud.bean.PayResquest;
import com.cloud.pay.impl.AliPay;
import com.cloud.pay.impl.PaymentFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IPaymentFactory factory = new PaymentFactory();
        AliPay aliPay = factory.createAlipay();
        PayResquest payResquest = new PayResquest();
        aliPay.payment(payResquest);
    }
}
