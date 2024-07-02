package ua.lomakin.restapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "test_data")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TestDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "email")
    String email;

    @Column(name = "phone_number")
    String phoneNumber;

    @Column(name = "address")
    String address;

    @Column(name = "city")
    String city;

    @Column(name = "country")
    String country;

    @CreationTimestamp
    @Column(name = "created_at")
    LocalDateTime createdAt;

}
