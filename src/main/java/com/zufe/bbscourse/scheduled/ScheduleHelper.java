package com.zufe.bbscourse.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleHelper {
    @Scheduled(cron = "0 00 * * * *")
    public void recommend() throws Exception {
   //热评
  /*    count(comment)
         count(zan)
         count(fandui)
   */
        //新评
       //   return  select * from comment order id  desc limit 10;


        //我关注


        //推荐


        //最热课程
   /*    count(comment)
         count(关注)
         



*/

    }
}
