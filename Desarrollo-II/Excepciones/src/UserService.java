public class UserService {

    public UserService() {

    }

    
    public void regsterUser(int age){
        if (age < 18) {
            throw new InvalidAgeException("Menor de 18 años");
        }else if (age > 120) {
            throw new InvalidAgeException("Mayor de 120 años");
        }
    }

}
