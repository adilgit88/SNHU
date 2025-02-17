package callempl;

import java.util.ArrayList;

public class CallEmployee {
    public static void main(String[] args) {
        Employee person1;
        Nurse person2;
        Coach person3;

        ArrayList<Employee> personList = new ArrayList<Employee>();
        int i;

        person1 = new Employee();
        person1.setName("Joe");

        person2 = new Nurse();
        person2.setName("Mary");
        person2.setHospital("City Hospital");

        person3 = new Coach();
        person3.setName("Liam");
        person3.setSport("hockey");

        personList.add(person3);
        personList.add(person1);
        personList.add(person2);

        for(i = 0; i < personList.size(); ++i){
            personList.get(i).printInfo();
        }
    }
}