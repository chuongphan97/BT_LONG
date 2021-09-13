package action;

public class CreateUser4Ubuntu extends CreateUserAction{

    @Override
    public void execute() {
        System.out.println("useradd [OPTIONS] " + this.getUsername());
    }
}
