package com.design.patterns.state.implementor;

import com.design.patterns.state.StateContext;
import com.design.patterns.state.abstraction.AbstractState;

/**
 * Title: 具体状态A<br>
 * Description: ConcreteStateA<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月17日 20:31
 *
 * @author jackie.scl
 */
public class ConcreteStateA extends AbstractState {
  @Override
  public void Handle(StateContext stateContext) {
    System.out.println("当前状态：状态A");
    stateContext.setAbstractState(new ConcreteStateB());
    System.out.println("请求处理后变更状态为：状态B\n");
  }
}
