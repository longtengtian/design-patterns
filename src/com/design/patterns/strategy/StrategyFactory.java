package com.design.patterns.strategy;

import com.design.patterns.strategy.service.StrategyService;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: 策略工厂<br>
 * Description: StrategyFactory<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年06月26日 19:07
 *
 * @author jackie.scl
 */
public class StrategyFactory {
  private Map<String, StrategyService> strategyMap = new HashMap<String, StrategyService>();

  /**
   * Title: 设置策略<br>
   * Description: put<br>
   * CreateDate: 2019/6/26 17:52<br>
   *
   * @category @author jackie.scl
   * @param key
   * @param strategyService
   * @return void
   * @exception Exception
   */
  public void put(String key, StrategyService strategyService) {
    strategyMap.put(key, strategyService);
  }

  /**
   * Title: 获取策略<br>
   * Description: get<br>
   * CreateDate: 2019/6/26 17:53<br>
   *
   * @category @author jackie.scl
   * @param key
   * @return com.design.patterns.strategy.service.StrategyService
   * @exception Exception
   */
  public StrategyService get(String key) {
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
