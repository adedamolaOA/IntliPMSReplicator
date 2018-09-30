/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intlipms.controller;

import com.intlipms.entities.Company;
import com.intlipms.entities.Customer;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Adedamola
 */
public class CustomerController {
    private static final String PERSISTENCE_UNIT_NAME = "IntliPMSReplicatorPU";
    private static final String PARAMETER = "replicationStatus";
    private static EntityManagerFactory factory;
    EntityManager em;
    public List<Customer> get(){
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        em = factory.createEntityManager();
        // read the existing entries and write to console
        Query q = em.createNamedQuery("Company.findByReplicationStatus").setParameter(PARAMETER, false);
        
        List<Customer> requestList = q.getResultList();
       
        return requestList;
    }
    
    public void update(int id) {
        Customer c = em.find(Customer.class, id);

        em.getTransaction().begin();
        c.setReplicationStatus(true);
        em.getTransaction().commit();
    }
    
    public void close(){
        em.close();
    }
}
