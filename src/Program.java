import action_set.ActionSet;
import action_set.ActionSet4Ubuntu;

public class Program {
    public static void main(String[] args) {
        ActionSet4Ubuntu cmd = new ActionSet4Ubuntu();

        cmd.createUser("Long");
    }
}
