//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import org.junit.Assert;
import org.junit.Test;

public class InputCollectorTest {
    public InputCollectorTest() {
    }

    @Test
    public void collectAction_withPlay_shouldReturnPLAYAction() throws ActionNotSupportedException {
        InputCollector inputCollector = new InputCollector();
        Action action = inputCollector.collectAction("play");
        Assert.assertEquals(Action.PLAY, action);
    }

    @Test
    public void collectAction_withHold_shouldReturnHOLDAction() throws ActionNotSupportedException {
        InputCollector inputCollector = new InputCollector();
        Action action = inputCollector.collectAction("hold");
        Assert.assertEquals(Action.HOLD, action);
    }

    @Test
    public void collectAction_withDifferentCasePlay_shouldReturnPLAYAction() throws ActionNotSupportedException {
        InputCollector inputCollector = new InputCollector();
        Action action = inputCollector.collectAction("pLAy");
        Assert.assertEquals(Action.PLAY, action);
    }

    @Test
    public void collectAction_withDifferentCaseHold_shouldReturnHOLDAction() throws ActionNotSupportedException {
        InputCollector inputCollector = new InputCollector();
        Action action = inputCollector.collectAction("hOLD");
        Assert.assertEquals(Action.HOLD, action);
    }

    @Test(
            expected = ActionNotSupportedException.class
    )
    public void collectAction_withUnsupportedAction_shouldThrowException() throws ActionNotSupportedException {
        InputCollector inputCollector = new InputCollector();
        Action action = inputCollector.collectAction("wait");
    }

    @Test(
            expected = ActionNotSupportedException.class
    )
    public void collectAction_withEmptyAction_shouldThrowException() throws ActionNotSupportedException {
        InputCollector inputCollector = new InputCollector();
        Action action = inputCollector.collectAction("");
    }


    @Test(
            expected = ActionNotSupportedException.class
    )
    public void collectAction_withNullAction_shouldThrowException() throws ActionNotSupportedException {
        InputCollector inputCollector = new InputCollector();
        Action action = inputCollector.collectAction (null);
    }
}
