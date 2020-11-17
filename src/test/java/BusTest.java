import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Glasgow", 3);
        person = new Person();
        bus.addPassenger(person);
        bus.addPassenger(person);
    }

    @Test
    public void canCountPassengers(){
        assertEquals(2, bus.countPassengers());

    }

    @Test
    public void cannotAddPassengers(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3,bus.countPassengers());
    }

    @Test
    public void canAddPassengers(){
        bus.addPassenger(person);
        assertEquals(3,bus.countPassengers());
    }

    @Test
    public void canRemovePassengers(){
        bus.removePassenger(person);
        assertEquals(1,bus.countPassengers());

    }


}
