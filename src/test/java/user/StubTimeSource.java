package user;

import java.time.LocalDateTime;

public class StubTimeSource implements TimeSource {

    @Override
    public LocalDateTime currentTime() {
        return LocalDateTime.now();
    }
}
