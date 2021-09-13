package action_set;

import action.CreateUser4Ubuntu;
import action.CreateUserAction;

public class ActionSet4Ubuntu extends ActionSet{
    public CreateUser4Ubuntu createUser4Ubuntu = new CreateUser4Ubuntu();

    public ActionSet4Ubuntu() {
    }

    @Override
    public CreateUserAction getCreateUserAction() {
        return this.createUser4Ubuntu;
    }
}
