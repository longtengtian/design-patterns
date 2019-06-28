package com.design.patterns.factorymethod.service.serviceImpl;

import com.design.patterns.factorymethod.service.ProductService;

/**
 * Title: 具体产品A<br>
 * Description: ConcreteProductAServiceImpl<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年06月28日 18:38
 *
 * @author jackie.scl
 */
public class ConcreteProductAServiceImpl implements ProductService {
  @Override
  public void productInfo() {
    System.out.println("产品A：高端大气，上档次，心动不如行动！");
  }
}
