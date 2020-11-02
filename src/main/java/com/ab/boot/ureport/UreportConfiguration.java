package com.ab.boot.ureport;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author yuenbo
 */
@Configuration
@ImportResource("classpath:ureport-console-context.xml")
public class UreportConfiguration {


    @Bean
    public ServletRegistrationBean ureportServlet(){
        return new ServletRegistrationBean(new UReportServlet(), "/ureport/*");
    }
}
