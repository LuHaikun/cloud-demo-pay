package com.cloud.pay;

import com.cloud.bean.PayResponse;
import com.cloud.bean.PayResquest;

/**
 * @Created with IntelliJ IDEA.
 * @Description: cloud-demo-pay
 * @Author: luhk 支付接口入口 对拓展开放，对修改关闭--提供一套标准流程
 * @Date: 2018-12-20
 * @Time: 9:12 AM
 * @Version: 1.0
 */
public interface Payment {
    public PayResponse pay(PayResquest payResquest);
}
