package com.examly.springapp.model;

import org.hibernate.annotations.GenericGenerator;


import javax.persistence.*;

@Entity
@Table(name="service")
public class ServiceCenterModel {
    @Id
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator="UUID")
    private String serviceCenterID;

    private String serviceCenterName;
    private String serviceCenterPhone;
    private String serviceCenterAddress;
    private String serviceCenterMailId;

    @Column(length=50)
    private String serviceCenterDescription;

    private String serviceCenterImageUrl;


    public void setServiceCenterID(String serviceCenterID) {
        this.serviceCenterID = serviceCenterID;
    }

    public void setServiceCenterName(String serviceCenterName) {
        this.serviceCenterName = serviceCenterName;
    }

    public void setServiceCenterPhone(String serviceCenterPhone) {
        this.serviceCenterPhone = serviceCenterPhone;
    }

    public void setServiceCenterAddress(String serviceCenterAddress) {
        this.serviceCenterAddress = serviceCenterAddress;
    }

    public void setServiceCenterMailId(String serviceCenterMailId) {
        this.serviceCenterMailId = serviceCenterMailId;
    }

    public void setServiceCenterImageUrl(String serviceCenterImageUrl) {
        this.serviceCenterImageUrl = serviceCenterImageUrl;
    }

    public void setServiceCenterDescription(String serviceCenterDescription) {
        this.serviceCenterDescription = serviceCenterDescription;
    }

    public String getServiceCenterID() {
        return serviceCenterID;
    }

    public String getServiceCenterName() {
        return serviceCenterName;
    }

    public String getServiceCenterPhone() {
        return serviceCenterPhone;
    }

    public String getServiceCenterAddress() {
        return serviceCenterAddress;
    }

    public String getServiceCenterMailId() {
        return serviceCenterMailId;
    }

    public String getServiceCenterImageUrl() {
        return serviceCenterImageUrl;
    }

    public String getServiceCenterDescription() {
        return serviceCenterDescription;
    }

    public void setServiceCenterID(Long serviceCenterID2) {
    }
}
