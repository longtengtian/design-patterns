package com.design.patterns.decorator.service.serviceImpl;

import com.design.patterns.decorator.service.ComponentService;

/**
 * Title: ConcreteDecoratorBServiceImpl<br>
 * Description: ConcreteDecoratorBServiceImpl<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月02日 18:47
 *
 * @author jackie.scl
 */
public class ConcreteDecoratorBServiceImpl extends DecoratorServiceImpl {
  public ConcreteDecoratorBServiceImpl(ComponentService componentService) {
    super(componentService);
  }

  public void operation() {
    super.operation();
    addedFunction();
  }

  public void addedFunction() {
    System.out.println("为具体装饰对象B增加额外的功能addedFunction()");
  }
}
