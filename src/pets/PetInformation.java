package pets;

import java.util.Scanner;

public class PetInformation {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        Pet myPet = new Pet();
        Dog myDog = new Dog();

        String petName, dogName, dogBreed;
        int petAge, dogAge;

        petName = scnr.nextLine();
        petAge = scnr.nextInt();
        scnr.nextLine();  // Consume the newline character
        dogName = scnr.nextLine();
        dogAge = scnr.nextInt();
        scnr.nextLine();  // Consume the newline character
        dogBreed = scnr.nextLine();

        // Create generic pet (using petName, petAge) and then call printInfo
        myPet.setName(petName);
        myPet.setAge(petAge);
        myPet.printInfo();

        // Create dog pet (using dogName, dogAge, dogBreed) and then call printInfo
        myDog.setName(dogName);
        myDog.setAge(dogAge);
        myDog.setBreed(dogBreed);
        myDog.printInfo();

        // Use getBreed(), to output the breed of the dog
        System.out.println("   Breed: " + myDog.getBreed());
    }
}
