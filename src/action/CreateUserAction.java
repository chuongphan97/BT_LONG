package action;

public abstract class CreateUserAction {
    private String username;

    public String getUsername() {
        return username;
    }

    public abstract void execute();
    public void setUserNameToCreate(String username){
        this.username = username;
    }
}
