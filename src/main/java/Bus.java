import java.util.ArrayList;

public class Bus {
    private String destination;
    private ArrayList<Person> passengers;
    private int capacity;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int countPassengers(){
        return this.passengers.size();
    }
    public void addPassenger(Person person){
        if (this.capacity > countPassengers()){
            this.passengers.add(person);
        }
    }

    public void removePassenger(Person person){
        this.passengers.remove(person);
    }
}
