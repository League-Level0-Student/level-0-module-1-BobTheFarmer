void setup() {
 size(450, 350);
  PImage face = loadImage("BOB.jpg");
image(face, 0, 0);
}
void draw() {
  if(mousePressed){
    println(mouseX + ", " + mouseY);
  }
fill(mouseX, mouseY, mouseX+mouseY); 
  ellipse(82, 134, 25, 25);
  ellipse(384, 128, 25, 25);
  fill(0);
  ellipse(82, 134, 10, 10);
  ellipse(384, 128, 10, 10);
}
