package Assignment9;

abstract class AbstractDemo {
	 double area,perimeter;       //we taking double data type of variables 
     abstract void findArea();          //A method which is declared and not  implemented is known as abstract method
     abstract void findPerimeter();
     
}
   class Circle extends AbstractDemo{      // here this class extended the abstract 
  	    
  	     double pi=3.141, radius =5;
  	               void  findArea(){     //and implemented the methods of abstract class
  	    
				area = pi*radius*radius;                  // here we are showing area of circle
				System.out.println("Area of circle : "+area);
  	     }
	
			void findPerimeter() {
				perimeter = 2*pi*radius;
				System.out.println("Perimeter of circle : "+perimeter);
			} 
   }
  	
   class Rectangle  extends AbstractDemo {     //here another subclass extended the  abstract class
  	 
  	 double length=50,breath=20;
  	             void findArea(){  //here we are implementing the method 
  	            	 area = length * breath;
  	            	 System.out.println("Area of Rectangle : "+area);
  	            	 
  	             }
  	         void findPerimeter(){
  	        	 perimeter = 2*(length + breath);
  	        	 System.out.println("Perimeter of Rectangle : "+perimeter);
  	        	 
  	             }
   }
     
   class Triangle extends AbstractDemo {       //here another subclass extended the Figure class which is abstract     
  	   
  	 double  side1=10,side2=30,side3=15;
  	 double  base = 20,height = 15;
  	            void findArea(){
  	            	area = (base * height)/2;
  	            	System.out.println("Area of Triangle : "+area);  
  	            	
  	            	
  	            }
  	          void findPerimeter(){
  	        	   perimeter = side1 + side2 +side3;
  	        	   System.out.println("Perimeter of Triangle : "+perimeter);
  	        	    
  	           }
   }
                                             //here we have created the main class
     public class Figure {
  	   public static void main(String[]args){  //it is main method 
  		   
  		   Circle circle = new Circle();            //here we cannot instantiate the object of an abstract class
  		   Rectangle rectangle = new Rectangle();   //so we created the objects of subclasses which defined methods in it 
  		   Triangle triangle = new Triangle();
  		   
  	circle.findArea(); //here it display the details
  	circle.findPerimeter();
  	rectangle.findArea();
  	rectangle.findPerimeter();
  	triangle.findArea();
  	triangle.findPerimeter();
  		   
  	   }

}



