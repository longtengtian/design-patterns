package com.design.patterns.observer.observer.implementor;

import com.design.patterns.observer.observer.abstraction.AbstractObserver;

/**
 * Title: 具体观察者A<br>
 * Description: ConcreteObserverA<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月04日 19:07
 *
 * @author jackie.scl
 */
public class ConcreteObserverA implements AbstractObserver {
  @Override
  public void response() {
    System.out.println("具体观察者A收到变更通知，对应变更！");
  }
}
