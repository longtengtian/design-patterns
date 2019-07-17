package com.design.patterns.composite.component;

/**
 * Title: 抽象构件<br>
 * Description: AbstractComponent<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月17日 15:37
 *
 * @author jackie.scl
 */
public interface AbstractComponent {
  public void add(AbstractComponent c);

  public void remove(AbstractComponent c);

  public AbstractComponent getChild(int i);

  public void operation();
}
