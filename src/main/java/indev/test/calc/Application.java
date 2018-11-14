package indev.test.calc;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
//        ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
//        BeanDefinitionRegistry registry = (BeanDefinitionRegistry) ctx.getAutowireCapableBeanFactory();
//        for(String beanName : ctx.getBeanDefinitionNames()){
////            System.out.println(beanName);
//            System.out.println(Arrays.toString(registry.getBeanDefinitionNames()));
//        }
        SpringApplication.run(Application.class, args);
    }
}
