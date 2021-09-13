package action_set;

import action.CreateUser4Windows;
import action.CreateUserAction;

public class ActionSet4Windows extends ActionSet{
    CreateUser4Windows createUser4Windows = new CreateUser4Windows();

    @Override
    public CreateUserAction getCreateUserAction() {
        return this.createUser4Windows;
    }
}
