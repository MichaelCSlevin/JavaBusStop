public class Bus {
  private String name;
  private Passenger[] capacity;
  public Bus(String name){
    this.name = name;
    this.capacity = new Passenger[10];
  }

  public String GetName(){
    return this.name;
  }

  public int passengerCount(){
    int count = 0;
    for (Passenger passenger : this.capacity){
      if(passenger != null){
        count++;
      }
    }
  return count;
  }

 public void collect(Passenger passenger){
   if (!isBusFull()){
     int passengerCount = passengerCount();
     this.capacity[passengerCount] = passenger;
   }
 }

 public boolean isBusFull(){
   return passengerCount() == capacity.length;
 }




}
