package com.design.patterns.decorator.service.serviceImpl;

import com.design.patterns.decorator.service.ComponentService;

/**
 * Title: 具体构件实现<br>
 * Description: ConcreteComponentServiceImpl<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月02日 18:34
 *
 * @author jackie.scl
 */
public class ConcreteComponentServiceImpl implements ComponentService {
  public ConcreteComponentServiceImpl() {
    System.out.println("创建具体构件对象");
  }

  @Override
  public void operation() {
    System.out.println("调用具体构件对象的方法operation()");
  }
}
