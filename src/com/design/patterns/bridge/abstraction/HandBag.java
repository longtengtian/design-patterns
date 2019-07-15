package com.design.patterns.bridge.abstraction;

/**
 * Title: 扩展抽象化角色：挎包<br>
 * Description: HandBag<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月15日 18:39
 *
 * @author jackie.scl
 */
public class HandBag extends Bag {

  @Override
  public String desc() {
    return color.getColor() + "挎包";
  }
}
