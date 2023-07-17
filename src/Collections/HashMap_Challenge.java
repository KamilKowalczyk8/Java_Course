package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class NewAnimal{
    private String name;



    @Override
    public String toString() {
        return "NewAnimall{" +
                "name='" + name + '\'' +
                '}';
    }

    public NewAnimal(String name) {
        this.name = name;
    }
}
public class HashMap_Challenge {
    public static void main(String[] args) {
        HashMap<String,NewAnimal> map = new HashMap<>();
        String names[]={"Kot","Pies","Koza","Puma"};
        for(int i=0;i< names.length;i++){
            String name = names[i];
            map.put(name, new NewAnimal(name));
        }
        System.out.println(map.get("Puma"));
        for (Map.Entry<String, NewAnimal> entry: map.entrySet()){
            String key = entry.getKey();
            NewAnimal newAnimal = entry.getValue();
            System.out.println(key+" "+newAnimal);
        }
    }
}
