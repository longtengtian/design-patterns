package com.design.patterns.abstractfactory.factory.implementor;

import com.design.patterns.abstractfactory.factory.abstraction.AbstractFactory;
import com.design.patterns.abstractfactory.product.abstraction.AbstractProductOne;
import com.design.patterns.abstractfactory.product.abstraction.AbstractProductTwo;
import com.design.patterns.abstractfactory.product.implementor.ConcreteProductFour;
import com.design.patterns.abstractfactory.product.implementor.ConcreteProductOne;

/**
 * Title: 具体工厂B<br>
 * Description: ConcreteFactoryTwo<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月11日 18:54
 *
 * @author jackie.scl
 */
public class ConcreteFactoryTwo implements AbstractFactory {
  @Override
  public AbstractProductOne newProductA() {
    System.out.println("具体工厂B生成-->产品A");
    return new ConcreteProductOne();
  }

  @Override
  public AbstractProductTwo newProductB() {
    System.out.println("具体工厂B生成-->产品D");
    return new ConcreteProductFour();
  }
}
