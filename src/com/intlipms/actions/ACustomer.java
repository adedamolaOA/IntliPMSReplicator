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

import com.intlipms.controller.CustomerController;
import com.intlipms.entities.Customer;
import com.intlipms.utils.DateTypeConvertion;
import com.intlipms.utils.DisplayMessages;
import com.intlipms.utils.IAction;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author Adedamola
 */
public class ACustomer implements IAction {
    
    private final CustomerController ccc;
    private final static String PROCESS_NAME = "Customer";
    
    public ACustomer() {
        ccc = new CustomerController();
    }

    /*
    Customer Information Methods for uploading data from Microsoft SQL Server DB intlipms to webservice
     */
    @Override
    public void push() {
        DisplayMessages.start(PROCESS_NAME);        
        List<Customer> customers = ccc.get();
        DisplayMessages.dataSize(customers.size());
        
        for (Customer customer : customers) {
            action(customer);
        }
        
        ccc.close();
        DisplayMessages.end(PROCESS_NAME);
    }
    
    @Override
    public void action(Object o) {
        Customer c = (Customer) o;
        com.intlipms.ws.Customer cc = new com.intlipms.ws.Customer();
        cc.setCreatedBy(c.getCreatedBy());
        try {
            cc.setCustDOB(DateTypeConvertion.get(new SimpleDateFormat("yyyy-MM-DD").parse(c.getCustDOB())));
        } catch (ParseException e) {
            
        }
        
        cc.setCustaddress(c.getCustaddress());
        cc.setCustcity(c.getCustcity());
        cc.setCustcountry(c.getCustcountry());
        cc.setCustemail(c.getCustemail());
        cc.setCustfirstName(c.getCustfirstName());
        cc.setCustlastname(c.getCustlastname());
        cc.setCustlistedname(c.getCustlistedname());
        cc.setCustomerid(c.getCustomerid());
        cc.setCustothername(c.getCustothername());
        cc.setCustphone1(c.getCustphone1());
        cc.setCustphone1Call(Short.parseShort("1"));
        cc.setCustphone1Sms(Short.parseShort("1"));
        cc.setCustphone1Whatsapp(Short.parseShort("1"));
        cc.setCustphone2(c.getCustphone2());
        cc.setCustreligion(c.getCustreligion());
        cc.setCustsex(c.getCustsex());
        cc.setCuststate(c.getCuststate());
        cc.setDateCreated(DateTypeConvertion.get(c.getDateCreated()));
        cc.setDateUpdated(DateTypeConvertion.get(c.getDateUpdated()));
        cc.setDepertmentid(c.getDepertmentid());
        cc.setEmployeeId(c.getEmployeeId());
        cc.setGlobalId(c.getHotelId().getHotelId() + "" + c.getCustomerid());
        cc.setHotelId(c.getHotelId().getHotelId());
        cc.setReplicationStatus(Boolean.TRUE);
        cc.setUpdatedBy(c.getUpdatedBy());
        cc.setVIPstatusid(c.getVIPstatusid());
        cc.setMaxCredit(c.getMaxCredit());
        
        DisplayMessages.uploading( cc.getGlobalId());
        uploadCustomer(cc);
        
        DisplayMessages.updatingStatus(cc.getGlobalId());
        ccc.update(c.getCustomerid());
        
        DisplayMessages.dataEnd( cc.getGlobalId());
    }
    
    private static Boolean uploadCustomer(com.intlipms.ws.Customer customer) {
        com.intlipms.ws.IntliPMSWebService_Service service = new com.intlipms.ws.IntliPMSWebService_Service();
        com.intlipms.ws.IntliPMSWebService port = service.getIntliPMSWebServicePort();
        return port.uploadCustomer(customer);
    }
    
}
