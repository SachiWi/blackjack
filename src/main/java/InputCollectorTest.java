import org.junit.Test;

import static org.junit.Assert.*;

public class InputCollectorTest {

       @Test
    public void collectAction_withPlay_shouldReturnPLAYAction() throws ActionNotSupportedException {
        InputCollector inputCollector = new InputCollector();
        Action action = inputCollector.collectAction("play");
        assertEquals(Action.PLAY, action);
    }

    @Test
    public void collectAction_withHold_shouldReturnHOLDAction() throws ActionNotSupportedException {
        InputCollector inputCollector = new InputCollector();
        Action action = inputCollector.collectAction("hold");
        assertEquals(Action.HOLD, action);
    }

    @Test
    public void collectAction_withDifferentCasePlay_shouldReturnPLAYAction() throws ActionNotSupportedException {
        InputCollector inputCollector = new InputCollector();
        Action action = inputCollector.collectAction("pLAy");
        assertEquals(Action.PLAY, action);
    }

    @Test
    public void collectAction_withDifferentCaseHold_shouldReturnHOLDAction() throws ActionNotSupportedException {
        InputCollector inputCollector = new InputCollector();
        Action action = inputCollector.collectAction("hOLD");
        assertEquals(Action.HOLD, action);
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
