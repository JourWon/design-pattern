package com.jourwon.designpattern.j2ee.businessdelegate;

/**
 * Description:
 *
 * @author JourWon
 * @date 2019/7/17 16:44
 */
public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EjbService();
        } else {
            return new JmsService();
        }
    }

}
