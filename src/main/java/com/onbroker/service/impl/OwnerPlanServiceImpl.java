package com.onbroker.service.impl;

import com.onbroker.entity.OwnerPlan;
import com.onbroker.payload.OwnerPlanDto;
import com.onbroker.repository.OwnerPlanRepository;
import com.onbroker.service.OwnerPlanService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class OwnerPlanServiceImpl implements OwnerPlanService {

    private OwnerPlanRepository ownerPlanRepository;

    private ModelMapper modelMapper;

    public OwnerPlanServiceImpl(OwnerPlanRepository ownerPlanRepository, ModelMapper modelMapper) {
        this.ownerPlanRepository = ownerPlanRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public OwnerPlanDto createOwnerPlans(OwnerPlanDto ownerPlanDto) {
        OwnerPlan ownerPlan = mapToEntity(ownerPlanDto);
        OwnerPlan savedOwnerPlan = ownerPlanRepository.save(ownerPlan);
        return mapToDto(savedOwnerPlan);


    }

    OwnerPlan mapToEntity(OwnerPlanDto ownerPlanDto){
        OwnerPlan ownerPlan = modelMapper.map(ownerPlanDto, OwnerPlan.class);
        return ownerPlan;

    }

    OwnerPlanDto mapToDto(OwnerPlan ownerPlan){
        OwnerPlanDto OwnerPlanDto = modelMapper.map(ownerPlan, OwnerPlanDto.class);
        return OwnerPlanDto;

    }
}
