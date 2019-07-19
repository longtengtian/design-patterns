package com.design.patterns.factorymethod.product.implementor;

import com.design.patterns.factorymethod.product.abstraction.AbstractProduct;

/**
 * Title: 具体产品B<br>
 * Description: ConcreteProductB<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 20:39
 *
 * @author jackie.scl
 */
public class ConcreteProductB implements AbstractProduct {
  @Override
  public void productInfo() {
    System.out.println("产品B：经济实惠，物美价廉，你值得拥有！");
  }
}
