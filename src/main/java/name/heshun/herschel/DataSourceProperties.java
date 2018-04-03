package name.heshun.herschel;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: heshun
 * @date: 2018/3/16
 * @content: 对象装配
 */
@Component
@ConfigurationProperties(prefix = "database")
public class DataSourceProperties {
    private String url;

    private String driverClassName;

    private String userName;

    private String password;


    public void show() {
        System.out.println("对象装配: database.url=" + this.url);
        System.out.println("对象装配: database.driverClassName=" + this.driverClassName);
        System.out.println("对象装配: database.userName=" + this.userName);
        System.out.println("对象装配: database.password=" + this.password);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}