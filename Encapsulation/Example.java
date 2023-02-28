package Encapsulation;

//Encapsulation = data hiding

public class Example {
    private String firstName;
    private String lastName;
    private Integer id;

//    public Example(String firstName,String lastName,Integer id){
//        this.firstName=firstName;
//        this.lastName=lastName;
//        this.id=id;
//    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    void display(){
        System.out.println("Name= "+firstName);
        System.out.println("Lastname= "+lastName);
        System.out.println("Id= "+id);
    }


}
