package com.zufe.bbscourse.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class scheduledTest {

    @Scheduled(cron = "0 00 * * * *")
    public void corn() throws Exception {
        System.out.println(new Date(System.currentTimeMillis()));
    }


}
