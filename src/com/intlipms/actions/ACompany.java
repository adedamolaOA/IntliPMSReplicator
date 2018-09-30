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

import com.intlipms.controller.CompanyController;
import com.intlipms.entities.Company;
import com.intlipms.utils.DateTypeConvertion;
import com.intlipms.utils.DisplayMessages;
import com.intlipms.utils.IAction;
import java.util.List;

/**
 *
 * @author Adedamola
 */
public class ACompany implements IAction{
    
    private final CompanyController ccc;
    private final static String PROCESS_NAME="Company";
    
    public ACompany(){
        ccc = new CompanyController();
    }
    
    /*
    Company Information Request Methods for uploading data from Microsoft SQL Server DB intlipms to webservice
    */
    @Override
    public void push() {
        DisplayMessages.start(PROCESS_NAME);
        
        List<Company> companies = ccc.get();
        
        DisplayMessages.dataSize(companies.size());
        for (Company company : companies) {
            action(company);
        }
        
        ccc.close();
        DisplayMessages.end(PROCESS_NAME);
    }

    @Override
    public void action(Object o) {
         Company c = (Company) o;
            com.intlipms.ws.Company cc = new com.intlipms.ws.Company();
            cc.setCompPhone1(c.getCompPhone1());
            cc.setCompRC(c.getCompRC());
            cc.setCompaddress(c.getCompaddress());
            cc.setCompanyid(c.getCompanyid());
            cc.setCompcity(c.getCompcity());
            cc.setCompemail(c.getCompemail());
            cc.setCompname(c.getCompname());
            cc.setCompothernames(c.getCompothernames());
            cc.setCompphone2(c.getCompphone2());
            cc.setCompreligion(c.getCompreligion());
            cc.setComptypeid(c.getComptypeid());
            cc.setCreatedBy(c.getCreatedBy());
            cc.setCuststate(c.getCuststate());
            cc.setDateCreated(DateTypeConvertion.get(c.getDateCreated()));
            cc.setDateUpdated(DateTypeConvertion.get(c.getDateUpdated()));
            cc.setDepartmentid(c.getDepartmentid());
            cc.setEmployeeid(c.getEmployeeid());
            cc.setGlobalId(c.getHotelId().getHotelId() + "" + c.getCompanyid());
            cc.setHotelId(c.getHotelId().getHotelId());
            cc.setReplicationStatus(Boolean.TRUE);
            cc.setUpdatedBy(c.getUpdatedBy());
            cc.setMaxCredit(c.getMaxCredit());

            DisplayMessages.uploading(cc.getGlobalId());
            uploadCompany(cc);
            
            DisplayMessages.updatingStatus(cc.getGlobalId());
            ccc.update(c.getCompanyid());
            
            DisplayMessages.dataEnd(cc.getGlobalId());
    }
    
    private static Boolean uploadCompany(com.intlipms.ws.Company company) {
        com.intlipms.ws.IntliPMSWebService_Service service = new com.intlipms.ws.IntliPMSWebService_Service();
        com.intlipms.ws.IntliPMSWebService port = service.getIntliPMSWebServicePort();
        return port.uploadCompany(company);
    }

       
}
