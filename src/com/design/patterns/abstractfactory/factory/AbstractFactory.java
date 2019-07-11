package com.design.patterns.abstractfactory.factory;

import com.design.patterns.abstractfactory.product.AbstractProductOne;
import com.design.patterns.abstractfactory.product.AbstractProductTwo;

/**
 * Title: 抽象工厂<br>
 * Description: AbstractFactory<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月11日 18:48
 *
 * @author jackie.scl
 */
public interface AbstractFactory {
  public AbstractProductOne newProductA();

  public AbstractProductTwo newProductB();
}
