package com.design.patterns.decorator.component.implementor;

import com.design.patterns.decorator.component.abstraction.AbstractComponent;

/**
 * Title: 具体构件<br>
 * Description: ConcreteComponent<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 19:32
 *
 * @author jackie.scl
 */
public class ConcreteComponent implements AbstractComponent {

  public ConcreteComponent() {
    System.out.println("创建具体构件对象");
  }

  @Override
  public void operation() {
    System.out.println("调用具体构件对象的方法operation()");
  }
}
