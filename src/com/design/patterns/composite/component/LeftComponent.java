package com.design.patterns.composite.component;

/**
 * Title: 树叶构件<br>
 * Description: LeftComponent<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月17日 15:39
 *
 * @author jackie.scl
 */
public class LeftComponent implements AbstractComponent {
  private String name;

  public LeftComponent(String name) {
    this.name = name;
  }

  @Override
  public void add(AbstractComponent c) {

  }

  @Override
  public void remove(AbstractComponent c) {

  }

  @Override
  public AbstractComponent getChild(int i) {
    return null;
  }

  @Override
  public void operation() {
    System.out.println("树叶" + name + ",被访问！");
  }
}
