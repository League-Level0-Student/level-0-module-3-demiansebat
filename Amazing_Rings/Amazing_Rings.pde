
int X=200;
int X2=500;
void setup() { 
  size(750,650);
}

void draw() {
  background(255, 255, 255);
  X++;
  for (int i = 25; i > 0; i--) { 
    noFill();
    ellipse(X, 250, 10*i, 10*i);
  }
  X2--;
    for (int i = 25; i > 0; i--) {
      noFill();
      ellipse(X2, 250, 10*i, 10*i);
    }
}