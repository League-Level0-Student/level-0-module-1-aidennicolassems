
void setup() {
    size(800, 800);

fill(#FAE5BB);
ellipse(400, 400, 600, 600);
fill(#F55954);
ellipse(400, 400, 500, 500);
fill(#F2DA51);
ellipse(400, 400, 480, 480);

}
void draw() {
    
  PImage Pineapple = loadImage("thumb.png");
  
  Pineapple.resize(200, 250);
image(Pineapple, 280, 280);
  

  
  
  
}
