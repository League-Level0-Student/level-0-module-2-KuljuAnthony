int x = 400;
void setup() {
    size(800, 200);
}

void draw() {
  background(0,0,255);
    //make it a nice color
    fill(0,0,0);
    ellipse(x,100,10,10);
    
    //if the mouse is pressed...
    if(mousePressed) {
      x +=4;
    }
    //... change the X co-ordinate so that the dot moves to the right
    //Draw an ellipse of height and width 10Make sure to use your variable for the X position.
    //Make your dot move really fast so that it can win the race 
      //  (you have to figure out what part of your code to change)
    //Use this method to play a ding when your dot crosses the finish line. 
}

import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("ding2.wav");
        sound.trigger();
        soundPlayed = true;
    }
}