package com.design.patterns.proxy.subject.implementor;

import com.design.patterns.proxy.subject.abstraction.IAdvice;

/**
 * Title: 前置通知<br>
 * Description: BeforeAdvice<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 21:45
 *
 * @author jackie.scl
 */
public class BeforeAdvice implements IAdvice {
  @Override
  public void exec() {
    System.out.println("当前是访问真实主题之前的预处理！");
  }
}
