void setup() {

  size(400, 600);
  background(0, 255, 0);
}

void draw() {
  for (int i = 10; i > 0; i--) {    
    if (i%2==0) {
      fill(255, 0, 0);
    }
    else {
      fill(0, 0, 255);                 

      
    }
    ellipse(200, 250, 25*i, 25*i);
  }}