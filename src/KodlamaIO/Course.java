package KodlamaIO;

public class Course {
    private int id;
    private String name;
    private double price;
    private int instructorId;
    private int categoryId;

    public Course(){

    }
    public Course(int id, String name, double price, int instructorId, int categoryId){
        this.id = id;
        this.name = name;
        this.price = price;
        this.instructorId = instructorId;
        this.categoryId = categoryId;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public int getInstructorId() {
        return instructorId;
    }
    public void setInstructorId(int instructorId){
        this.instructorId = instructorId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
