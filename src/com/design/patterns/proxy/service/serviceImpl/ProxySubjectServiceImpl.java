package com.design.patterns.proxy.service.serviceImpl;

import com.design.patterns.proxy.service.SubjectService;

/**
 * Title: ProxySubjectServiceImpl<br>
 * Description: ProxySubjectServiceImpl<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年06月30日 17:58
 *
 * @author jackie.scl
 */
public class ProxySubjectServiceImpl implements SubjectService {
    private RealSubjectServiceImpl realSubjectService;

    @Override
    public void request() {
        if (null == realSubjectService) {
            realSubjectService = new RealSubjectServiceImpl();
        }
        preRequest();
        realSubjectService.request();
        postRequest();
    }

    void preRequest() {
        System.out.println("当前是访问真实主题之前的预处理！");
    }

    void postRequest() {
        System.out.println("当前是访问真实主题之后的后置处理！");
    }
}
