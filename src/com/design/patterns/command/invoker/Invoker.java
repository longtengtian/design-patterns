package com.design.patterns.command.invoker;

import com.design.patterns.command.abstraction.AbstractCommand;
import com.design.patterns.composite.component.AbstractComponent;

/**
 * Title: 调用者<br>
 * Description: Invoker<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月17日 16:42
 *
 * @author jackie.scl
 */
public class Invoker {
  private AbstractCommand abstractCommand;

  public Invoker(AbstractCommand abstractCommand) {
    this.abstractCommand = abstractCommand;
  }

  public void call() {
    abstractCommand.execute();
  }
}
