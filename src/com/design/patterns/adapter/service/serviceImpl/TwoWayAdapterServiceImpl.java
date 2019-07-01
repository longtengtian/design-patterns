package com.design.patterns.adapter.service.serviceImpl;

import com.design.patterns.adapter.service.TwoWayAdapteeService;
import com.design.patterns.adapter.service.TwoWayTargetService;

/**
 * Title: 双向适配器实现<br>
 * Description: TwoWayAdapterServiceImpl<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月01日 19:23
 *
 * @author jackie.scl
 */
public class TwoWayAdapterServiceImpl implements TwoWayTargetService, TwoWayAdapteeService {
  private TwoWayTargetService targetService;
  private TwoWayAdapteeService adapteeService;

  public TwoWayAdapterServiceImpl(TwoWayTargetService targetService) {
    this.targetService = targetService;
  }

  public TwoWayAdapterServiceImpl(TwoWayAdapteeService adapteeService) {
    this.adapteeService = adapteeService;
  }

  @Override
  public void request() {
    adapteeService.specificRequest();
  }

  @Override
  public void specificRequest() {
    targetService.request();
  }
}
