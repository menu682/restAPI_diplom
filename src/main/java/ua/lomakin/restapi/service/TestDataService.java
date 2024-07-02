package ua.lomakin.restapi.service;

import org.springframework.stereotype.Service;
import ua.lomakin.restapi.dto.TestDataResponseDto;
import ua.lomakin.restapi.entity.TestDataEntity;
import ua.lomakin.restapi.repository.TestDataRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestDataService {

    private final TestDataRepository testDataRepository;
    private final Converter converter;

    public TestDataService(TestDataRepository testDataRepository, Converter converter) {
        this.testDataRepository = testDataRepository;
        this.converter = converter;
    }

    public List<TestDataResponseDto> getAll(){
        List<TestDataEntity> testDataEntities = testDataRepository.findAll();
        List<TestDataResponseDto> testDataResponseDtos = new ArrayList<>();
        testDataEntities.forEach(entity -> {
            testDataResponseDtos.add(converter.entityToDto(entity));
        });
        return testDataResponseDtos;
    }

    public TestDataResponseDto getById(Long id){
        assert id != null;
        TestDataEntity testDataEntity = testDataRepository.findById(id).orElse(null);
        return converter.entityToDto(testDataEntity);
    }

    public List<TestDataResponseDto> getByCity(String city){
        assert city != null;
        city = (city.substring(0,1).toUpperCase() + city.substring(1).toLowerCase()).trim();
        List<TestDataEntity> testDataEntities = testDataRepository.findAllByCity(city);
        List<TestDataResponseDto> testDataResponseDtos = new ArrayList<>();
        testDataEntities.forEach(entity -> {
            testDataResponseDtos.add(converter.entityToDto(entity));
        });
        return testDataResponseDtos;
    }

}
