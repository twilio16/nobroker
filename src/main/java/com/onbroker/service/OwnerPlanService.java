package com.onbroker.service;

import com.onbroker.payload.OwnerPlanDto;

import java.util.List;

public interface OwnerPlanService {

    public OwnerPlanDto createOwnerPlans(OwnerPlanDto ownerPlanDto);

    List<OwnerPlanDto> getAllOwnerPlans();
}
