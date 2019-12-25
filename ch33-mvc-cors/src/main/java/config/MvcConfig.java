package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @author cj
 * @date 2019/11/25
 */

@Configuration
@EnableWebMvc
@ComponentScan({"com.controller"})
public class MvcConfig implements WebMvcConfigurer {



    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views", ".jsp");
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        ResourceHandlerRegistration registration
                = registry.addResourceHandler("/static/**");
        registration.addResourceLocations("classpath:/static/");
    }


    @Override
    public void addCorsMappings(CorsRegistry registry) {
       // registry.addMapping("/list"); //相当于在某个控制器方法上的requestMapping值为/list上面添加@CrossOrigin注解
        /*registry.addMapping("/list")
                .allowedOrigins("http://127.0.0.1:8848")
                .allowedMethods("GET","POST","OPTIONS");
*/
        //地址是/**,表示所有的请求都配置了跨域
       /* registry.addMapping("/**")
                .allowedOrigins("http://127.0.0.1:8848")
                .allowedMethods("GET","POST","OPTIONS");*/
    }
}
