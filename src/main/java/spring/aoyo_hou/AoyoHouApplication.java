package spring.aoyo_hou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("spring.aoyo_hou.mapper")
public class AoyoHouApplication {

    public static void main(String[] args) {
        SpringApplication.run(AoyoHouApplication.class, args);
    }

}
