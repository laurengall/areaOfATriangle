import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int a;
    int b;
    int func;
    boolean stop = false;
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to the area calculator!");
    System.out.println();

    System.out.println("Type the number of shape will you be using:");
    System.out.println("1. Triangle");
    System.out.println("2. Square");
    System.out.println("3. Rectangle");
    System.out.println("4. Circle");
    func = input.nextInt();
    System.out.println();

    if (func == 1) {
      System.out.println("Enter the height of the triangle:");
      a = input.nextInt();
      System.out.println("Enter the base length of the triangle:");
      b = input.nextInt();
      System.out.println("The area of the given triangle is: " + areaTri(a, b));

    } else if (func == 2) {
      System.out.println("Enter the length of a side of the square:");
      a = input.nextInt();
      System.out.println("The area of the given square is: " + areaSq(a));

    } else if (func == 3) {
      System.out.println("Enter the height of the rectangle:");
      a = input.nextInt();
      System.out.println("Enter the length of the rectangle:");
      b = input.nextInt();
      System.out.println("The area of the given rectangle is: " + areaRec(a, b));

    } else if (func == 4) {
      System.out.println("Enter the radius of the circle:");
      a = input.nextInt();
      System.out.println("The area of the given circle is: " + areaCir(a));

    } else {
      System.out.println("Not a number from the menu. ");
      System.out.println("Please type the number of shape will you be using:");
      System.out.println("1. Triangle");
      System.out.println("2. Square");
      System.out.println("3. Rectangle");
      System.out.println("4. Circle");
      func = input.nextInt();
    }

    int c;
    System.out.println("Would you like to make another calculation?");
    System.out.println("Type 1 for yes and 2 for no.");
    c = input.nextInt();

    while (c == 1) {
      stop = false;
      System.out.println("Type the number of shape will you be using:");
      System.out.println("1. Triangle");
      System.out.println("2. Square");
      System.out.println("3. Rectangle");
      System.out.println("4. Circle");
      func = input.nextInt();
      System.out.println();

      if (func == 1) {
        System.out.println("Enter the height of the triangle:");
        a = input.nextInt();
        System.out.println("Enter the base length of the triangle:");
        b = input.nextInt();
        System.out.println("The area of the given triangle is: " + areaTri(a, b));

      } else if (func == 2) {
        System.out.println("Enter the length of a side of the square:");
        a = input.nextInt();
        System.out.println("The area of the given square is: " + areaSq(a));

      } else if (func == 3) {
        System.out.println("Enter the height of the rectangle:");
        a = input.nextInt();
        System.out.println("Enter the length of the rectangle:");
        b = input.nextInt();
        System.out.println("The area of the given rectangle is: " + areaRec(a, b));

      } else if (func == 4) {
        System.out.println("Enter the radius of the circle:");
        a = input.nextInt();
        System.out.println("The area of the given circle is: " + areaCir(a));

      } else {
        System.out.println("Not a number from the menu. ");
        System.out.println("Please type the number of shape will you be using:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Circle");
        func = input.nextInt();
      }
      System.out.println("Would you like to make another calculation?");
      System.out.println("Type 1 for yes and 2 for no.");
      c = input.nextInt();
    }

    System.out.println("Have a good day!");
    input.close();

  }

  public static double areaTri(double height, double base) {
    double areaOfT = .5 * (height + base);
    return areaOfT;
  }

  public static double areaSq(double side) {
    double areaOfSq = (side * side);
    return areaOfSq;
  }

  public static double areaRec(double height, double length) {
    double areaOfRec = height + length;
    return areaOfRec;
  }

  public static double areaCir(double radius) {
    double areaOfCir = (Math.PI) * (radius * radius);
    return areaOfCir;
  }

}