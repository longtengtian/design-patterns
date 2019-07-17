package com.design.patterns.mediator.colleague.abstraction;

import com.design.patterns.mediator.mediator.abstraction.AbstractMediator;

/**
 * Title: 抽象同事<br>
 * Description: AbstractColleague<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月17日 21:03
 *
 * @author jackie.scl
 */
public abstract class AbstractColleague {
  protected AbstractMediator mediator;

  public void setMediator(AbstractMediator mediator) {
    this.mediator = mediator;
  }

  public abstract void receive();

  public abstract void send();
}
