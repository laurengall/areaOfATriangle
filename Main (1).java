import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    int a; 
    int b; 
       Scanner input = new Scanner(System.in); 
    System.out.println("Welcome to the area of a triangle calculator!"); 
    System.out.println(); 
        System.out.println("Enter the height of the triangle:"); 
    a = input.nextInt(); 
    System.out.println("Enter the base length of the triangle:"); 
    b = input.nextInt();
   System.out.println("The area of the given triangle is: " + area(a, b)); 
    input.close(); 
  }


  public static double area(double height, double base){
      double areaOfT = .5 * (height + base); 
    return areaOfT; 
  }
}