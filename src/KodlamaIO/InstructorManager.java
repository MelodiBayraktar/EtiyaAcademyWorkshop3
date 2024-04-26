package KodlamaIO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InstructorManager {
    private final List<Instructor> instructors;

    public InstructorManager(){
        instructors = new ArrayList<>();
        instructors.add(new Instructor(1,"Engin Demiroğ"));
        instructors.add(new Instructor(2,"Halit Enes Kalaycı"));
    }
    //GetAll
    public List<Instructor> getAll(){
        return instructors;
    }
    //GetByID
    public Instructor getById(int id){
        for (Instructor instructor:instructors){
            if(instructor.getId() == id){
                return instructor;
            }
        }
        return null;
    }
    //GetNameById
    public String getInstructorNameById(int id) {

        for(Instructor instructor: instructors){
            if(instructor.getId()==id){
                return instructor.getName();
            }

        }
        return null;
    }
    //add
    public void add(Instructor instructor){
        instructors.add(instructor);
    }
    //update
    public void update(Instructor instructor){
        for (Instructor updatedInstructor: instructors){
            if(updatedInstructor.getId() == instructor.getId()){
                updatedInstructor.setName(instructor.getName());
            }
        }
    }
    //delete
    public void delete(int id){
        Iterator<Instructor> iterator = instructors.iterator();
        while (iterator.hasNext()){
            Instructor instructor = iterator.next();
            if(instructor.getId() == id){
                iterator.remove();
            }
        }
    }
}
