package com.design.patterns.bridge.implementor;

/**
 * Title: 具体实现化角色：蓝色<br>
 * Description: Blue<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月15日 15:16
 *
 * @author jackie.scl
 */
public class Blue implements Color {
  @Override
  public String getColor() {
    return "blue";
  }
}
