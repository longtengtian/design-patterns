package com.design.patterns.observer.service.serviceImpl;

import com.design.patterns.observer.service.Observer;
import com.design.patterns.observer.service.Subject;

/**
 * Title: 具体目标<br>
 * Description: ConcreteSubject<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月04日 18:56
 *
 * @author jackie.scl
 */
public class ConcreteSubject extends Subject {
  @Override
  public void notifyObserver() {
    System.out.println("具体目标发生变化！");
    for (Object object : observerList) {
      ((Observer) object).response();
    }
  }
}
