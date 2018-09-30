/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intlipms;

import com.intlipms.actions.ACompany;
import com.intlipms.actions.ACompanyRoomRate;
import com.intlipms.actions.ACustomer;
import com.intlipms.actions.ACustomerRoomRate;
import com.intlipms.actions.MaintenanceRequest;
import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author Adedamola
 */
public class IntliPMSReplicator extends TimerTask{

    
    @Override
    public void run() {
        // Push Maintenancce Request Data to Webservice
        new MaintenanceRequest().push();
        // Push Customer Data to Webservice
        new ACustomer().push();
        // Push Customer Room Rate Data to Webservice
        new ACustomerRoomRate().push();
        // Push Company Data to Webservice
        new ACompany().push();
        // Push Company Room Rate Data to Webservice
        new ACompanyRoomRate().push();
    }
    
    //Set Timer Task for Replication process
    public void RunJob() {
        TimerTask task = new IntliPMSReplicator();

        Timer timer = new Timer();

        timer.schedule(task, 1000, 1000 * 60 * 30);       
      
    }
    
    public static void main(String[] args) {
        new IntliPMSReplicator().RunJob();
    }    
    
}
