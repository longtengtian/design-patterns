package com.design.patterns.proxy.service.serviceImpl;

import com.design.patterns.proxy.service.IAdviceService;
import com.design.patterns.proxy.service.SubjectService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Title: ProxySubjectServiceImpl<br>
 * Description: ProxySubjectServiceImpl<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年06月30日 17:58
 *
 * @author jackie.scl
 */
public class ProxySubjectServiceImpl implements InvocationHandler {
  // 被代理的对象
  private SubjectService realSubjectService;

  // 通过构造方法将被代理对象传递过来。
  public ProxySubjectServiceImpl(SubjectService realSubjectService) {
    this.realSubjectService = realSubjectService;
  }

  // 执行被代理类的方法
  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    // 在执行方法前，执行前置通知。
    IAdviceService beforeAdviceService = new BeforeAdviceServiceImpl();
    beforeAdviceService.exec();
    Object result = method.invoke(this.realSubjectService, args);
    // 在执行方法后，执行后置通知。
    IAdviceService afterAdvice = new AfterAdviceServiceImpl();
    afterAdvice.exec();
    // 前置通知，和后置通知，都是要看具体实际的业务需求来进行添加
    return result;
    }

}
