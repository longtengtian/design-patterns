package com.design.patterns.factorymethod.service.serviceImpl;

import com.design.patterns.factorymethod.service.AbstractFactoryService;
import com.design.patterns.factorymethod.service.ProductService;

/**
 * Title: 具体工厂A<br>
 * Description: ConcreteFactoryAServiceImpl<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年06月28日 18:36
 *
 * @author jackies.cl
 */
public class ConcreteFactoryAServiceImpl implements AbstractFactoryService {

  @Override
  public ProductService newProduct() {
    System.out.println("具体工厂A->创建具体产品A");
    return new ConcreteProductAServiceImpl();
  }
}
