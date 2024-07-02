package ua.lomakin.restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TestDataRequestDto {

    String name;
    String email;
    String phoneNumber;
    String address;
    String city;
    String country;

}
