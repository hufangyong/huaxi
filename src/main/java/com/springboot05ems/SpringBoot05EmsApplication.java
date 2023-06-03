package com.springboot05ems;

import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

//扫描mapper包路径
@MapperScan({"com.springboot05ems.mapper"})
@SpringBootApplication
public class SpringBoot05EmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot05EmsApplication.class, args);
    }
    //配置了Swagger 的Docket的bean实例
    @Bean
    public Docket docket(){

        ParameterBuilder ticketPar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        ticketPar.name("Authorization").description("token")//Token 以及Authorization 为自定义的参数，session保存的名字是哪个就可以写成那个
                .modelRef(new ModelRef("string")).parameterType("header")
                .required(false).build(); //header中的ticket参数非必填，传空也可以
        pars.add(ticketPar.build());    //根据每个方法名也知道当前方法在设置什么参数

        return new Docket(DocumentationType.SPRING_WEB)
                .apiInfo(apiInfo())
                .select()
                //RequestHandlerSelectors, 配置要扫描接口的方式
                //basePackage:指定要扫描的包
                //any():扫描全部
                //withClassAnnotation: 扫描类上的注解
                //withMethodAnnotation: 扫描方法上的注解
                //  .apis(RequestHandlerSelectors.basePackage("com.example.swagger.controller"))
                .apis(RequestHandlerSelectors.basePackage("com.springboot05ems.controller"))
                .build()
                .globalOperationParameters(pars);
    }

    //配置Swagger 信息=apiInfo
    private ApiInfo apiInfo(){
        return new ApiInfo(
                "Logistics Api",//文檔命名
                "test",//文檔描述
                "v1.0",//
                "http:127.0.0.1/",
                null,//contact
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList()
        );
    }
}
