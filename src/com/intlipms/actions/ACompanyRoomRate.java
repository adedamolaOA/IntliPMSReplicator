/*
 * The MIT License
 *
 * Copyright 2018 Adedamola.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.intlipms.actions;

import com.intlipms.controller.CompanyRoomRateController;
import com.intlipms.entities.CompanyRommRate;
import com.intlipms.utils.DateTypeConvertion;
import com.intlipms.utils.DisplayMessages;
import com.intlipms.utils.IAction;
import java.util.List;

/**
 *
 * @author Adedamola
 */
public class ACompanyRoomRate implements IAction {
    
    CompanyRoomRateController crrController;
    private final static String PROCESS_NAME="Company Room Rate";

    public ACompanyRoomRate() {
        crrController = new CompanyRoomRateController();
    }

    @Override
    public void push() {
        DisplayMessages.start(PROCESS_NAME);
        
        List<CompanyRommRate> companyRoomRates = crrController.get();
        DisplayMessages.dataSize(companyRoomRates.size());
        for (CompanyRommRate companyRoomRate : companyRoomRates) {
            action(companyRoomRate);
        }
        crrController.close();
        DisplayMessages.end(PROCESS_NAME);
    }

    @Override
    public void action(Object o) {
        CompanyRommRate c = (CompanyRommRate) o;
        com.intlipms.ws.CompanyRommRate cc = new com.intlipms.ws.CompanyRommRate();
        cc.setApprovedby(c.getApprovedby());
        cc.setCompanyid(c.getCompanyid());
        cc.setCreatedBy(c.getCreatedBy());
        cc.setDateCreated(DateTypeConvertion.get(c.getDateCreated()));
        cc.setDateUpdated(DateTypeConvertion.get(c.getDateUpdated()));
        cc.setGlobalId(c.getHotelId() + "" + c.getCompanyid() + "" + c.getRoomrateid());
        cc.setHotelId(c.getHotelId());
        cc.setReplicationStatus(Boolean.TRUE);
        cc.setUpdatedBy(c.getUpdatedBy());
        cc.setEnddate(DateTypeConvertion.get(c.getEnddate()));
        cc.setRoomrate(c.getRoomrate());
        cc.setRoomrateguest(c.getRoomrateguest());
        cc.setRoomrateid(c.getRoomrateid());
        cc.setStartdate(DateTypeConvertion.get(c.getStartdate()));

        DisplayMessages.uploading(cc.getGlobalId());
        uploadCompanyRoomRate(cc);
        
        DisplayMessages.updatingStatus(cc.getGlobalId());
        crrController.update(c.getRoomrateid());
        
        DisplayMessages.dataEnd(cc.getGlobalId());
    }

    private static Boolean uploadCompanyRoomRate(com.intlipms.ws.CompanyRommRate roomRate) {
        com.intlipms.ws.IntliPMSWebService_Service service = new com.intlipms.ws.IntliPMSWebService_Service();
        com.intlipms.ws.IntliPMSWebService port = service.getIntliPMSWebServicePort();
        return port.uploadCompanyRoomRate(roomRate);
    }

}
