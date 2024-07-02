package ua.lomakin.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lomakin.restapi.entity.TestDataEntity;

import java.util.List;

@Repository
public interface TestDataRepository extends JpaRepository<TestDataEntity, Long> {

    TestDataEntity findOneById(Long id);

    List<TestDataEntity> findAllByCity(String city);

}
