package com.design.patterns.observer.subject.implementor;

import com.design.patterns.observer.observer.abstraction.AbstractObserver;
import com.design.patterns.observer.subject.abstraction.AbstractSubject;

/**
 * Title: 具体目标<br>
 * Description: ConcreteSubject<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月04日 18:56
 *
 * @author jackie.scl
 */
public class ConcreteSubject extends AbstractSubject {
  @Override
  public void notifyObserver() {
    System.out.println("具体目标发生变化！");
    for (Object object : abstractObserverList) {
      ((AbstractObserver) object).response();
    }
  }
}
