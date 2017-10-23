import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Passenger passenger;

  @Before
  public void before() {
    bus = new Bus("The Vengabus");
    passenger = new Passenger();
  }

  @Test
  public void capacityStartsEmpty(){
    assertEquals(0, bus.passengerCount());
  }
//
  @Test
  public void canTakePassengers(){
    for (int i=0; i<10; i++){
      bus.collect(passenger);
      assertEquals(i+1, bus.passengerCount());
    }


  }

  @Test
  public void cannotTakePassengersIfFull(){
    for (int i=0; i < 20; i++){
      bus.collect(passenger);
    }
    assertEquals(10, bus.passengerCount());
  }

  @Test
  public void capacityFull(){
      assertEquals(false, bus.isBusFull()); //checks bus is empty
    for (int i = 0; i < 10; i++){
      bus.collect(passenger);
    }
    assertEquals(true, bus.isBusFull()); //checks bus is full
  }

}
