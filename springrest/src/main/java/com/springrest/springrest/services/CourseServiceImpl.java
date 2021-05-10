package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	//List<Course> list;
	// implementation of functions using mqsql db
//	public CourseServiceImpl() {
//		
//	}
//	
	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}
	@Override
	public Course getCourse(long courseId) {
		return courseDao.getOne(courseId);
	}
	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}
	@Override
	public void deleteCourse(long courseId) {
		courseDao.delete(courseDao.getOne(courseId));
	}
	
	// Normal implementation of function using data structure List or array 
	/*public CourseServiceImpl() {
		
		list = new ArrayList<>();
		list.add(new Course(1, "Java course","this is good course", 1000));
		list.add(new Course(2, "spring boot course","this is very good course", 5000));
		
	}
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Course getCourse(long courseId) {
		
		Course c = null;
		for(Course course:list) {
			if(course.getId()==courseId) {
				c = course;
				break;
			}
		}
		return c;
	}
	@Override
	public Course addCourse(Course course) {

		list.add(course);
		return course;
	}
	@Override
	public Course updateCourse(Course course) {
		
		list.add(course);
		//Course c = null;
		for(Course c:list) {
			if(c.getId() == course.getId()) {
				c.setPrice(course.getPrice());
				c.setDescription(course.getDescription());
				c.setTitle(course.getTitle());
				break;
			}
		}
		return course;
	}
	@Override
	public void deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		list = this.list.stream().filter(e->e.getId()!=courseId).collect(Collectors.toList());
	}
	*/

}
