package com.assignment.saas_backend.repository;

import com.assignment.saas_backend.entity.Organization;
import com.assignment.saas_backend.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

    Optional<Subscription> findByOrganization(Organization organization);

}