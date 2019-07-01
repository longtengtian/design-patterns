package com.design.patterns.adapter.service.serviceImpl;

import com.design.patterns.adapter.service.TwoWayAdapteeService;

/**
 * Title: 适配者实现<br>
 * Description: AdapteeRealizeServiceImpl<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月01日 19:18
 *
 * @author jackie.scl
 */
public class AdapteeRealizeServiceImpl implements TwoWayAdapteeService {
  @Override
  public void specificRequest() {
    System.out.println("适配者代码被调用！");
  }
}
