public class Main {
    public static void main(String[] args) {
        //parte #1
        int[] numbers = {10, 20, 30, 40, 50};
        String[] fruits = new String[3];
        //System.out.println(numbers[2]);
        //System.out.println(fruits[2]);

        Person person = new Person("Diego", 18, 5);
        Pet pet1 = new Pet("Chester", "Dog");
        Pet pet2 = new Pet("Chevy", "Dog");
        
        if(person.addPet(new Pet("Goldie", "Fish"))) {
            IOManager.printMessage("Pet added successfully");
        }else {
            IOManager.printMessage("Failed to add pet");
        }

        person.addPet(pet1);

        if(person.removePet(pet1)) {
            IOManager.printMessage("Pet removed successfully");
        }else {
            IOManager.printMessage("Failed to remove");
        }

        if(person.updatePets(pet2, 0)) {
            IOManager.printMessage("The Pet has been updated successfully");
        }else {
            IOManager.printMessage("Failed to update");
        }

        if(person.getPets().length == 0){
            IOManager.printMessage("No pets found");
        }else {
            for (Pet pet : person.getPets()) {
                IOManager.printMessage(pet.getPetName());
            }
        }
    }
}
