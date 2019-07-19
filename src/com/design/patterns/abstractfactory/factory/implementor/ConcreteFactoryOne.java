package com.design.patterns.abstractfactory.factory.implementor;

import com.design.patterns.abstractfactory.factory.abstraction.AbstractFactory;
import com.design.patterns.abstractfactory.product.abstraction.AbstractProductOne;
import com.design.patterns.abstractfactory.product.abstraction.AbstractProductTwo;
import com.design.patterns.abstractfactory.product.implementor.ConcreteProductThree;
import com.design.patterns.abstractfactory.product.implementor.ConcreteProductTwo;

/**
 * Title: 具体工厂A<br>
 * Description: ConcreteFactoryOne<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月11日 18:49
 *
 * @author jackie.scl
 */
public class ConcreteFactoryOne implements AbstractFactory {

  @Override
  public AbstractProductOne newProductA() {
    System.out.println("具体工厂A生成-->产品B");
    return new ConcreteProductTwo();
  }

  @Override
  public AbstractProductTwo newProductB() {
    System.out.println("具体工厂A生成-->产品C");
    return new ConcreteProductThree();
  }
}
