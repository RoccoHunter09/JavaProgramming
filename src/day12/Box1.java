package day12;

public class Box1 {
	
	double height,width,length;
	
	Box1(){
		height=width=length=0;
	}
	
	Box1(double w,double x,double y){
		height=w;
		width=x;
		length=y;
		
	}
	Box1(double len){
		height=length=width=len;
	}
	
	double volume() {
		return(height*length*width);
	}
}
