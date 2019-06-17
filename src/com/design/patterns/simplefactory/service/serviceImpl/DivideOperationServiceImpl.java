package com.design.patterns.simplefactory.service.serviceImpl;

import com.design.patterns.simplefactory.service.OperationService;

/**
 * Title: 除法运算接口实现类<br>
 * Description: DivideOperationServiceImpl<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年06月14日 19:17
 *
 * @author jackie.scl
 */
public class DivideOperationServiceImpl implements OperationService {
    @Override
    public double getResult(double numberA, double numberB) {
        double result = 0;
        if (0 == numberB) {
            System.out.println("除数不能为0");
            return result;
        }
        result = numberA / numberB;
        return result;
    }
}