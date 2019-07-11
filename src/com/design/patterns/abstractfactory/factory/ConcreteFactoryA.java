package com.design.patterns.abstractfactory.factory;

import com.design.patterns.abstractfactory.product.AbstractProductOne;
import com.design.patterns.abstractfactory.product.AbstractProductTwo;
import com.design.patterns.abstractfactory.product.ProductB;
import com.design.patterns.abstractfactory.product.ProductC;

/**
 * Title: 具体工厂A<br>
 * Description: ConcreteFactoryA<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月11日 18:49
 *
 * @author jackie.scl
 */
public class ConcreteFactoryA implements AbstractFactory {

  @Override
  public AbstractProductOne newProductA() {
    System.out.println("具体工厂A生成-->产品B");
    return new ProductB();
  }

  @Override
  public AbstractProductTwo newProductB() {
    System.out.println("具体工厂A生成-->产品C");
    return new ProductC();
  }
}
