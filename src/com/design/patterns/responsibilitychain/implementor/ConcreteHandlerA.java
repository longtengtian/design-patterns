package com.design.patterns.responsibilitychain.implementor;

import com.design.patterns.responsibilitychain.abstraction.AbstractHandler;

/**
 * Title: 具体处理者A<br>
 * Description: ConcreteHandlerA<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月17日 19:32
 *
 * @author jackie.scl
 */
public class ConcreteHandlerA extends AbstractHandler {
  @Override
  public void handlerRequest(String request) {
    System.out.print("进入具体处理者A处理流程：");
    // chooseA请求处理
    if ("chooseA".equals(request)) {
      System.out.println("具体处理者A负责处理该请求！");
      return;
    }
    AbstractHandler nextHandler = getNextHandler();
    // 存在下一个请求处理
    if (null != nextHandler) {
      nextHandler.handlerRequest(request);
      return;
    }
    // 当前请求是最后一个请求，且不负责处理该请求
    System.out.println("没有人负责处理改请求！");
  }
}
