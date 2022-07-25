package com.felipejardim.galo;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Relogio implements Runnable{
    private ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

    public Relogio(){}
    public Relogio(ScheduledExecutorService service){
        this.service = service;
    }

    @Override
    public void run(){
        String hora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));

        switch (hora){
            case "06:00":
                System.out.println("BOM DIA");
                break;
            case "12:00":
                System.out.println("BOA TARDE");
                break;
            case "18:01":
                System.out.println("BOA NOITE");
                break;
        }

        service.schedule(new Relogio(service),1, TimeUnit.MINUTES);
    }
}
