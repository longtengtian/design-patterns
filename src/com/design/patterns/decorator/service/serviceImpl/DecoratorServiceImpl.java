package com.design.patterns.decorator.service.serviceImpl;

import com.design.patterns.decorator.service.ComponentService;

/**
 * Title: 抽象装饰<br>
 * Description: DecoratorServiceImpl<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月02日 18:38
 *
 * @author jackie.scl
 */
public class DecoratorServiceImpl implements ComponentService {
  private ComponentService componentService;

  public DecoratorServiceImpl(ComponentService componentService) {
    this.componentService = componentService;
  }

  @Override
  public void operation() {
    componentService.operation();
  }
}
