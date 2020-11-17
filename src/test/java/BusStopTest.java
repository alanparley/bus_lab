import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        busStop = new BusStop("Easter Road");
        person = new Person();
        busStop.addPersonToQueue(person);
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(2, busStop.countQueue());
    }
    @Test
    public void canRemovePersonFromQueue(){
        busStop.removePersonFromQueue(person);
        assertEquals(0, busStop.countQueue());
    }
}

