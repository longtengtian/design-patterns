package com.design.patterns.memento;

/**
 * Title: 管理者<br>
 * Description: Caretaker<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 18:46
 *
 * @author jackie.scl
 */
public class Caretaker {
  private Memento memento;

  public Memento getMemento() {
    return memento;
  }

  public void setMemento(Memento memento) {
    this.memento = memento;
  }
}
