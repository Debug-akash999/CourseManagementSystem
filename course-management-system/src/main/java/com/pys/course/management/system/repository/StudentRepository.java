package com.pys.course.management.system.repository;

import com.pys.course.management.system.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByCourseId(Long courseId);
}
