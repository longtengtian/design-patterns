package com.design.patterns.memento;

/**
 * Title: 发起人<br>
 * Description: Originator<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 18:45
 *
 * @author jackie.scl
 */
public class Originator {
  private String state;

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  /**
   * Title: 创建备忘录<br>
   * Description: createMemento<br>
   * CreateDate: 2019/7/19 18:56<br>
   *
   * @category 创建备忘录
   * @author jackie.scl
   * @param state
   * @return com.design.patterns.memento.Memento
   * @exception Exception
   */
  public Memento createMemento(String state) {
    this.state = state;
    return new Memento(state);
  }

  /**
   * Title: 恢复备忘录<br>
   * Description: restoreMemento<br>
   * CreateDate: 2019/7/19 19:04<br>
   *
   * @category @author jackie.scl
   * @param memento
   * @return void
   * @exception Exception
   */
  public void restoreMemento(Memento memento) {
    this.setState(memento.getState());
  }
}
