package com.design.patterns.factorymethod.product.implementor;

import com.design.patterns.factorymethod.product.abstraction.AbstractProduct;

/**
 * Title: 具体产品A<br>
 * Description: ConcreteProductA<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 20:39
 *
 * @author jackie.scl
 */
public class ConcreteProductA implements AbstractProduct {
  @Override
  public void productInfo() {
    System.out.println("产品A：高端大气，上档次，心动不如行动！");
  }
}
