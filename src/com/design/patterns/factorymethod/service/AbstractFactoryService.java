package com.design.patterns.factorymethod.service;

/**
 * Title: 抽象工厂<br>
 * Description: AbstractFactoryService<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年06月28日 18:35
 *
 * @author jackie.scl
 */
public interface AbstractFactoryService {
  // 创建产品
  public ProductService newProduct();
}
