package org.java.spring_test2.geometry.service;

import java.util.List;

import org.java.spring_test2.geometry.pojo.Circle;
import org.java.spring_test2.geometry.repo.CircleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CircleService {

    @Autowired
    private CircleRepo circleRepo;

    public List<Circle> getAllCircles() {

        return circleRepo.findAll();
    }

    public void saveCircle(Circle c) {

        circleRepo.save(c);
    }
}
