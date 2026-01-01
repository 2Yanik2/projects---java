import java.util.Scanner;
public class Yanik2{

    public static void returnBasic(int a, int b, int option2){               //Basic Operations method
            if(option2 == 1){
                int sum = a+b;
                System.out.println(sum);
            } else if(option2 == 2){
                int sub = a-b;
                System.out.println(sub);
            } else if(option2 == 3){
                int mul = a*b;
                System.out.println(mul);
            } else if(option2 == 4){
                if(b == 0){
                    System.out.println("Error! Division by 0.");
                } else{
                    int div = a/b;
                    System.out.println(div);
                }
            } else{
                System.out.println("Invalid option!");
            }
        }

        public static void returnQuadratic(double a, double b, double c){        //Quadratic function method
            if(a == 0){
                System.out.println("Error! It's not a Quadratic Function.");
            } else{
                double delta = Math.pow(b,2) - 4*a*c;
                if(delta < 0){
                    System.out.println("No Solution!");
                } else{
                    double x1 = (-b + Math.sqrt(delta)) / 2*a;
                    double x2 = (-b - Math.sqrt(delta)) / 2*a;

                    if(x1 == x2){
                        System.out.println("x = "+x1);
                    } else{
                        System.out.println("x1 = "+x1);
                        System.out.println("x2 = "+x2);
                    }
                }
            }
        }

        public static void returnPrime(int num){
            int cont = 0;
            if(num < 0){
                System.out.println("Invalid Number!");
            } else{                                                               // Prime method
                for(int i = 1; i <= num; i++){
                    if(num % i == 0){
                        cont++;
                    }
                }
            }

            if(cont == 2){
                System.out.println("It's Prime.");
            } else{
                System.out.println("It's not Prime.");
            }
        }

        public static void returnFactorial(int num){                             //factorial method
            if(num < 0){
                System.out.println("Invalid Number!");
            }  else{
                int fact = 1;
                for(int i = 1; i <= num; i++){
                    fact = fact * i;
                }
                System.out.println(fact);
            }
        }

        public static void returnTrigonometric(double num, int option2){         //Trigonometric method
            if(option2  == 1){
                System.out.println(Math.sin(num));
            } else if(option2 == 2){
                System.out.println(Math.cos(num));
            } else if(option2 == 3){
                System.out.println(Math.tan(num));
            } else if(optio2 == 4){
                System.out.println(1/Math.tan(num));
            }else{
                System.out.println("Invalid Number!");
            }
        }


    
    

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        char option3;
        do{
        System.out.println("----------Calculator----------");
        System.out.println("  1-Basic Operations  ");
        System.out.println("  2-Quadratic function  ");
        System.out.println("  3-Prime number  ");
        System.out.println("  4-Factorial  ");
        System.out.println("  5-Trigononometric function  ");
        System.out.println();
        System.out.print("Insert your option: ");
        int option = input.nextInt();

        if(option == 1){                                                    //Basic Operations main
            System.out.println("----------Basic Operations----------");
            System.out.println("    1-Sum    ");
            System.out.println("    2-SUbtraction");
            System.out.println("    3-Multiplication");
            System.out.println("    4-Division");
            System.out.println();
            System.out.print("Insert your option: ");
            int option2 = input.nextInt();

            System.out.print("Insert the first value: ");
            int a = input.nextInt();
            System.out.print("Insert the second value: ");
            int b = input.nextInt();

            returnBasic(a, b, option2);

        } else if (option == 2){  
            System.out.println("----------Quadratic function----------");                                             //Quadratic function main
             System.out.print("Insert the value of A: ");
            double a = input.nextDouble();
            System.out.print("Insert the value of B: ");
            double b = input.nextDouble();
            System.out.print("Insert the value of C: ");
            double c = input.nextDouble();

            returnQuadratic(a, b, c);

        } else if (option == 3){            
            System.out.println("----------Prime Number----------");                          //Prime main
            System.out.print("Insert the number: ");
            int num = input.nextInt();
            returnPrime(num);

        } else if(option == 4){     
            System.out.println("----------Factorial----------");                               // factorial main
            System.out.print("Insert the number: ");
            int num = input.nextInt();
            returnFactorial(num);

        } else if(option == 5){    
            System.out.println("----------Trigonometric----------");                               //Trigonometric main
            System.out.println("1-Sine");
            System.out.println("2-Cosine");
            System.out.println("3-Tangent");
            System.out.println("4-Cotangent");
            System.out.println();
            System.out.print("Insert option: ");
            int option2 = input.nextInt();
            System.out.print("Insert the number: ");
            double num = input.nextDouble();
            
            returnTrigonometric(num, option2);

        } else{
            System.out.println("Invalid Number! ");
        }

        System.out.println("S - Continue;");
        System.out.println("N - Close");
        option3 = input.next().charAt(0);

    } while(option3 == 's' || option3 == 'S');
    }
}