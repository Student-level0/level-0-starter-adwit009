void setup (){
  
  
  size(500,500);
  


}




void draw (){
  


for (int x = 100; x > 0; x = x- 20) {
if(x % 40 == 20){
fill(20,20,20);
}
if(x % 40 == 0){
fill(100,100,100);
}
ellipse(250,250,x,x);



}
}