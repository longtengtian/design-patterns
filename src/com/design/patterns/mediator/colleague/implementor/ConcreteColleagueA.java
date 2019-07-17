package com.design.patterns.mediator.colleague.implementor;

import com.design.patterns.mediator.colleague.abstraction.AbstractColleague;

/**
 * Title: 具体同事A<br>
 * Description: ConcreteColleagueA<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月17日 21:13
 *
 * @author jackie.scl
 */
public class ConcreteColleagueA extends AbstractColleague {
  @Override
  public void receive() {
    System.out.println("具体同事A收到请求！");
  }

  @Override
  public void send() {
    System.out.println("具体同事A发出请求！");
    mediator.relay(this); // 请中介者转发
  }
}
