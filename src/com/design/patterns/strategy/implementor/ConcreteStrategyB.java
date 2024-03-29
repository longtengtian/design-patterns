package com.design.patterns.strategy.implementor;

import com.design.patterns.strategy.abstraction.AbstractStrategy;

/**
 * Title: 具体实现策略类B<br>
 * Description: ConcreteStrategyB<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年06月26日 19:03
 *
 * @author jackie.scl
 */
public class ConcreteStrategyB implements AbstractStrategy {
  @Override
  public void strategyMethod() {
    System.out.println("调用具体策略B的策略方法成功！");
  }
}
