void setup() {
    size(500, 500);
}
void draw() {
  background(255, 255, 255);
  fill(#FC0000); 
    noStroke();
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#2CF21B);
    rect(176, 103, 12, 32);
    if(mousePressed) {
      fill(255, 255, 255);
      ellipse(80, 200, 100, 100);
    }
}