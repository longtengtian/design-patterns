package com.design.patterns.factorymethod.service.serviceImpl;

import com.design.patterns.factorymethod.service.ProductService;

/**
 * Title: 具体产品B<br>
 * Description: ConcreteProductBServiceImpl<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年06月28日 18:38
 *
 * @author jackie.scl
 */
public class ConcreteProductBServiceImpl implements ProductService {
  @Override
  public void productInfo() {
    System.out.println("产品B：经济实惠，物美价廉，你值得拥有！");
  }
}
