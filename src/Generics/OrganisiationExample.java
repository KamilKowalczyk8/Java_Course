package Generics;

import java.util.ArrayList;
import java.util.Iterator;

class Person{
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }
}
class Employee extends Person{
    private String jobTitle;

    public Employee(String name, String jobTitle) {
        super(name);
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name: " + this.getName() +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}

class Contractor extends Employee{
    public Contractor(String name, String jobTitle) {
        super(name, jobTitle);
    }

    public String toString(){
        return "Contractor{"+super.toString()+"}";
    }
}
class Organisiation<T extends Person>{
    private ArrayList<T> participants;
    public Organisiation(){
        participants = new ArrayList<T>();
    }
    public void addParticipant(T p){
        participants.add(p);

    }
    public T getParticpant(int index){
        return participants.get(index);
    }
    public void printParticipants(){
        Iterator<T> iter = participants.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}

public class OrganisiationExample {
    public static void main(String[] args) {
        Organisiation<Employee> organisiation = new Organisiation<>();
        organisiation.addParticipant(new Employee("Adam","programista"));
        organisiation.addParticipant(new Employee("Kasia","programistka"));
        organisiation.addParticipant(new Contractor("Daniel","Programista"));
        organisiation.printParticipants();

    }

}
