package com.design.patterns.responsibilitychain.abstraction;

/**
 * Title: 抽象处理者<br>
 * Description: AbstractHandler<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月17日 19:28
 *
 * @author jackie.scl
 */
public abstract class AbstractHandler {
  private AbstractHandler nextHandler;

  public AbstractHandler getNextHandler() {
    return nextHandler;
  }

  public void setNextHandler(AbstractHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  // 处理请求的方法
  public abstract void handlerRequest(String request);
}
