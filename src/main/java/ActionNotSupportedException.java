//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class ActionNotSupportedException extends Throwable {
    private String action = "";

    public ActionNotSupportedException(String action) {
        this.action = action;
    }

    public String getMessage() {
        return "The action " + this.action + " is not supported";
    }
}
