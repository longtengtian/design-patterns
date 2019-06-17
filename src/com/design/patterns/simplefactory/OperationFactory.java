package com.design.patterns.simplefactory;

import com.design.patterns.simplefactory.service.OperationService;
import com.design.patterns.simplefactory.service.serviceImpl.AddOperationServiceImpl;

/**
 * Title: 运算类工厂<br>
 * Description: OperationFactory<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年06月17日 17:30
 *
 * @author jackie.scl
 */
public class OperationFactory {
    /**
     * Title: 返回运算类对象<br>
     * Description: getOperationService<br>
     * CreateDate: 2019/6/17 17:35<br>
     *
     * @category
     * @author jackie.scl
     * @param operation
     * @return com.design.patterns.simplefactory.service.OperationService
     * @exception Exception
     */
    public static OperationService getOperationService(String operation){
        OperationService operationService = null;
        if("+".equals(operation)){
            // 加法运算接口实现
            operationService = new AddOperationServiceImpl();
            return operationService;
        }else if("-".equals(operation)){
            return operationService;
        }else if("*".equals(operation)){
            return operationService;
        }else if("/".equals(operation)){
            return operationService;
        }else {
            return operationService;
        }

    }
}
