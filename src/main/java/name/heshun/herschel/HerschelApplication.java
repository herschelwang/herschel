package name.heshun.herschel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HerschelApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HerschelApplication.class, args);
        // 属性装配
        context.getBean(WebConfig.class).show();
        // 对象装配
        context.getBean(DataSourceProperties.class).show();

    }
}
