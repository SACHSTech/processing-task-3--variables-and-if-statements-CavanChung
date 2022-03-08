/**
 * Name:Processing Task 3 
 * Purpose:Drawing House with random colours and location
 * Author: Cavan Chung
 * Created:2022/03/07
 */
import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
	// set size
    size(400, 400);
  }
  
  public void setup() {

    // random variable, width/height-200 in order to prevent the house base (not roof) from going offscreen
    float houseX = random(0,width - 200);
    float houseY = random(0,height - 200);


    // for the background only if the width is greater than width-200/2 and /4 then it will output a certain colour (rare colour)
    boolean backgroundOption1 = houseX <= 5;
    boolean backgroundOption2 = houseX >= 1;
    boolean colour3 = backgroundOption1 && backgroundOption2;
    
    
    // set background
    if (colour3) {
      background(232, 112, 343);
    }
    else {
      background(173, 216, 230);
    }
    

    // FOR ALL SHAPES if width is greater than half of the random parameter then fill one colour, else fill another colour
    
    // set/draw the rectangular house base
    if (houseX >= ((width - 200) / 2)) {
      fill(255, 0, 0);
    }
    else {
      fill(200, 400, 9);
    }
    rect(houseX, houseY, 200, 200);  
    
	  // draw window 1
    if (houseX >= ((width - 200) / 2)) {
      fill(123, 342, 122);
    }
    else {
      fill(121, 235, 352);
    }
    rect(houseX + 25, houseY + 50, 50, 50);  

    // draw window 2
    if (houseX >= ((width - 200) / 2)) {
      fill(204, 201, 111);
    }
    else {
      fill(100, 230, 9);
    }
    rect(houseX + 125, houseY + 50, 50, 50); 

    // draw house roof
    if (houseX >= ((width - 200) / 2)) {
      fill(220, 120, 100);
    }
    else {
      fill(200, 400, 9);
    }
    triangle(houseX, houseY, houseX + 200, houseY, houseX + 100, houseY - 125);

    // draw house door
    if (houseX >= ((width - 200) / 2)) {
      fill(200, 100, 50);
    }
    else {
      fill(50, 30, 230);
    }
    rect(houseX + 75, houseY + 125, 50, 75);
    

  }

  public void draw() {

    // draw box
    fill(80);
    stroke(100);
    rect(0, 100, 250, 75);

    // create clock variables
    int seconds = second();
    int minutes = minute();
    int hours = hour();

    // print the time
    String strTime = "hrs:" + (str(hours % 12) + " min:" + str(minutes) + " sec:" + str(seconds));

    // change text features
    noStroke();
    fill(0, 0, 0);
    textSize(25);
    text(strTime, 3, 150);
    
  }
  
}