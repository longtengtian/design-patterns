package com.design.patterns.facade.facade;

import com.design.patterns.facade.subsystem.SubSystemA;
import com.design.patterns.facade.subsystem.SubSystemB;

/**
 * Title: Facade<br>
 * Description: Facade<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月15日 19:14
 *
 * @author jackie.scl
 */
public class Facade {
  private SubSystemA subSystemA = new SubSystemA();
  private SubSystemB subSystemB = new SubSystemB();

  public void method() {
    System.out.println("统一访问子系统A、子系统B start");
    subSystemB.methodB();
    subSystemA.methodA();
    System.out.println("统一访问子系统A、子系统B end");
  }
}
