package com.design.patterns.proxy.subject.implementor;

import com.design.patterns.proxy.subject.abstraction.AbstractSubject;

/**
 * Title: 真实主题<br>
 * Description: RealSubject<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 21:40
 *
 * @author jackie.scl
 */
public class RealSubject implements AbstractSubject {
  @Override
  public void request() {
    System.out.println("当前访问的是真实主题方法！");
  }
}
