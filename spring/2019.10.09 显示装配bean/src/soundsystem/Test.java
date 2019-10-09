package soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfigBean.class);
        CDPlayer cdPlayer = (CDPlayer)context.getBean(CDPlayer.class);
        cdPlayer.play();
    }
}
