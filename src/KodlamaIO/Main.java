package KodlamaIO;
import java.util.List;

public class Main {
    public static void main(String[] args){

        CourseManager courseManager = new CourseManager();
        CategoryManager categoryManager = new CategoryManager();
        InstructorManager instructorManager = new InstructorManager();

        //Category

        //getAll
        List<Category> categories = categoryManager.getAll();
        System.out.println("Tüm kategoriler listelendi:");
        for(Category category:categories){
            System.out.println("Kategori Id: " + category.getId() + " Kategori Adı: " + category.getName());
        }
        System.out.println("**********************************************");
        //add
        Category newCategory = new Category(3,"Muhasebe");
        categoryManager.add(newCategory);
        System.out.println("Yeni bir kategori eklendi: " + newCategory.getName());
        for(Category category:categories){
            System.out.println("Kategori Id: " + category.getId() + " Kategori Adı: " + category.getName());
        }
        System.out.println("**********************************************");
        //update
        Category updatedCategory = new Category(2,"Game Development");
        categoryManager.update(updatedCategory);
        System.out.println("Bir kategori güncellendi: " + updatedCategory.getName());
        for(Category category:categories){
            System.out.println("Kategori Id: " + category.getId() + " Kategori Adı: " + category.getName());
        }
        System.out.println("**********************************************");
        //delete
        Category deletedCategory = new Category(3,"Muhasebe");
        categoryManager.delete(3);
        System.out.println("Bir kategori silindi: " + deletedCategory.getName());
        for(Category category:categories){
            System.out.println("Kategori Id: " + category.getId() + " Kategori Adı: " + category.getName());
        }
        System.out.println("**********************************************");

        //Course

         //GetAll
         List<Course> courses = courseManager.getAll();
         System.out.println("Tüm kurslar listelendi:");

         for(Course course:courses){
             String categoryName = categoryManager.getCategoryNameById(course.getCategoryId());
             String instructorName = instructorManager.getInstructorNameById(course.getInstructorId());
             System.out.println("Kurs Id: " + course.getId() + " Kurs Adı: " + course.getName() + " Kategori Adı: " + categoryName + " Eğitmen adı: " + instructorName);
         }
        System.out.println("**********************************************");

         //Add
        Course newCourse = new Course(3, "React",200,1,1);
        courseManager.add(newCourse);
        System.out.println("Yeni bir kurs eklendi: " + newCourse.getName());
        for(Course course:courses){
            System.out.println("Kurs Id: " + course.getId() + " Kurs Adı: " + course.getName());
        }
        System.out.println("**********************************************");

        //update
        Course updatedCourse = new Course(2, "C++", 300,2,2);
        courseManager.update(updatedCourse);
        System.out.println("Bir kurs güncellendi: " + updatedCourse.getName());
        for(Course course:courses){
            System.out.println("Kurs Id: " + course.getId() + " Kurs Adı: " + course.getName());
        }
        System.out.println("**********************************************");

        //delete
        Category deletedCourse = new Category(3,"React");
        courseManager.delete(3);
        System.out.println("Bir kurs silindi: " + deletedCourse.getName());
        for(Course course:courses){
            System.out.println("Kurs Id: " + course.getId() + " Kurs Adı: " + course.getName());
        }
        System.out.println("**********************************************");

        //Instructor

        //GetAll
        List<Instructor> instructors = instructorManager.getAll();
        System.out.println("Tüm eğitmenler listelendi:");
        for(Instructor instructor:instructors){
            System.out.println("Eğitmen Id: " + instructor.getId() + " Eğitmen Adı: " + instructor.getName());
        }
        System.out.println("**********************************************");
        //add
        Instructor newInstructor = new Instructor(3,"İrem Balcı");
        instructorManager.add(newInstructor);
        System.out.println("Yeni bir eğitmen eklendi: " + newInstructor.getName());
        for(Instructor instructor:instructors){
            System.out.println("Eğitmen Id: " + instructor.getId() + " Eğitmen Adı: " + instructor.getName());
        }
        System.out.println("**********************************************");
        //update
        Instructor updatedInstructor = new Instructor(2,"Halit Kalaycı");
        instructorManager.update(updatedInstructor);
        System.out.println("Bir eğitmen güncellendi: " + updatedInstructor.getName());
        for(Instructor instructor:instructors){
            System.out.println("Eğitmen Id: " + instructor.getId() + " Eğitmen Adı: " + instructor.getName());
        }
        System.out.println("**********************************************");
        //delete
        Instructor deletedInstructor = new Instructor(3,"İrem Balcı");
        instructorManager.delete(3);
        System.out.println("Bir eğitmen silindi: " + deletedInstructor.getName());
        for(Instructor instructor:instructors){
            System.out.println("Eğitmen Id: " + instructor.getId() + " Eğitmen Adı: " + instructor.getName());
        }
        System.out.println("**********************************************");
    }
}