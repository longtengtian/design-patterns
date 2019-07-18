package com.design.patterns.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.design.patterns.visitor.element.abstraction.AbstractElement;
import com.design.patterns.visitor.visitor.abstraction.AbstractVisitor;

/**
 * Title: 对象结构<br>
 * Description: ObjectStructure<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月18日 18:46
 *
 * @author jackie.scl
 */
public class ObjectStructure {
  private List<AbstractElement> list = new ArrayList<AbstractElement>();

  public void accept(AbstractVisitor visitor) {
    Iterator<AbstractElement> i = list.iterator();
    while (i.hasNext()) {
      i.next().accept(visitor);
    }
  }

  public void add(AbstractElement element) {
    list.add(element);
  }

  public void remove(AbstractElement element) {
    list.remove(element);
  }
}
