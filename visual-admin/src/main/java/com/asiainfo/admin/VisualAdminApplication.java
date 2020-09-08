package com.asiainfo.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author wangjingyuan
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class VisualAdminApplication {

    public static void main(String[] args) {

        SpringApplication.run(VisualAdminApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  数据可视化中心启动成功   ლ(´ڡ`ლ)ﾞ  \n" );
    }


}
