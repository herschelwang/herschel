package name.heshun.herschel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @author: heshun
 * @date: 2018/3/16
 * @content: 属性装配
 */
@Configuration
public class WebConfig {
    @Value("${database.userName}")
    private String userName;
    @Autowired
    private Environment environment;

    public void show() {
        System.out.println("属性装配: database.userName:" + this.userName);
        System.out.println("属性装配: database.password:" + this.environment.getProperty("database.password"));
    }
}