package com.yoo.common;




import com.yoo.common.bean.Stu3;
import com.yoo.common.service.Stu3Service;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
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
