package com.assignment.saas_backend.service;

import com.assignment.saas_backend.entity.Feature;
import com.assignment.saas_backend.entity.PlanType;
import org.springframework.stereotype.Service;

import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

@Service
public class FeatureService {

    private final Map<PlanType, Set<Feature>> featureMap =
            Map.of(

                    PlanType.FREE,
                    EnumSet.of(
                            Feature.AI_CHAT
                    ),

                    PlanType.PRO,
                    EnumSet.of(
                            Feature.AI_CHAT,
                            Feature.EXPORT_DATA,
                            Feature.ANALYTICS
                    ),

                    PlanType.ENTERPRISE,
                    EnumSet.allOf(Feature.class)
            );

    public boolean hasFeature(
            PlanType plan,
            Feature feature) {

        return featureMap.get(plan).contains(feature);
    }
}