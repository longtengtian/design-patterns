package com.design.patterns.observer.subject.abstraction;

import com.design.patterns.observer.observer.abstraction.AbstractObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: 抽象目标<br>
 * Description: AbstractSubject<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月04日 18:51
 *
 * @author jackie.scl
 */
public abstract class AbstractSubject {
  protected List<AbstractObserver> abstractObserverList = new ArrayList<AbstractObserver>();

  /**
   * Title: 增加观察者<br>
   * Description: addObserver<br>
   * CreateDate: 2019/7/4 18:53<br>
   *
   * @category @author jackie.scl
   * @param abstractObserver
   * @return void
   * @exception Exception
   */
  public void addObserver(AbstractObserver abstractObserver) {
    abstractObserverList.add(abstractObserver);
  }

  /**
   * Title: 删除观察者<br>
   * Description: removeObserver<br>
   * CreateDate: 2019/7/4 18:54<br>
   *
   * @category @author jackie.scl
   * @param abstractObserver
   * @return void
   * @exception Exception
   */
  public void removeObserver(AbstractObserver abstractObserver) {
    abstractObserverList.remove(abstractObserver);
  }

  public abstract void notifyObserver(); // 触发通知观察者的方法
}
