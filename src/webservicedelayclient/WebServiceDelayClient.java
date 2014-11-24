/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicedelayclient;

import com.controlledthinking.test.client.DelayServiceCaller;

/**
 *
 * @author brintoul
 */
public class WebServiceDelayClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DelayServiceCaller caller = new DelayServiceCaller();
        caller.callOldFashioned();
        caller.callNewFashioned();
    }    
}
