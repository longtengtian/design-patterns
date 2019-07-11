package com.design.patterns.abstractfactory.factory;

import com.design.patterns.abstractfactory.product.*;

/**
 * Title: 具体工厂B<br>
 * Description: ConcreteFactoryB<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月11日 18:54
 *
 * @author jackie.scl
 */
public class ConcreteFactoryB implements AbstractFactory {
  @Override
  public AbstractProductOne newProductA() {
    System.out.println("具体工厂B生成-->产品A");
    return new ProductA();
  }

  @Override
  public AbstractProductTwo newProductB() {
    System.out.println("具体工厂B生成-->产品D");
    return new ProductD();
  }
}
