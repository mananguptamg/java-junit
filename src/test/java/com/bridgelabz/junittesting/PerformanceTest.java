package com.bridgelabz.junittesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class PerformanceTest {

    @Test
    @Timeout(2)
    public void longRunningTask() throws InterruptedException{
        Thread.sleep(3000);

    }
}
