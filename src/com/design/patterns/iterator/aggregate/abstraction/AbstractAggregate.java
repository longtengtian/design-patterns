package com.design.patterns.iterator.aggregate.abstraction;

import com.design.patterns.iterator.iterator.abstraction.AbstractIterator;

import java.util.Iterator;

/**
 * Title: 抽象聚合<br>
 * Description: AbstractAggregate<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年07月18日 9:48
 *
 * @author jackie.scl
 */
public interface AbstractAggregate {
  public void add(Object obj);

  public void remove(Object obj);

  public AbstractIterator getIterator();
}
