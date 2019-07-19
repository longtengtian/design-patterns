package com.design.patterns.abstractfactory.product.implementor;

import com.design.patterns.abstractfactory.product.abstraction.AbstractProductTwo;

/**
 * Title: ConcreteProductFour<br>
 * Description: ConcreteProductFour<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月11日 19:01
 *
 * @author jackie.scl
 */
public class ConcreteProductFour implements AbstractProductTwo {
  @Override
  public void test() {
    System.out.println("产品D test");
  }
}
