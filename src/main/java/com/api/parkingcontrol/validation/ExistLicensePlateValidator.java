package com.api.parkingcontrol.validation;

import com.api.parkingcontrol.dto.ParkingSpotDto;
import com.api.parkingcontrol.services.ParkingSpotService;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ExistLicensePlateValidator implements ConstraintValidator<ExistLicensePlateValidation, ParkingSpotDto> {

    final ParkingSpotService parkingSpotService;

    public ExistLicensePlateValidator(ParkingSpotService parkingSpotService) {
        this.parkingSpotService = parkingSpotService;
    }

    @Override
    public void initialize(ExistLicensePlateValidation constraintAnnotation) {
    }

    @Override
    public boolean isValid(ParkingSpotDto parkingSpotDto, ConstraintValidatorContext constraintValidatorContext) {
        return parkingSpotService.existsByLicensePlateCar(parkingSpotDto.getLicensePlateCar());
    }
}
