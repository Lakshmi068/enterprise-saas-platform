package com.assignment.saas_backend.dto.request;

public class SubscriptionRequest {

    private Long organizationId;
    private String plan;

    public SubscriptionRequest() {
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
}