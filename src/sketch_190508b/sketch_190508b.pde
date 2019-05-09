void setup() {
  size(400, 400);
}
void draw() {
  fill(#DEA60D);
  noStroke();
  ellipse(200, 200, 300, 300);
  fill(#F50B02);
  ellipse(200, 200, 280, 280);
  fill(#FAEE05);
  ellipse(200, 200, 250, 250);
  fill(#F50B02);
  if(mousePressed) {
  ellipse(180, 250, 40, 40);
  ellipse(260, 200, 40, 40);
  ellipse(150, 150, 40, 40);
  ellipse(200, 160, 40, 40);
  ellipse(175, 230, 40, 40);
}
}