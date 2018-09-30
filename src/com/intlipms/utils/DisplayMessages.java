/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intlipms.utils;

/**
 *
 * @author Adedamola
 */
public class DisplayMessages {
    
    public static void start(String name){
        System.out.println("===================================================================");
        System.out.println("Starting  "+name+" Data upload process");
        System.out.println("===================================================================");
    }
    
    public static void dataSize(int size){
        System.out.println("Upload Size: " + size);
    }
    
    public static void uploading(String id){
        System.out.println("Uploading data with Global ID: " + id);
    }
    
    public static void updatingStatus(String id){
        System.out.println("Updating replication status of data with Global ID: " + id);
    }
    
    public static void dataEnd(String id){
        System.out.println("Upload of data with Global ID '" + id + "' Complete\n ");
    }
    
    public static void end(String name){
        System.out.println("===================================================================");
        System.out.println(name+" upload process complete.");
        System.out.println("===================================================================\n");
    }
}
