package com.design.patterns.simplefactory.service.serviceImpl;

import com.design.patterns.simplefactory.service.OperationService;

/**
 * Title: 加法运算接口实现类<br>
 * Description: AddOperationServiceImpl<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年06月14日 19:17
 *
 * @author jackie.scl
 */
public class AddOperationServiceImpl implements OperationService {
    @Override
    public double getResult(double numberA, double numberB) {
        return numberA+numberB;
    }
}