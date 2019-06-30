package com.design.patterns.proxy.service.serviceImpl;

import com.design.patterns.proxy.service.SubjectService;

/**
 * Title: RealSubjectServiceImpl<br>
 * Description: RealSubjectServiceImpl<br>
 * Company:韦博英语在线教育部</br>
 * CreateDate:2019年06月30日 17:54
 *
 * @author jackie.scl
 */
public class RealSubjectServiceImpl implements SubjectService {
    @Override
    public void request() {
        System.out.println("当前访问的是真实主题方法！");
    }
}
