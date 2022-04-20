package tw.com.fcb.dolala.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FcbCoreCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(FcbCoreCommonApplication.class, args);
    }

}
