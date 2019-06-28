package com.design.patterns.factorymethod.service.serviceImpl;

import com.design.patterns.factorymethod.service.AbstractFactoryService;
import com.design.patterns.factorymethod.service.ProductService;

/**
 * Title: 具体工厂B<br>
 * Description: ConcreteFactoryBServiceImpl<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年06月28日 18:37
 *
 * @author jackie.scl
 */
public class ConcreteFactoryBServiceImpl implements AbstractFactoryService {
  @Override
  public ProductService newProduct() {
    System.out.println("具体工厂B->创建具体产品B");
    return new ConcreteProductBServiceImpl();
  }
}
