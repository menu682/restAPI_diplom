package ua.lomakin.restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class TestDataResponseDto {

    Long id;
    String name;
    String email;
    String phoneNumber;
    String address;
    String city;
    String country;
    LocalDateTime createdAt;

}
