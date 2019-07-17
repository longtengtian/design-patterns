package com.design.patterns.command.implementor;

import com.design.patterns.command.abstraction.AbstractCommand;
import com.design.patterns.command.receiver.Receiver;

/**
 * Title: 具体命令B<br>
 * Description: ConcreteCommandB<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月17日 18:53
 *
 * @author jackie.scl
 */
public class ConcreteCommandB implements AbstractCommand {
  private Receiver receiver;

  public ConcreteCommandB() {
    receiver = new Receiver();
  }

  @Override
  public void execute() {
    receiver.actionB();
    receiver.actionC();
  }
}
