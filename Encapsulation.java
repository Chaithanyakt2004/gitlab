 class Person {
    private String name;
    private int Age;
//getter method
public String getName(){
    return name;
}
//setter method for name
public void setName(String name){
    //we can add validation here if needs
    if(name != null && name.isEmpty()){
            this.name=name;
    }
    else{
        System.out.println("Invalid name :" + name);
    }
}
public int getAge(){
    return Age;
}
public void setAge(int age){
    if(Age > 0){
        this.Age = age;
    }
    else{
        System.out.println("invalid age :"+ age);
    }
}
}
public class Encapsulation{
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("chaithanya");
        person.setAge(20);
        System.out.println("name:"+ person.getName());
        System.out.println("Age:"+ person.getAge());
        person.setAge(-5);

    }
}

