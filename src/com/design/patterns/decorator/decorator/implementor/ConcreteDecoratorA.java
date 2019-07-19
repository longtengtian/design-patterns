package com.design.patterns.decorator.decorator.implementor;

import com.design.patterns.decorator.component.abstraction.AbstractComponent;
import com.design.patterns.decorator.decorator.abstraction.AbstractDecorator;

/**
 * Title: 具体装饰者A<br>
 * Description: ConcreteDecoratorA<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 19:39
 *
 * @author jackie.scl
 */
public class ConcreteDecoratorA extends AbstractDecorator {
  public ConcreteDecoratorA(AbstractComponent abstractComponent) {
    super(abstractComponent);
  }

  @Override
  public void operation() {
    super.operation();
    addedFunction();
  }

  public void addedFunction() {
    System.out.println("执行具体装饰对象A增加额外的功能addedFunction()");
  }
}
