package com.design.patterns.proxy.subject.implementor;

import com.design.patterns.proxy.subject.abstraction.IAdvice;

/**
 * Title: 后置通知<br>
 * Description: AfterAdvice<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 21:46
 *
 * @author jackie.scl
 */
public class AfterAdvice implements IAdvice {
  @Override
  public void exec() {
    System.out.println("当前是访问真实主题之后的后置处理！");
  }
}
