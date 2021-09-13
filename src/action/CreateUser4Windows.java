package action;

public class CreateUser4Windows extends CreateUserAction  {

    @Override
    public void execute() {
        System.out.println("net user " + this.getUsername() + " PASSWORD /add" );
    }
}

