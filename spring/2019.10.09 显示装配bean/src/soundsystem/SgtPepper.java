package soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPepper implements CompactDisc {

    private String title="dddd";
    private String artist="dsds";
    @Override
    public void play() {
        System.out.println(title+artist);
    }
}
