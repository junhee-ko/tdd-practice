package user;

import java.time.LocalDateTime;

public interface TimeSource {
    LocalDateTime currentTime();
}
