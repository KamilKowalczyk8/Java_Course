package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

class Employee{
    private String name;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name) {
        this.name = name;
    }
}
public class HashMapBasic {
    public static void main(String[] args) {
        HashMap<String, Employee> map = new HashMap<>();
        map.put("Adam", new Employee("Adam1"));
        map.put("Kasia", new Employee("Kasia"));
      //  map.put("Adam", new Employee("Adam2"));
        map.put("Ola", new Employee("Ola"));
        Employee e = map.get("Adam");
        System.out.println(e);
        Iterator i = map.entrySet().iterator();
        while(i.hasNext()){
            Map.Entry entry = (Map.Entry)i.next();
            String key = (String)entry.getKey();
            Employee employee = (Employee)entry.getValue();
            System.out.println(key+" - "+employee);

        }
        for(Map.Entry<String, Employee> entry: map.entrySet()){
            String key = entry.getKey();
            Employee employee = entry.getValue();
            System.out.println(key+ " "+employee);
        }
    }
}
