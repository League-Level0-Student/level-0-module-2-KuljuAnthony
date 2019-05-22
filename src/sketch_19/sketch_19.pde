 // create three integer variables to  
    //    represent the x, y, and the size of the ellipse
    int x =400;
    int y =400;
    int size =100;
    
    void setup() {
      //set the size of your sketch
    size(800,800);
    }
    
    void draw() {
      //set the background color of your sketch
      background(80,80,80);
      ellipse(x,y,size,size);
      //draw an ellipse. Make sure it fits in the window.
      //use the variables created in step 4 in place of the numbers
      //   in your ellipse
    
    }
    
    void mousePressed() {
      //6a. create an integer variable called distance
      //6b. use the getDistance method to initialize your varible
      //    use the mouse's x and y and the x and y of your ellipse 
     int distance =getDistance(x,y,mouseX,mouseY);
      //print the distance variable
  print(distance);
      if(distance < size) {
        x = (int)random(0,800);
        y = (int)random(0,800);
      }
      //8a. make an if statement to check if the distance variable
      //   is within the size of the ellipse
      
        //8b.  set the x and y of the ellipse to a random location on the window
       
      
    }
    
    int getDistance(int x1, int y1, int x2, int y2) {
      return (int)Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }