package com.example.springbootdemo.repositories;

import com.example.springbootdemo.models.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {

	@Select("SELECT name as name, roll_no as rollNo FROM student_info WHERE roll_no = #{rollNo}")
	Student getStudentByRollNo(@Param("rollNo") String rollNo);

	@Select("SELECT name as name, roll_no as rollNo FROM student_info")
	List<Student> getAllStudents();
}
