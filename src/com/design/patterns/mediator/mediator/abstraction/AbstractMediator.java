package com.design.patterns.mediator.mediator.abstraction;

import com.design.patterns.mediator.colleague.abstraction.AbstractColleague;

/**
 * Title: 抽象中介者<br>
 * Description: AbstractMediator<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月17日 21:02
 *
 * @author jackie.scl
 */
public abstract class AbstractMediator {
  public abstract void register(AbstractColleague colleague);

  public abstract void relay(AbstractColleague colleague);
}
