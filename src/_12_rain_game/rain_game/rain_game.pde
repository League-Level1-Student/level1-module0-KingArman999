int y = 50;
int x = (int) random(width);
int score = 0;
void setup() {
  size(750,750);
}
void draw(){
  background(200,50,50);
   fill(0, 0, 100);
    stroke(100, 100, 100);
    y += 15;
    ellipse(x,y, 30,50);
  if(y>height){
 y=50;
  x=(int) random(width) ;
  fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
    redraw();
  }
    rect(mouseX, 670, 60, 90); 
}
 void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
