package com.design.patterns.bridge.abstraction;

import com.design.patterns.bridge.implementor.Color;

/**
 * Title: 抽象化角色：包<br>
 * Description: Bag<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月15日 18:38
 *
 * @author jackie.scl
 */
public abstract class Bag {
  protected Color color;

  public void setColor(Color color) {
    this.color = color;
  }

  public abstract String desc();
}
