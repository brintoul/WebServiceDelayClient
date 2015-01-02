/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlledthinking.test.client;

import com.controlledthinking.tester.DelayService;
import com.controlledthinking.tester.DelayService_Service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Collection<DelayServiceRunnable> tasks;
        tasks = new ArrayList<>();
        tasks.add( runner5 );
        try {
            executorService.invokeAll(tasks);
        } catch (InterruptedException ex) {
            Logger.getLogger(DelayServiceCaller.class.getName()).log(Level.SEVERE, null, ex);
        }
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
