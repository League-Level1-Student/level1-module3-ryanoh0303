int y=25;
int x=100;
int velocity=3;
double gravity=0.5;

void setup(){
 size(800,800);

}
void draw(){
   background(255,100,80);
   fill(0,0,255);
   stroke(0,0,0);
   ellipse(x,y,50,50);
   velocity+=gravity;
   y=y+velocity;
  
   if(mousePressed==true){
     velocity=-3;
     gravity=-1;
     
     
   }
   else{
     
     velocity=3;
    gravity=0.5;
   }
  
  
  
}