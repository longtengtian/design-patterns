package com.design.patterns.state;

import com.design.patterns.state.abstraction.AbstractState;
import com.design.patterns.state.implementor.ConcreteStateA;

/**
 * Title: 环境<br>
 * Description: Context<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月17日 20:29
 *
 * @author jackie.scl
 */
public class Context {
  private AbstractState abstractState;

  // 定义环境类的初始状态
  public Context() {
    System.out.println("环境初始化......");
    this.abstractState = new ConcreteStateA();
  }

  // 读取状态
  public AbstractState getAbstractState() {
    return abstractState;
  }

  // 设置新状态
  public void setAbstractState(AbstractState abstractState) {
    this.abstractState = abstractState;
  }

  // 对请求做处理
  public void Handle() {
    abstractState.Handle(this);
  }
}
