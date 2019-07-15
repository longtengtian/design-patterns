package com.design.patterns.bridge.abstraction;

/**
 * Title: 扩展抽象化角色：钱包<br>
 * Description: Wallet<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月15日 10:40
 *
 * @author jackie.scl
 */
public class Wallet extends Bag {
  @Override
  public String desc() {
    return color.getColor() + "钱包";
  }
}
