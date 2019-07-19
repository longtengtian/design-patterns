package com.design.patterns.strategy.implementor;

import com.design.patterns.strategy.abstraction.AbstractStrategy;

/**
 * Title: 具体实现策略类A<br>
 * Description: ConcreteStrategyA<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年06月26日 19:01
 *
 * @author jackie.scl
 */
public class ConcreteStrategyA implements AbstractStrategy {
  @Override
  public void strategyMethod() {
    System.out.println("调用具体策略A的策略方法成功！");
  }
}
