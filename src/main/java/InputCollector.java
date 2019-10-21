public class InputCollector {

    public Action collectAction(String actionAsString) throws ActionNotSupportedException {

        Action action = null;

        try {
            action = Action.valueOf(actionAsString.toUpperCase());
        } catch (IllegalArgumentException iae) {
            throw new ActionNotSupportedException(actionAsString);
        }

        return action;
    }
}
