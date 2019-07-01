package com.design.patterns.proxy.service.serviceImpl;

import com.design.patterns.proxy.service.IAdviceService;

/**
 * Title: BeforeAdviceServiceImpl<br>
 * Description: BeforeAdviceServiceImpl<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月01日 13:23
 *
 * @author jackie.scl
 */
public class BeforeAdviceServiceImpl implements IAdviceService {
  @Override
  public void exec() {
    System.out.println("当前是访问真实主题之前的预处理！");
  }
}
