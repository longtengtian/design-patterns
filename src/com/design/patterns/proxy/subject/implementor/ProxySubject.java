package com.design.patterns.proxy.subject.implementor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.design.patterns.proxy.subject.abstraction.AbstractSubject;
import com.design.patterns.proxy.subject.abstraction.IAdvice;

/**
 * Title: 代理主题<br>
 * Description: ProxySubject<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 21:41
 *
 * @author jackie.scl
 */
public class ProxySubject implements InvocationHandler {
  // 被代理的对象
  private AbstractSubject realSubject;

  // 通过构造方法将被代理对象传递过来
  public ProxySubject(AbstractSubject realSubject) {
    this.realSubject = realSubject;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    // 在执行方法前，执行前置通知。
    IAdvice beforeAdvice = new BeforeAdvice();
    beforeAdvice.exec();
    Object result = method.invoke(this.realSubject, args);
    // 在执行方法后，执行后置通知。
    IAdvice afterAdvice = new AfterAdvice();
    afterAdvice.exec();
    // 前置通知，和后置通知，都是要看具体实际的业务需求来进行添加
    return result;
  }
}
