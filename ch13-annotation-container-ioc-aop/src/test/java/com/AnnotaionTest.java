package com;

import com.service.EmployeeService;
import com.service.impl.EmployeeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author cj
 * @date 2019/11/4
 */
public class AnnotaionTest {

    /**
     * 配置元数据可以通过xml+注解的形式来实现
     * 做法如下:
     * 1.在xml中配置context:compent-scan
     * 2.实例化classpathxmlapplicationContext,使用第一步的xml文件
     * 3.在需要被管理的bean上面添加注解,这些bean所在的包必须是第一步设置的扫描
     * 范围之内
     * 注解有如下几个:
     * 1.Controller
     * 2.Repository
     * 3.Service
     * 4.Component
     *
     * 本质上,这4个注解作用是一样的...因为他们都是有Component修饰的
     *
     * 4个注解建议使用方式如下:
     * 1.Controller注解用在控制器类上面,spring mvc之后就用到
     * 目前不能用在servlet
     * 2.Service注解用在业务类
     * 3.Repository用在dao上面,在某个spring版本之后,对Repository注解
     * 额外添加了功能,比如把数据库操作的相关异常,转换为spring的DataAccessException
     * 异常体系
     * 4.所有上面3个注解不合用的地方就用Component,比如读取properties文件到一个类上面
     * 就可以用Component
     */
    @Test
    public void testAnnoHelloWorld(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService service = context.getBean(EmployeeService.class);
        System.out.println(service);
    }

    @Test
    public void testAnno_ioc(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeService service = context.getBean(EmployeeService.class);
       service.update();
    }


    @Test
    public void testAnno_ioc_collection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeServiceImpl service = context.getBean(EmployeeServiceImpl.class);
        service.displayAutowireCollectionInject();
    }
}
