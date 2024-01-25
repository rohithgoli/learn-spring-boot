package com.rrk.learnspringboot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rrk.learnspringboot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
