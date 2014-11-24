/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlledthinking.test.client;

import com.controlledthinking.tester.DelayService;
import com.controlledthinking.tester.DelayService_Service;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author brintoul
 */
public class DelayServiceCaller {
    
    private final ExecutorService executorService;
    private final DelayService port;

    public DelayServiceCaller() {
        this.executorService = Executors.newFixedThreadPool(3);        
        DelayService_Service service = new DelayService_Service();
        this.port = service.getDelayServicePort();
    }
    
    public void callOldFashioned() {
        long timeStart = System.currentTimeMillis();
        String answer5 = delayFive();
        System.out.println("The answer is: " + answer5);
        String answer10 = delayTen();
        System.out.println("The answer is: " + answer10);
        String answer15 = delayFifteen();
        System.out.println("The answer is: " + answer15);
        long timeEnd = System.currentTimeMillis();
        
        System.out.println("Total Execution Time: " + (timeEnd - timeStart)/1000);
    }

    public void callNewFashioned() {
        long timeStart = System.currentTimeMillis();
        DelayServiceRunnable runner5 = new DelayServiceRunnable(port);
        executorService.submit(() -> {
            port.delayFive();
        });
        executorService.submit(() -> {
            port.delayTen();
        });
        executorService.submit(() -> {
            port.delayFifteen();
        });
        long timeEnd = System.currentTimeMillis();
        System.out.println("Total Execution Time: " + (timeEnd - timeStart)/1000);
    }

    private String delayFive() {
        
        return port.delayFive();
    }

    private String delayTen() {

        return port.delayTen();
    }
    
    private String delayFifteen() {

        return port.delayFifteen();
    }

}
