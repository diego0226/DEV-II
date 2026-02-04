public class PetManager {
    private int size;
    private Pet[] pets;

    public PetManager () {
        size = 0;
        pets = new Pet[10];
    }
    
    public PetManager(int numberOfPets) {
        size = 0;
        pets = new Pet[numberOfPets];
    }

    public boolean addPet(Pet pet) {
        if (pet != null) {
            for (int i = 0; i < pets.length - 1; i++) {
                if (pets[i] == null) {
                    pets[i] = pet;
                    size++;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean revomePet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] != null && pets[i].equals(pet)) {
                for (int j = i; j < pets.length - 1; j++) {
                    pets[j] = pets[j + 1];
                    //aqui es donde hace el corrimiento a la izquierda
                }

                pets[pets.length - 1] = null;
                size--;
                return true;
            }   
        }
        return false;
    } 

    public Pet[] getPets() {
        Pet[] pets = new Pet[this.size];
        for (int i = 0; i < this.size; i++) {
            pets[i] = this.pets[i];
        }
        return pets;
    }

    public boolean updatePets(Pet pet, int index) {
        if(pet != null & index >= 0 && index < size) {
            pets[index] = pet;
            return true;
        }
        return false;
    }

    public int getSize() {
        return size;
    }
}
