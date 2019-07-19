package com.design.patterns.factorymethod.factory.abstraction;

import com.design.patterns.factorymethod.product.abstraction.AbstractProduct;

/**
 * Title: 抽象工厂<br>
 * Description: AbstractFactory<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 20:36
 *
 * @author jackie.scl
 */
public interface AbstractFactory {
  // 创建产品
  public AbstractProduct newProduct();
}
