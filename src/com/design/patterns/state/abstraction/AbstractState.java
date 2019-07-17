package com.design.patterns.state.abstraction;

import com.design.patterns.state.Context;

/**
 * Title: 抽象状态<br>
 * Description: AbstractState<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月17日 20:30
 *
 * @author jackie.scl
 */
public abstract class AbstractState {
  public abstract void Handle(Context context);
}
