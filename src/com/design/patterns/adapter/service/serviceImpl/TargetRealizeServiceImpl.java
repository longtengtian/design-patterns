package com.design.patterns.adapter.service.serviceImpl;

import com.design.patterns.adapter.service.TwoWayTargetService;

/**
 * Title: 目标实现<br>
 * Description: TargetRealizeServiceImpl<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月01日 19:17
 *
 * @author jackie.scl
 */
public class TargetRealizeServiceImpl implements TwoWayTargetService {
  @Override
  public void request() {
    System.out.println("目标代码被调用！");
  }
}
