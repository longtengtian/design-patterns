package com.design.patterns.decorator.service.serviceImpl;

import com.design.patterns.decorator.service.ComponentService;

/**
 * Title: 具体装饰A实现<br>
 * Description: ConcreteDecoratorAServiceImpl<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月02日 18:42
 *
 * @author jackie.scl
 */
public class ConcreteDecoratorAServiceImpl extends DecoratorServiceImpl {
  public ConcreteDecoratorAServiceImpl(ComponentService componentService) {
    super(componentService);
  }

  public void operation() {
    super.operation();
    addedFunction();
  }

  public void addedFunction() {
    System.out.println("执行具体装饰对象A增加额外的功能addedFunction()");
  }
}
