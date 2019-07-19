package com.design.patterns.strategy;

import java.util.HashMap;
import java.util.Map;

import com.design.patterns.strategy.abstraction.AbstractStrategy;

/**
 * Title: 策略环境<br>
 * Description: StrategyContext<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年06月26日 19:07
 *
 * @author jackie.scl
 */
public class StrategyContext {
  private Map<String, AbstractStrategy> strategyMap = new HashMap<String, AbstractStrategy>();

  /**
   * Title: 设置策略<br>
   * Description: put<br>
   * CreateDate: 2019/6/26 17:52<br>
   *
   * @category @author jackie.scl
   * @param key
   * @param abstractStrategy
   * @return void
   * @exception Exception
   */
  public void put(String key, AbstractStrategy abstractStrategy) {
    strategyMap.put(key, abstractStrategy);
  }

  /**
   * Title: 获取策略<br>
   * Description: get<br>
   * CreateDate: 2019/6/26 17:53<br>
   *
   * @category @author jackie.scl
   * @param key
   * @return com.design.patterns.strategy.abstraction.StrategyService
   * @exception Exception
   */
  public AbstractStrategy get(String key) {
    return strategyMap.get(key);
  }

  /**
   * Title: 策略实现方法<br>
   * Description: strategyMethod<br>
   * CreateDate: 2019/6/26 17:54<br>
   *
   * @category @author jackie.scl
   * @param key
   * @return void
   * @exception Exception
   */
  public void strategyMethod(String key) {
    get(key).strategyMethod();
  }
}
