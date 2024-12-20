package com.batuhan.courseProjectRestApi.repository;

import com.batuhan.courseProjectRestApi.models.CollegeStudent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends CrudRepository<CollegeStudent, Integer> {
    public CollegeStudent findByEmailAddress(String emailAddress);
}