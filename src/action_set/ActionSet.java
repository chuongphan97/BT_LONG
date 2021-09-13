package action_set;

import action.CreateUserAction;

public abstract class ActionSet {

    public void createUser(String username){
        CreateUserAction cmd = this.getCreateUserAction();
        cmd.setUserNameToCreate(username);
        cmd.execute();
    }

    public abstract CreateUserAction getCreateUserAction();
}