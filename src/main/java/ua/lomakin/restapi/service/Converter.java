package ua.lomakin.restapi.service;

import org.springframework.stereotype.Service;
import ua.lomakin.restapi.dto.TestDataRequestDto;
import ua.lomakin.restapi.dto.TestDataResponseDto;
import ua.lomakin.restapi.entity.TestDataEntity;

@Service
public class Converter {

    TestDataResponseDto entityToDto (TestDataEntity entity){
        return new TestDataResponseDto(
                entity.getId(),
                entity.getName(),
                entity.getEmail(),
                entity.getPhoneNumber(),
                entity.getAddress(),
                entity.getCity(),
                entity.getCountry(),
                entity.getCreatedAt()
        );
    }

    TestDataEntity dtoToEntity (TestDataRequestDto dto){

        TestDataEntity entity = new TestDataEntity();
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setPhoneNumber(dto.getPhoneNumber());
        entity.setAddress(dto.getAddress());
        entity.setCity(dto.getCity());
        entity.setCountry(dto.getCountry());

        return entity;
    }

}
