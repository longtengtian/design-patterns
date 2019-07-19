package com.design.patterns.factorymethod.factory.implementor;

import com.design.patterns.factorymethod.factory.abstraction.AbstractFactory;
import com.design.patterns.factorymethod.product.abstraction.AbstractProduct;
import com.design.patterns.factorymethod.product.implementor.ConcreteProductB;

/**
 * Title: 具体工厂B<br>
 * Description: ConcreteFactoryTwo<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 20:37
 *
 * @author jackie.scl
 */
public class ConcreteFactoryB implements AbstractFactory {
  @Override
  public AbstractProduct newProduct() {
    System.out.println("具体工厂B->创建具体产品B");
    return new ConcreteProductB();
  }
}
