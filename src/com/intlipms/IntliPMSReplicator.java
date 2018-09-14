/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intlipms;

import com.intlipms.controller.CompanyController;
import com.intlipms.controller.CompanyRoomRateController;
import com.intlipms.controller.CustomerController;
import com.intlipms.controller.CustomerRoomRateController;
import com.intlipms.controller.MaintenanceController;
import com.intlipms.entities.Company;
import com.intlipms.entities.CompanyRommRate;
import com.intlipms.entities.Customer;
import com.intlipms.entities.Customerroomrate;
import com.intlipms.entities.MaintRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Adedamola
 */
public class IntliPMSReplicator {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args){
        // TODO code application logic here
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    maintenanceRequest();
                    customer();
                    company();
                    companyRoomRate();
                    customerRoomRate();
                    try {
                        Thread.sleep(300000L);// 5min = 300000ms = 0b1001001001111100000L
                    } catch (InterruptedException ex) {
                        Logger.getLogger(IntliPMSReplicator.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();

    }

    public static void maintenanceRequest() {
        System.out.println("Uploading Maintenance Request");
        System.out.println("===================================================================");

        MaintenanceController mc = new MaintenanceController();
        List<MaintRequest> maintenanceRequest = mc.getRequests();
        System.out.println("Upload Size: " + maintenanceRequest.size());
        for (int i = 0; i < maintenanceRequest.size(); i++) {
            MaintRequest m = maintenanceRequest.get(i);
            com.intlipms.ws.MaintRequest mr = new com.intlipms.ws.MaintRequest();
            mr.setAreaid(m.getAreaid());
            mr.setCostEsitmate(m.getCostEsitmate());
            mr.setCreatedBy(m.getCreatedBy());
            mr.setDateCreated(convertDate(m.getDateCreated()));
            mr.setDateUpdated(convertDate(m.getDateUpdated()));
            mr.setGlobalId(m.getHotelId() + "" + m.getRequestid());
            mr.setHotelId(m.getHotelId());
            mr.setIssueDesc(m.getIssueDesc());
            mr.setItemdesc(m.getItemdesc());
            mr.setItemid(m.getItemid());
            mr.setReplicationStatus(Boolean.TRUE);
            mr.setRequestServerity(m.getRequestServerity());
            mr.setRequestby(m.getRequestby());
            mr.setRequestdate(convertDate(m.getRequestdate()));
            mr.setRequestfixdate(convertDate(m.getRequestfixdate()));
            mr.setRequestid(m.getRequestid());
            mr.setStatus(m.getStatus());
            mr.setUpdatedBy(m.getUpdatedBy());
            System.out.println("Uploading record with ID: " + mr.getGlobalId());
            uploadMaintenanceRequest(mr);
            System.out.println("Updating replication status of record with ID: " + mr.getGlobalId());
            mc.update(m.getRequestid());
            System.out.println("Upload of record '" + mr.getGlobalId() + "' Completed\n ");

        }
        mc.close();
        System.out.println("Maintenance Record Batch Upload Completed\n");
    }

    public static void customer() {
        System.out.println("Uploading Customer Records");
        System.out.println("===================================================================");
        CustomerController ccc = new CustomerController();
        List<Customer> customer = ccc.get();
        System.out.println("Upload Size: " + customer.size());
        for (int i = 0; i < customer.size(); i++) {
            Customer c = customer.get(i);
            com.intlipms.ws.Customer cc = new com.intlipms.ws.Customer();
            cc.setCreatedBy(c.getCreatedBy());
            try {
                cc.setCustDOB(convertDate(new SimpleDateFormat("yyyy-MM-DD").parse(c.getCustDOB())));
            } catch (Exception e) {

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
            cc.setDateCreated(convertDate(c.getDateCreated()));
            cc.setDateUpdated(convertDate(c.getDateUpdated()));
            cc.setDepertmentid(c.getDepertmentid());
            cc.setEmployeeId(c.getEmployeeId());
            cc.setGlobalId(c.getHotelId().getHotelId() + "" + c.getCustomerid());
            cc.setHotelId(c.getHotelId().getHotelId());
            cc.setReplicationStatus(Boolean.TRUE);
            cc.setUpdatedBy(c.getUpdatedBy());
            cc.setVIPstatusid(c.getVIPstatusid());
            cc.setMaxCredit(c.getMaxCredit());

            System.out.println("Uploading record with ID: " + cc.getGlobalId());
            uploadCustomer(cc);
            System.out.println("Updating replication status of record with ID: " + cc.getGlobalId());
            ccc.update(c.getCustomerid());
            System.out.println("Upload of record '" + cc.getGlobalId() + "' Completed\n ");

        }
        ccc.close();
        System.out.println("Customer Record Batch Upload Completed\n");
    }

    public static void company() {
        System.out.println("Uploading Company Records");
        System.out.println("===================================================================");
        CompanyController ccc = new CompanyController();
        List<Company> company = ccc.get();
        System.out.println("Upload Size: " + company.size());
        for (int i = 0; i < company.size(); i++) {
            Company c = company.get(i);
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
            cc.setDateCreated(convertDate(c.getDateCreated()));
            cc.setDateUpdated(convertDate(c.getDateUpdated()));
            cc.setDepartmentid(c.getDepartmentid());
            cc.setEmployeeid(c.getEmployeeid());
            cc.setGlobalId(c.getHotelId().getHotelId() + "" + c.getCompanyid());
            cc.setHotelId(c.getHotelId().getHotelId());
            cc.setReplicationStatus(Boolean.TRUE);
            cc.setUpdatedBy(c.getUpdatedBy());
            cc.setMaxCredit(c.getMaxCredit());

            System.out.println("Uploading record with ID: " + cc.getGlobalId());
            uploadCompany(cc);
            System.out.println("Updating replication status of record with ID: " + cc.getGlobalId());
            ccc.update(c.getCompanyid());
            System.out.println("Upload of record '" + cc.getGlobalId() + "' Completed\n ");
        }
        ccc.close();
        System.out.println("Company Record Batch Upload Completed\n");
    }
    
    public static void companyRoomRate(){
          System.out.println("Uploading Company Room Rate Records");
        System.out.println("===================================================================");
        CompanyRoomRateController ccc = new CompanyRoomRateController();
        List<CompanyRommRate> company = ccc.get();
        System.out.println("Upload Size: " + company.size());
        for (int i = 0; i < company.size(); i++) {
            CompanyRommRate c = company.get(i);
            com.intlipms.ws.CompanyRommRate cc = new com.intlipms.ws.CompanyRommRate();
            cc.setApprovedby(c.getApprovedby());
            cc.setCompanyid(c.getCompanyid());
            cc.setCreatedBy(c.getCreatedBy());           
            cc.setDateCreated(convertDate(c.getDateCreated()));
            cc.setDateUpdated(convertDate(c.getDateUpdated()));           
            cc.setGlobalId(c.getHotelId() + "" + c.getCompanyid()+""+c.getRoomrateid());
            cc.setHotelId(c.getHotelId());
            cc.setReplicationStatus(Boolean.TRUE);
            cc.setUpdatedBy(c.getUpdatedBy());
            cc.setEnddate(convertDate(c.getEnddate()));
            cc.setRoomrate(c.getRoomrate());
            cc.setRoomrateguest(c.getRoomrateguest());
            cc.setRoomrateid(c.getRoomrateid());
            cc.setStartdate(convertDate(c.getStartdate()));
            

            System.out.println("Uploading record with ID: " + cc.getGlobalId());
            uploadCompanyRoomRate(cc);
            System.out.println("Updating replication status of record with ID: " + cc.getGlobalId());
            ccc.update(c.getRoomrateid());
            System.out.println("Upload of record '" + cc.getGlobalId() + "' Completed\n ");
        }
        ccc.close();
        System.out.println("Company Room Rate Record Batch Upload Completed\n");
    }
    
     public static void customerRoomRate(){
        System.out.println("Uploading Customer Room Rate Records");
        System.out.println("===================================================================");
        CustomerRoomRateController ccc = new CustomerRoomRateController();
        List<Customerroomrate> company = ccc.get();
        System.out.println("Upload Size: " + company.size());
        for (int i = 0; i < company.size(); i++) {
            Customerroomrate c = company.get(i);
            com.intlipms.ws.CustomerRoomRate cc = new com.intlipms.ws.CustomerRoomRate();
            cc.setApprovedby(c.getApprovedby());
            cc.setCustomerid(c.getCustomerid());
            cc.setCreatedBy(c.getCreatedBy());           
            cc.setDateCreated(convertDate(c.getDateCreated()));
            cc.setDateUpdated(convertDate(c.getDateUpdated()));           
            cc.setGlobalId(c.getHotelId().getHotelId() + "" + c.getCustomerid()+""+c.getRoomrateid());
            cc.setHotelId(c.getHotelId().getHotelId());
            cc.setReplicationStatus(Boolean.TRUE);
            cc.setUpdatedBy(c.getUpdatedBy());
            cc.setEnddate(convertDate(c.getEnddate()));
            cc.setRoomrate(c.getRoomrate());
            cc.setRoomrateguest(c.getRoomrateguest());
            cc.setRoomrateid(c.getRoomrateid());
            cc.setRoomtypeid(c.getRoomtypeid());
            cc.setStartdate(convertDate(c.getStartdate()));
            

            System.out.println("Uploading record with ID: " + cc.getGlobalId());
            uploadCustomerRoomRate(cc);
            System.out.println("Updating replication status of record with ID: " + cc.getGlobalId());
            ccc.update(c.getRoomrateid());
            System.out.println("Upload of record '" + cc.getGlobalId() + "' Completed\n ");
        }
        ccc.close();
        System.out.println("Customer Room Rate Record Batch Upload Completed\n");
    }

    private static Boolean uploadMaintenanceRequest(com.intlipms.ws.MaintRequest maintenanceRequest) {
        com.intlipms.ws.IntliPMSWebService_Service service = new com.intlipms.ws.IntliPMSWebService_Service();
        com.intlipms.ws.IntliPMSWebService port = service.getIntliPMSWebServicePort();
        return port.uploadMaintenanceRequest(maintenanceRequest);
    }

    public static XMLGregorianCalendar convertDate(Date date) {
        XMLGregorianCalendar date2 = null;
        try {
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(date);
            date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (Exception e) {

        }
        return date2;

    }

    private static Boolean uploadCustomer(com.intlipms.ws.Customer customer) {
        com.intlipms.ws.IntliPMSWebService_Service service = new com.intlipms.ws.IntliPMSWebService_Service();
        com.intlipms.ws.IntliPMSWebService port = service.getIntliPMSWebServicePort();
        return port.uploadCustomer(customer);
    }

    private static Boolean uploadCompany(com.intlipms.ws.Company company) {
        com.intlipms.ws.IntliPMSWebService_Service service = new com.intlipms.ws.IntliPMSWebService_Service();
        com.intlipms.ws.IntliPMSWebService port = service.getIntliPMSWebServicePort();
        return port.uploadCompany(company);
    }

    private static Boolean uploadCompanyRoomRate(com.intlipms.ws.CompanyRommRate roomRate) {
        com.intlipms.ws.IntliPMSWebService_Service service = new com.intlipms.ws.IntliPMSWebService_Service();
        com.intlipms.ws.IntliPMSWebService port = service.getIntliPMSWebServicePort();
        return port.uploadCompanyRoomRate(roomRate);
    }

    private static Boolean uploadCompanyPrivileges(com.intlipms.ws.CompanyPrivileges privilege) {
        com.intlipms.ws.IntliPMSWebService_Service service = new com.intlipms.ws.IntliPMSWebService_Service();
        com.intlipms.ws.IntliPMSWebService port = service.getIntliPMSWebServicePort();
        return port.uploadCompanyPrivileges(privilege);
    }

    private static Boolean uploadCompanyStaff(com.intlipms.ws.CompanyCustomer customerCompany) {
        com.intlipms.ws.IntliPMSWebService_Service service = new com.intlipms.ws.IntliPMSWebService_Service();
        com.intlipms.ws.IntliPMSWebService port = service.getIntliPMSWebServicePort();
        return port.uploadCompanyStaff(customerCompany);
    }

    private static Boolean uploadCustomerPrivileges(com.intlipms.ws.CustomerPrivileges privilege) {
        com.intlipms.ws.IntliPMSWebService_Service service = new com.intlipms.ws.IntliPMSWebService_Service();
        com.intlipms.ws.IntliPMSWebService port = service.getIntliPMSWebServicePort();
        return port.uploadCustomerPrivileges(privilege);
    }

    private static Boolean uploadCustomerRoomRate(com.intlipms.ws.CustomerRoomRate roomRate) {
        com.intlipms.ws.IntliPMSWebService_Service service = new com.intlipms.ws.IntliPMSWebService_Service();
        com.intlipms.ws.IntliPMSWebService port = service.getIntliPMSWebServicePort();
        return port.uploadCustomerRoomRate(roomRate);
    }

    private static Boolean uploadMaintenanceCosting(com.intlipms.ws.MaintCosting costing) {
        com.intlipms.ws.IntliPMSWebService_Service service = new com.intlipms.ws.IntliPMSWebService_Service();
        com.intlipms.ws.IntliPMSWebService port = service.getIntliPMSWebServicePort();
        return port.uploadMaintenanceCosting(costing);
    }

    private static Boolean uploadMaintenanceFunds(com.intlipms.ws.MaintFunds fund) {
        com.intlipms.ws.IntliPMSWebService_Service service = new com.intlipms.ws.IntliPMSWebService_Service();
        com.intlipms.ws.IntliPMSWebService port = service.getIntliPMSWebServicePort();
        return port.uploadMaintenanceFunds(fund);
    }

    private static Boolean uploadMaintenanceRequestApproval(com.intlipms.ws.MaintAproval approval) {
        com.intlipms.ws.IntliPMSWebService_Service service = new com.intlipms.ws.IntliPMSWebService_Service();
        com.intlipms.ws.IntliPMSWebService port = service.getIntliPMSWebServicePort();
        return port.uploadMaintenanceRequestApproval(approval);
    }
}
