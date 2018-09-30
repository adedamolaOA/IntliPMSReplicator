/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intlipms.actions;

import com.intlipms.controller.MaintenanceController;
import com.intlipms.entities.MaintRequest;
import com.intlipms.utils.DateTypeConvertion;
import com.intlipms.utils.DisplayMessages;
import com.intlipms.utils.IAction;
import java.util.List;

/**
 *
 * @author Adedamola
 */
public class MaintenanceRequest implements IAction {

    private final MaintenanceController mc;
    private final static String PROCESS_NAME="Maintenance Request";
    
    public MaintenanceRequest(){
         mc = new MaintenanceController();
    }
    
     /*
    Maintenance Request Methods for uploading data from Microsoft SQL Server DB intlipms to webservice
    */
    @Override
    public void push() {        
        DisplayMessages.start(PROCESS_NAME);
        List<MaintRequest> maintenanceRequests = mc.getRequests();
        DisplayMessages.dataSize(maintenanceRequests.size());
        
        //Loop of data from the SQL Database Table Manit_Request
        for (MaintRequest m: maintenanceRequests) {
            action(m);
        }
        
        // Close Controller Connection to Database        
        mc.close();
        DisplayMessages.end(PROCESS_NAME);
    }

    //Upload Action for single Maintenance Request
    @Override
    public void action(Object o) {
        MaintRequest m = (MaintRequest) o;
        com.intlipms.ws.MaintRequest mr = new com.intlipms.ws.MaintRequest();
        mr.setAreaid(m.getAreaid());
        mr.setCostEsitmate(m.getCostEsitmate());
        mr.setCreatedBy(m.getCreatedBy());
        mr.setDateCreated(DateTypeConvertion.get(m.getDateCreated()));
        mr.setDateUpdated(DateTypeConvertion.get(m.getDateUpdated()));
        mr.setGlobalId(m.getHotelId() + "" + m.getRequestid());
        mr.setHotelId(m.getHotelId());
        mr.setIssueDesc(m.getIssueDesc());
        mr.setItemdesc(m.getItemdesc());
        mr.setItemid(m.getItemid());
        mr.setReplicationStatus(Boolean.TRUE);
        mr.setRequestServerity(m.getRequestServerity());
        mr.setRequestby(m.getRequestby());
        mr.setRequestdate(DateTypeConvertion.get(m.getRequestdate()));
        mr.setRequestfixdate(DateTypeConvertion.get(m.getRequestfixdate()));
        mr.setRequestid(m.getRequestid());
        mr.setStatus(m.getStatus());
        mr.setUpdatedBy(m.getUpdatedBy());

        DisplayMessages.uploading(mr.getGlobalId());
        uploadMaintenanceRequest(mr);
        
        DisplayMessages.updatingStatus(mr.getGlobalId());
        mc.update(m.getRequestid());
        
        DisplayMessages.dataEnd(mr.getGlobalId());
    }

    //Webservice Method for uploading data to Central Update Server
    private static Boolean uploadMaintenanceRequest(com.intlipms.ws.MaintRequest maintenanceRequest) {
        com.intlipms.ws.IntliPMSWebService_Service service = new com.intlipms.ws.IntliPMSWebService_Service();
        com.intlipms.ws.IntliPMSWebService port = service.getIntliPMSWebServicePort();
        return port.uploadMaintenanceRequest(maintenanceRequest);
    }

}
