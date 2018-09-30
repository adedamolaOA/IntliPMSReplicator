/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intlipms.controller;
import com.intlipms.entities.CompanyRommRate;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Adedamola
 */
public class CompanyRoomRateController {
    private static final String PERSISTENCE_UNIT_NAME = "IntliPMSReplicatorPU";
    private static EntityManagerFactory factory;
        private static final String PARAMETER = "replicationStatus";
    EntityManager em;
    public List<CompanyRommRate> get(){
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        em = factory.createEntityManager();
        // read the existing entries and write to console
        Query q = em.createNamedQuery("CompanyRommRate.findByReplicationStatus").setParameter(PARAMETER, false);
        
        List<CompanyRommRate> requestList = q.getResultList();
        //em.close();
        return requestList;
    }
    
    public void update(int id) {
        CompanyRommRate c = em.find(CompanyRommRate.class, id);

        em.getTransaction().begin();
        c.setReplicationStatus(true);
        em.getTransaction().commit();
    }
    
    public void close(){
        em.close();
    }
}
