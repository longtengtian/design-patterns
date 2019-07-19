package com.design.patterns.decorator.decorator.implementor;

import com.design.patterns.decorator.component.abstraction.AbstractComponent;
import com.design.patterns.decorator.decorator.abstraction.AbstractDecorator;

/**
 * Title: ConcreteDecoratorB<br>
 * Description: ConcreteDecoratorB<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月02日 18:47
 *
 * @author jackie.scl
 */
public class ConcreteDecoratorB extends AbstractDecorator {
  public ConcreteDecoratorB(AbstractComponent abstractComponent) {
    super(abstractComponent);
  }

  @Override
  public void operation() {
    super.operation();
    addedFunction();
    specialOpration();
  }

  public void addedFunction() {
    System.out.println("执行具体装饰对象B增加额外的功能addedFunction()");
  }

  public void specialOpration() {
    System.out.println("执行具体装饰对象B特有的功能specialOpration()");
  }
}
