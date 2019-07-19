package com.design.patterns.abstractfactory.product.implementor;

import com.design.patterns.abstractfactory.product.abstraction.AbstractProductOne;

/**
 * Title: 产品B<br>
 * Description: ConcreteProductTwo<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月11日 18:53
 *
 * @author jackie.scl
 */
public class ConcreteProductTwo implements AbstractProductOne {

  @Override
  public void show() {
    System.out.println("产品B show");
  }
}
