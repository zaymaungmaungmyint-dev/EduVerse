/*
 * @Author : Alvin
 * @Date : 5/11/2024
 * @Time : 9:00 PM
 * @Project_Name : eduverse
*/
package dev.backend.eduverse.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.backend.eduverse.dto.CourseDTO;

@Service
public interface CourseService {
	boolean createCourse(CourseDTO courseDTO);
	
	List<CourseDTO> getAllCourse();

	CourseDTO getCourseByID(Long id);

	boolean updateCourse(CourseDTO courseDTO, Long id);

	boolean deleteCourse(Long id);
}
