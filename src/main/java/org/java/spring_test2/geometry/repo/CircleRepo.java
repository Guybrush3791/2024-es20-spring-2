package org.java.spring_test2.geometry.repo;

import org.java.spring_test2.geometry.pojo.Circle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircleRepo extends JpaRepository<Circle, Integer> {

}
