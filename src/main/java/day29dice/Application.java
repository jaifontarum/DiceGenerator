package day29dice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.DriverManager;
import java.util.Properties;
import java.sql.Connection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;


@SpringBootApplication
public class Application {

	public static void main(String[] args)  {
        SpringApplication.run(Application.class, args);
        
        
}
}
