package com.jourwon.designpattern.j2ee.businessdelegate;

/**
 * Description:创建业务代表。
 *
 * @author JourWon
 * @date 2019/7/17 16:45
 */
public class BusinessDelegate {

    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }

}
