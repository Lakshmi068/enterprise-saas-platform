package com.assignment.saas_backend.dto.request;

public class OrganizationRequest {

    private String organizationName;

    public OrganizationRequest() {
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}