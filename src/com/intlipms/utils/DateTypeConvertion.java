/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intlipms.utils;

import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Adedamola
 */
public class DateTypeConvertion {
    public static XMLGregorianCalendar get(Date date) {
        XMLGregorianCalendar date2 = null;
        try {
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(date);
            date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (DatatypeConfigurationException e) {
            
        }
        return date2;

    }
}
