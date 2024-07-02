package ua.lomakin.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lomakin.restapi.dto.TestDataResponseDto;
import ua.lomakin.restapi.service.TestDataService;

import java.util.List;

@RestController
@RequestMapping("api/")
public class TestDataController {

    private final TestDataService testDataService;

    public TestDataController(TestDataService testDataService) {
        this.testDataService = testDataService;
    }

    @GetMapping("all")
    public List<TestDataResponseDto> getAll(){
        return testDataService.getAll();
    }

    @GetMapping("one/{id}")
    public TestDataResponseDto getById(@PathVariable Long id){
        return testDataService.getById(id);
    }


    @GetMapping("city/{name}")
    public List<TestDataResponseDto> getByCity(@PathVariable String name){
        return testDataService.getByCity(name);
    }

}
