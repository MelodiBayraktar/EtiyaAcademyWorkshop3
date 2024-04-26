package KodlamaIO;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class CategoryManager {

    private final List<Category> categories;

    public CategoryManager(){
        categories = new ArrayList<>();
        categories.add(new Category(1,"Programlama"));
        categories.add(new Category(2,"Finans"));
    }

    //GetAll
    public List<Category> getAll(){
        return categories;
    }

    //GetById
    public Category getById(int id){
        for(Category category:categories){
            if(category.getId() == id){
                return category;
            }
        }
        return null;
    }
    //GetNameById
    public String getCategoryNameById(int id) {

        for(Category category: categories){
            if(category.getId()==id){
                return category.getName();
            }

        }
        return null;
    }

    //Add
    public void add(Category category){
        categories.add(category);
    }

    //Update
    public void update(Category category){
        for (Category updatedCategory:categories){
            if(updatedCategory.getId() == category.getId()){
                updatedCategory.setName(category.getName());
            }
        }
    }

    //Delete
    public void delete(int id){
        Iterator<Category> iterator = categories.iterator();
        while(iterator.hasNext()){
            Category category = iterator.next();
            if(category.getId() ==id){
                iterator.remove();
            }
        }
    }
}
