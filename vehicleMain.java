
interface Vehicle{
  start();
  run();
  stop();
}


class CAR implements Vehicle{
  
  start(){
  // impl
  }
  run(){
    lock()
    go()
  }
  lock(){
  //impl
  }
  go(){
  // impl
  }
  stop(){
  //impl
  }

}


class Ship implements Vehicle{
  
  start(){
  // impl
  }
  run(){
    balance()
    swim()
  }
   balance(){
  //impl
  }
  swim(){
  // impl
  }
  stop(){
  //impl
  }

}

class Airplane implements Vehicle{
  
  start(){
  // impl
  }
  run(){
    go();
    fly();
  }
  go(){
  //impl
  }
  fly(){
  // impl
  }
  stop(){
  //impl
  }

}
class Tank implements Vehicle{
  
  start(){
  // impl
  }
  run(){
    move();
    stop();
    fire();
  }
  move(){
    lock()
    go()
  }
  stop(){
  //impl
  }
  fire(){
  // impl
  }

}

class VehicleMain{
public static void main(){
  // some logic
    for(Vehicle vehicle : vehicles) {
    vehicle.start();
    vehicle.run();
    vehicle.stop();    
  }

}
}
