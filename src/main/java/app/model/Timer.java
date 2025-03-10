package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Timer {

    private static final Long fixedTime = System.nanoTime();

    public Long getTime() {
        return fixedTime;
    }
}
