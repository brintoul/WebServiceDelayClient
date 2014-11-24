/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controlledthinking.test.client;

import com.controlledthinking.tester.DelayService;

/**
 *
 * @author brintoul
 */
public class DelayServiceRunnable implements Runnable {

    private DelayService port;
    
    public DelayServiceRunnable(DelayService port) {
        this.port = port;
    }
    
    @Override
    public void run() {
        port.delayFive();
    }
    
}
