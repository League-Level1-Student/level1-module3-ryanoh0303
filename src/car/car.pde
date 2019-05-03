int frogxposition=200;
int frogyposition=200;
void setup(){
 size(800,800); 
  
  
  
}

void draw(){
  background(244,0,255);
  fill(255,255,0);
  ellipse(frogxposition,frogyposition,50,50);
  
  keyPressed();
 car car= new car();

 car.display();
  car.speed();
}
class car{
  int carxposition=199;
  int caryposition=300;
  public car(){
      display();
      speed();
  }
  void display(){
      fill(0,255,0);
      rect(carxposition , caryposition, 100, 50);
       }
  void speed(){
    carxposition-=2;
  }
   
  
}
void keyPressed()
{
      if(key == CODED){
            if(keyCode == UP)
            {
              frogyposition-=5;
                 //Frog Y position goes up
            }
            else if(keyCode == DOWN)
            {
                  //Frog Y position goes down
                  frogyposition+=5;
            }
            else if(keyCode == RIGHT)
            {
                  //Frog X position goes right
                  frogxposition+=5;
            }
            else if(keyCode == LEFT)
            {
                  //Frog X position goes left
                  frogxposition-=5;
            }
      }
  
        
        
      }
  