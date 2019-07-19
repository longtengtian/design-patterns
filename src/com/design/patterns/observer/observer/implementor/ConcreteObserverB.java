package com.design.patterns.observer.observer.implementor;

import com.design.patterns.observer.observer.abstraction.AbstractObserver;

/**
 * Title: 具体观察者B<br>
 * Description: ConcreteObserverB<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月04日 19:10
 *
 * @author jackie.scl
 */
public class ConcreteObserverB implements AbstractObserver {
  @Override
  public void response() {
    System.out.println("具体观察者B收到变更通知，对应变更！");
  }
}
