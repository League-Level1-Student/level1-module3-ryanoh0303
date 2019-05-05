PImage frogger;
PImage carright;
PImage carleft;
PImage frog;
int positionoffrog=0;
int positionoffrog2=500;

Car car= new Car(400,400,100,5);
Car car2= new Car(200,200,100,-5);
void setup(){
  size(800,600);
  frogger=loadImage("froggerBackground.png");
  frogger.resize(800,600);
  frog= loadImage("frog.png");
  frog.resize(100,100);
  carright= loadImage("carRight.png");
  
  carleft= loadImage("carLeft.png");
  carleft.resize(100,100);
}

void draw(){
 background(frogger);
 image(frog,positionoffrog,positionoffrog2);
 car.display();
 car.driveright();
 car2.display();
 car2.driveright();
 if(intersects(car)==true || intersects(car2)==true){
   positionoffrog=200;
   positionoffrog2=400;
   
 }
 
 }

class Car{
  int carX;
  int carY;
  int carsize;
  int carspeed;
   
  public Car(int carX, int carY, int carsize, int carspeed){
    this.carX=carX;
    this.carY=carY;
    this.carsize=carsize;
    this.carspeed=carspeed;
    
  }
 void display(){
   carright.resize(carsize,carsize);
   carleft.resize(carsize,carsize);
   image(carright,carX,carY);
  
   
 }
 void driveright(){
     carX+=carspeed;
     if(carX>=800){
       carX=0;
     }
     else if(carX<=0){
       carX=800;
       
     }
 }
 
   
 
 
int getX(){
   return carX;
}
int getY(){
 return carY; 
}
int getSize(){
  
 return carsize;
}
  
}

void keyPressed()
{
      if(key == CODED){
            if(keyCode == UP)
            {
                   positionoffrog2-=10;
            
             
            }
            else if(keyCode == DOWN)
            {
             positionoffrog2+=10;
                  //Frog Y position goes down 
            }
            else if(keyCode == RIGHT)
            {
                  positionoffrog+=10;
            }
            else if(keyCode == LEFT)
            {
                  positionoffrog-=10;
            }
      }
}




boolean intersects(Car car) {
      if ((positionoffrog2 > car.getY() && positionoffrog2 < car.getY()+50) && (positionoffrog > car.getX() && positionoffrog < car.getX()+car.getSize()))
      {
             return true;
      }
      else 
      {
             return false;
      }

}