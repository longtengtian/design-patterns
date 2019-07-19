package com.design.patterns.decorator.decorator.abstraction;

import com.design.patterns.decorator.component.abstraction.AbstractComponent;

/**
 * Title: 抽象装饰者<br>
 * Description: Decorator<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 19:35
 *
 * @author jackie.scl
 */
public class AbstractDecorator implements AbstractComponent {
  private AbstractComponent abstractComponent;

  public AbstractDecorator(AbstractComponent abstractComponent) {
    this.abstractComponent = abstractComponent;
  }

  @Override
  public void operation() {
    abstractComponent.operation();
  }
}
