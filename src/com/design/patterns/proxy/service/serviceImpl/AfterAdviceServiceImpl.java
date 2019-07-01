package com.design.patterns.proxy.service.serviceImpl;

import com.design.patterns.proxy.service.IAdviceService;

/**
 * Title: AfterAdviceServiceImpl<br>
 * Description: AfterAdviceServiceImpl<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月01日 13:26
 *
 * @author jackie.scl
 */
public class AfterAdviceServiceImpl implements IAdviceService {
  @Override
  public void exec() {
    System.out.println("当前是访问真实主题之后的后置处理！");
  }
}
