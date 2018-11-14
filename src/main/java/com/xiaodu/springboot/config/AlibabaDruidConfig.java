package com.xiaodu.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author du_tian_jie
 * @version v1.0
 * @date 2018/11/14 9:42
 * @desc:
 */

@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
@PropertySource("classpath:application-druid.properties")
public class AlibabaDruidConfig extends DruidDataSource {

//    @Bean
//    public DataSource druid() {
//        return new DruidDataSource();
//    }

    /**
     * 配置druid  sevlet
     */
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(new StatViewServlet());
        servletRegistrationBean.setUrlMappings(Arrays.asList("/druid/*"));
        Map<String,String> initParams = new HashMap<>();
        initParams.put("loginUsername","admin");
        initParams.put("loginPassword","123456");
//        设置访问权限
        initParams.put("allow","");//默认就是允许所有访问  白名单
        initParams.put("deny","");  // 黑名单
        servletRegistrationBean.setInitParameters(initParams);
        return servletRegistrationBean;
    }

    /**
     * 配置druid filter
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {

        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());
        Map<String,String> initparams = new HashMap<>();
        initparams.put("exclusions","*.js,*.css,/druid/*");
        filterRegistrationBean.setInitParameters(initparams);
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        return filterRegistrationBean;
    }

}
