package org.demo.practical.beanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class config {

    @Bean
    public Prachi getPrachi(){
        Prachi p=new Prachi("I'll do my job");
        return p;
    }

    @Bean
    public Aditya getAditya(){
        Aditya a=new Aditya(getPrachi());
        return a;
    }
}
