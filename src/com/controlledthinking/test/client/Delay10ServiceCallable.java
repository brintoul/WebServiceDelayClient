/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlledthinking.test.client;

import com.controlledthinking.tester.DelayService;
import java.util.concurrent.Callable;

/**
 *
 * @author brintoul
 */
public class Delay10ServiceCallable implements Callable<String> {

    private final DelayService port;

    public Delay10ServiceCallable(DelayService port) {
        this.port = port;
    }

    
    
    @Override
    public String call() throws Exception {
        return port.delayTen();
    }
    
}
