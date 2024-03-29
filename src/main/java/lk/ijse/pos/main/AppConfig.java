package lk.ijse.pos.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@ComponentScan("lk.ijse.pos")
@Configuration
@Import(HibernateConfig.class)
public class AppConfig {
}
