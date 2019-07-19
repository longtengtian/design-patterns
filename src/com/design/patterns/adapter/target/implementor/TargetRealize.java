package com.design.patterns.adapter.target.implementor;

import com.design.patterns.adapter.target.abstraction.AbstractTwoWayTarget;

/**
 * Title: 目标实现<br>
 * Description: TargetRealize<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月19日 16:07
 *
 * @author jackie.scl
 */
public class TargetRealize implements AbstractTwoWayTarget {
  @Override
  public void request() {
    System.out.println("目标代码被调用！");
  }
}
