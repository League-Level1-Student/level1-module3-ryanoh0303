int y=25;
int x=100;
int x2=800;
int y2=0;
int x3=800;
int y3=700;
int velocity=3;
double gravity=0.5;
int score=0;
void setup(){
 size(800,800);
 

}
void draw(){
  if(intersectsPipes()==true){
    score=score+1;
  }
 text(score,700,100);
  
  
   background(255,100,80);
   
   fill(255,255,0);
   rect(x3,y3,70,80);//lower pipe
   
   fill(255,255,0);
   rect(x2,y2,70,80);//upper rectangle
   
   fill(0,0,255);
   stroke(0,0,0);
   ellipse(x,y,50,50);
   velocity+=gravity;
   y=y+velocity;
   x2=x2-4;
   x3=x3-4;
   if(x2<10){
     x2=800; 
     x3=800;
      y2 = (int) random(100, 400);
      y3 = (int) random(500, 600);
   }
   if(mousePressed==true){
     velocity=-3;
     gravity=-1;
     
     
   }
   else{
     
     velocity=3;
    gravity=0.5;
   }
 

  
}
 boolean intersectsPipes() { 
     if(y3<y && y<y2 && x==x2 ){
     return true;
     }
     else{return false;
   }
}