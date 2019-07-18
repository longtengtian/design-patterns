package com.design.patterns.iterator.iterator.implementor;

import java.util.List;

import com.design.patterns.iterator.iterator.abstraction.AbstractIterator;

/**
 * Title: 具体迭代<br>
 * Description: ConcreteIterator<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月18日 9:54
 *
 * @author jackie.scl
 */
public class ConcreteIterator implements AbstractIterator {
  private List<Object> list = null;
  private int index = -1;

  public ConcreteIterator(List<Object> list) {
    this.list = list;
  }

  @Override
  public Object first() {
    index = 0;
    Object obj = list.get(index);;
    return obj;
  }

  @Override
  public Object next() {
    Object obj = null;
    if (this.hasNext()) {
      obj = list.get(++index);
    }
    return obj;
  }

  @Override
  public boolean hasNext() {
    if (index < list.size() - 1) {
      return true;
    } else {
      return false;
    }
  }
}
