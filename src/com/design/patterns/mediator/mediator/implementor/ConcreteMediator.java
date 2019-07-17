package com.design.patterns.mediator.mediator.implementor;

import java.util.ArrayList;
import java.util.List;

import com.design.patterns.mediator.colleague.abstraction.AbstractColleague;
import com.design.patterns.mediator.mediator.abstraction.AbstractMediator;

/**
 * Title: ConcreteMediator<br>
 * Description: ConcreteMediator<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月17日 21:04
 *
 * @author jackie.scl
 */
public class ConcreteMediator extends AbstractMediator {
  private List<AbstractColleague> colleagueList = new ArrayList<AbstractColleague>();

  @Override
  public void register(AbstractColleague colleague) {
    if (!colleagueList.contains(colleague)) {
      colleagueList.add(colleague);
      colleague.setMediator(this);
    }
  }

  @Override
  public void relay(AbstractColleague colleague) {
    for (AbstractColleague currentColleague : colleagueList) {
      if (!currentColleague.equals(colleague)) {
        currentColleague.receive();
      }
    }
  }
}
