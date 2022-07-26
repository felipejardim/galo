package com.felipejardim.galo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Relogio implements Runnable{
    @Override
    public void run(){

        while(true) {
            Date data = new Date();

            switch (data.getHours()) {
                case 8:
                    System.out.println("BOM DIA");
                    break;
                case 12:
                    System.out.println("BOA TARDE");
                    break;
                case 17:
                    if (data.getMinutes() == 30)
                        System.out.println("BOA NOITE");
                    break;
            }

            try {
                Thread.sleep(60000);            // aguarda 1min
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
