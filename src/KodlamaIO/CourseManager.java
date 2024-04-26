package KodlamaIO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CourseManager {
    private final List<Course> courses;

    public CourseManager() {
        courses = new ArrayList<>();
        courses.add(new Course(1, "Java", 500,1,1));
        courses.add(new Course(1, "C#", 300,2,2));
    }

    //GetAll
    public List<Course> getAll(){
        return courses;
    }

    //GetById
    public Course getById(int id){
        for (Course course: courses){
            if(course.getId() == id){
                return course;
            }
        }
        return null;
    }
    //Add
    public void add(Course course){
        courses.add(course);
    }
    //Update
    public void update(Course course){
         for (Course updatedCourse: courses){
             if (updatedCourse.getId() == course.getId()){
                 updatedCourse.setName(course.getName());
                 updatedCourse.setPrice(course.getPrice());
                 updatedCourse.setCategoryId(course.getCategoryId());
                 updatedCourse.setInstructorId(course.getInstructorId());
             }
         }
    }

    //Delete
    public void delete(int id){
        Iterator<Course> iterator = courses.iterator();
        while (iterator.hasNext()){
            Course course = iterator.next();
            if(course.getId() == id){
                iterator.remove();
            }
        }
    }
}
