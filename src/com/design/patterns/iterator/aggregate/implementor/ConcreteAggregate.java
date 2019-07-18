package com.design.patterns.iterator.aggregate.implementor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.design.patterns.iterator.aggregate.abstraction.AbstractAggregate;
import com.design.patterns.iterator.iterator.abstraction.AbstractIterator;
import com.design.patterns.iterator.iterator.implementor.ConcreteIterator;

/**
 * Title: 具体聚合<br>
 * Description: ConcreteAggregate<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月18日 9:51
 *
 * @author jackie.scl
 */
public class ConcreteAggregate implements AbstractAggregate {
  private List<Object> list = new ArrayList<Object>();

  @Override
  public void add(Object obj) {
    list.add(obj);
  }

  @Override
  public void remove(Object obj) {
    list.remove(obj);
  }

  @Override
  public AbstractIterator getIterator() {
    return new ConcreteIterator(list);
  }
}
