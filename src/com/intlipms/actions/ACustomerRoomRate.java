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

import com.intlipms.controller.CustomerRoomRateController;
import com.intlipms.entities.Customerroomrate;
import com.intlipms.utils.DateTypeConvertion;
import com.intlipms.utils.DisplayMessages;
import com.intlipms.utils.IAction;
import java.util.List;

/**
 *
 * @author Adedamola
 */
public class ACustomerRoomRate implements IAction {

    CustomerRoomRateController crr;
    private final static String PROCESS_NAME = "Customer Room Rate";

    public ACustomerRoomRate() {
        crr = new CustomerRoomRateController();
    }

    @Override
    public void push() {
        DisplayMessages.start(PROCESS_NAME);
        List<Customerroomrate> customerRoomRates = crr.get();
        
        DisplayMessages.dataSize(customerRoomRates.size());
        for (Customerroomrate customerRoomRate : customerRoomRates) {
            action(customerRoomRate);
        }
        crr.close();
        DisplayMessages.end(PROCESS_NAME);
    }

    @Override
    public void action(Object o) {
        Customerroomrate c = (Customerroomrate) o;
        com.intlipms.ws.CustomerRoomRate cc = new com.intlipms.ws.CustomerRoomRate();
        cc.setApprovedby(c.getApprovedby());
        cc.setCustomerid(c.getCustomerid());
        cc.setCreatedBy(c.getCreatedBy());
        cc.setDateCreated(DateTypeConvertion.get(c.getDateCreated()));
        cc.setDateUpdated(DateTypeConvertion.get(c.getDateUpdated()));
        cc.setGlobalId(c.getHotelId().getHotelId() + "" + c.getCustomerid() + "" + c.getRoomrateid());
        cc.setHotelId(c.getHotelId().getHotelId());
        cc.setReplicationStatus(Boolean.TRUE);
        cc.setUpdatedBy(c.getUpdatedBy());
        cc.setEnddate(DateTypeConvertion.get(c.getEnddate()));
        cc.setRoomrate(c.getRoomrate());
        cc.setRoomrateguest(c.getRoomrateguest());
        cc.setRoomrateid(c.getRoomrateid());
        cc.setRoomtypeid(c.getRoomtypeid());
        cc.setStartdate(DateTypeConvertion.get(c.getStartdate()));

        DisplayMessages.uploading(cc.getGlobalId());
        uploadCustomerRoomRate(cc);
        
        DisplayMessages.updatingStatus(cc.getGlobalId());
        crr.update(c.getRoomrateid());
        
        DisplayMessages.dataEnd(cc.getGlobalId());
    }

    private static Boolean uploadCustomerRoomRate(com.intlipms.ws.CustomerRoomRate roomRate) {
        com.intlipms.ws.IntliPMSWebService_Service service = new com.intlipms.ws.IntliPMSWebService_Service();
        com.intlipms.ws.IntliPMSWebService port = service.getIntliPMSWebServicePort();
        return port.uploadCustomerRoomRate(roomRate);
    }
}
