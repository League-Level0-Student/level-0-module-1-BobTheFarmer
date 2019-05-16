int y = 10;
void setup() {
  background(#F516DB);
}
void draw() {
 y=10;
  for(int i = 0; i<3; i++) {
  text("ice cream, ", 10, y);
  y=y+10;
  text("banana", 10, 40);
  }
 
}
