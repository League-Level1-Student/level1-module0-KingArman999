  PImage backgroundImage;
  
import ddf.minim.*;
  Minim minim;
  AudioSample sound;
  int x= 10;
int y=10;
int speedx = 10;
int speedy = 10;
void setup(){
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
backgroundImage = loadImage("pong.png");
size(500, 600);
}
void draw(){
      image(backgroundImage, 0, 0);
    image(backgroundImage, 0, 0, width, height);
  background(200, 200, 100);
fill(200, 0, 0);
  stroke(100, 100, 100);
  x+=speedx;
  ellipse(x, y, 30, 30);
  y+=speedy;
if(x>=width){
speedx=-speedx;
}
if(x<0){
speedx=-speedx;
} 
if(y>=height){
  speedy=-speedy;
   sound.trigger();
}
if(y<0){
  speedy=-speedy;
}
  rect(mouseX, 570, 100, 20);
}
    boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else
          return false;
    }
