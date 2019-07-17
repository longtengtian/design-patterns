package com.design.patterns.composite.component;

import java.awt.*;
import java.util.ArrayList;

/**
 * Title: 树枝构件<br>
 * Description: BranchComponent<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月17日 15:42
 *
 * @author jackie.scl
 */
public class BranchComponent implements AbstractComponent {
  private ArrayList<AbstractComponent> children = new ArrayList<AbstractComponent>();

  @Override
  public void add(AbstractComponent abstractComponent) {
    children.add(abstractComponent);
  }

  @Override
  public void remove(AbstractComponent abstractComponent) {
    children.remove(abstractComponent);
  }

  @Override
  public AbstractComponent getChild(int i) {
    return children.get(i);
  }

  @Override
  public void operation() {
    for (AbstractComponent abstractComponent : children) {
      abstractComponent.operation();
    }
  }
}
