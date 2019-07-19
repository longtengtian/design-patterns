package com.design.patterns.adapter.adapter;

import com.design.patterns.adapter.adaptee.abstraction.AbstractTwoWayAdaptee;
import com.design.patterns.adapter.target.abstraction.AbstractTwoWayTarget;

/**
 * Title: 双向适配器实现<br>
 * Description: TwoWayAdapter<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 21:08
 *
 * @author jackie.scl
 */
public class TwoWayAdapter implements AbstractTwoWayAdaptee, AbstractTwoWayTarget {
  private AbstractTwoWayTarget target;
  private AbstractTwoWayAdaptee adaptee;

  public TwoWayAdapter(AbstractTwoWayTarget target) {
    this.target = target;
  }

  public TwoWayAdapter(AbstractTwoWayAdaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public void request() {
    adaptee.specificRequest();
  }

  @Override
  public void specificRequest() {
    target.request();
  }
}
