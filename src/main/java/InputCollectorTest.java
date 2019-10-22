import org.junit.Test;

import static org.junit.Assert.*;

public class InputCollectorTest {

    @Test
    public void collectAction_withPlay_shouldReturnPLAYAction() throws ActionNotSupportedException {
        InputCollector inputCollector = new InputCollector();
        Action action = inputCollector.collectAction("play");
        assertEquals(Action.PLAY, action);
    }
}