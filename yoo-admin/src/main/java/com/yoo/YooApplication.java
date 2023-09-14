package com.yoo;





import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.yoo.**.mapper")
//@ComponentScan("com.yoo.**.service""com.yoo.common.core.**")
@SpringBootApplication(scanBasePackages = "com.yoo.**")
public class YooApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(YooApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  Yoo启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "Yb  dP .d88b. .d88b. \n" +
                " YbdP  8P  Y8 8P  Y8 \n" +
                "  YP   8b  d8 8b  d8 \n" +
                "  88   `Y88P' `Y88P' \n");

    }

}
