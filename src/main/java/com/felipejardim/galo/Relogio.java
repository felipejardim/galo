package com.felipejardim.galo;

import java.util.Calendar;

public class Relogio implements Runnable{
    @Override
    public void run(){

        while(true) {
            Calendar calendario = Calendar.getInstance();

            switch (calendario.get(Calendar.HOUR_OF_DAY)) {
                case 8:
                    System.out.println("BOM DIA");
                    break;
                case 12:
                    System.out.println("BOA TARDE");
                    break;
                case 17:
                    if (calendario.get(Calendar.MINUTE) == 30)
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
