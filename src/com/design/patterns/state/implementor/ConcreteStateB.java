package com.design.patterns.state.implementor;

import com.design.patterns.state.Context;
import com.design.patterns.state.abstraction.AbstractState;

/**
 * Title: 具体状态B<br>
 * Description: ConcreteStateB<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月17日 20:35
 *
 * @author jackie.scl
 */
public class ConcreteStateB extends AbstractState {
  @Override
  public void Handle(Context context) {
    System.out.println("当前状态：状态B");
    context.setAbstractState(new ConcreteStateC());
    System.out.println("请求处理后变更状态为：状态C\n");
  }
}
