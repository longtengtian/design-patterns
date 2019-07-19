package com.design.patterns.adapter.adaptee.implementor;

import com.design.patterns.adapter.adaptee.abstraction.AbstractTwoWayAdaptee;

/**
 * Title: 适配者实现<br>
 * Description: AdapteeRealize<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 16:06
 *
 * @author jackie.scl
 */
public class AdapteeRealize implements AbstractTwoWayAdaptee {
  @Override
  public void specificRequest() {
    System.out.println("适配者代码被调用！");
  }
}
