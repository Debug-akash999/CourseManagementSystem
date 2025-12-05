package com.pys.course.management.system.repository;


import com.pys.course.management.system.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
