package com.design.patterns.observer.service;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: 抽象目标<br>
 * Description: Subject<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月04日 18:51
 *
 * @author jackie.scl
 */
public abstract class Subject {
  protected List<Observer> observerList = new ArrayList<Observer>();

  /**
   * Title: 增加观察者<br>
   * Description: addObserver<br>
   * CreateDate: 2019/7/4 18:53<br>
   *
   * @category @author jackie.scl
   * @param observer
   * @return void
   * @exception Exception
   */
  public void addObserver(Observer observer) {
    observerList.add(observer);
  }

  /**
   * Title: 删除观察者<br>
   * Description: removeObserver<br>
   * CreateDate: 2019/7/4 18:54<br>
   *
   * @category @author jackie.scl
   * @param observer
   * @return void
   * @exception Exception
   */
  public void removeObserver(Observer observer) {
    observerList.remove(observer);
  }

  public abstract void notifyObserver(); // 触发通知观察者的方法
}
