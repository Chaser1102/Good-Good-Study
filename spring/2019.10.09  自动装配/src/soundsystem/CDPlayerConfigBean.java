package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfigBean {

    @Bean
    public CompactDisc sgtPeppers(){
        return new SgtPepper();
    }
}
