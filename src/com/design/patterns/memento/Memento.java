package com.design.patterns.memento;

/**
 * Title: 备忘录<br>
 * Description: Memento<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 18:45
 *
 * @author jackie.scl
 */
public class Memento {
  private String state;

  public Memento(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }
}
