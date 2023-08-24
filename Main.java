import java.lang.annotation.AnnotationFormatError;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        if (x + y + z < 1) {
            double min = Math.min(Math.min(x, y), z);
               if (min == x) {
                x = (y + z) / 2;
                 } else if (min == y) {
                y = (x + z) / 2;
                   } else {
                z = (x + y) / 2;    }
        } else {
         double min = Math.min(x, y);
            if (min == x) {
                x = (y + z) / 2;
            } else {
               y = (x + z) / 2;
            }}
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);


        /* Random random = new Random();
         int randomNumber=random.nextInt(1,10);
 System.out.println(randomNumber);
 if (randomNumber==1){
     System.out.println(randomNumber); }
 else if (randomNumber==2){     System.out.println(randomNumber);
 } else if (randomNumber==3){
     System.out.println(randomNumber); }
 else {     System.out.println("Jok");
 }

         */
        /*Random ran=new Random();
        int num1=ran.nextInt(4);
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b= scan.nextInt();

        if(a<=4){
            System.out.println(a);
        }else if(b<=4) {
            System.out.println(b);


        }

         */
        /*Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a>0) {
            System.out.println(Math.sqrt(a));
        }
        if(b>0){
            System.out.println(Math.sqrt(b));
        }
        if(c>0){
            System.out.println(Math.sqrt(c));
        }

         */
        /*Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int v = scan.nextInt();
        if (a + b > v) {
            System.out.println("Существует");
        } else {
            System.out.println("Не существует");
        }

         */
        /*
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x > y?(x+y)/2:(x*y)*2);

         */
        //Exception
/*
        System.out.println(5/0);
 */
/*
        int ss = 121;
        double num = Math.sqrt(ss);

        if (num % 1 != 0) {
            throw new RuntimeException();
        }
        {
            System.out.println("true");
        }

 */
        /*
        try {
            Parametry parametry = new Parallelepiped(6, 5, 6, 2);
            if (parametry.getDlina() < 0
                    || parametry.getShirina() < 0
                    || parametry.getVysota() < 0
                    || parametry.getRadius() < 0) {
                throw new RuntimeException();
            } else if (String.valueOf(parametry.getDlina()).matches("\\D")
                    || String.valueOf(parametry.getShirina()).matches("\\D")
                    || String.valueOf(parametry.getVysota()).matches("\\D")
                    || String.valueOf(parametry.getRadius()).matches("\\D")) {
                throw new NumberFormatException();
            }
            parametry.Vychis();
            System.out.println();
        } catch (RuntimeException e ) {
            System.out.println("Вы вввели не правельные параметры");
            System.out.println();
        }catch (NumberFormatException e){
            System.out.println("В место цифры вы написали букву");
        }
        try {
            Parametry parametry1 = new Cylinder(8, 3, 4, 5);
            if (parametry1.getDlina() < 0
                    || parametry1.getShirina() < 0
                    || parametry1.getVysota() < 0
                    || parametry1.getRadius() < 0) {
                throw new RuntimeException();
            }
            parametry1.Vychis();
        } catch (RuntimeException e) {
            System.out.println("Вы вввели не правельные параметры");
        }

         */
        /*
        try {
            Parametry parametry = new Parallelepiped(3, 7, 6, 2);
            if (parametry.getDlina() < 0
                    || parametry.getShirina() < 0
                    || parametry.getVysota() < 0
                    || parametry.getRadius() < 0) {
                throw new ArithmeticException();
            } else if (String.valueOf(parametry.getDlina()).matches("\\D")
                    || String.valueOf(parametry.getShirina()).matches("\\D")
                    || String.valueOf(parametry.getVysota()).matches("\\D")
                    || String.valueOf(parametry.getRadius()).matches("\\D")) {
                throw new NumberFormatException();
            }
            parametry.Vychis();
            System.out.println();
        } catch (ArithmeticException e) {
            System.out.println("Вы ввели неправильные параметры");
            System.out.println();
        } catch (InputMismatchException ex) {
            System.out.println("Вы ввели буквы вместо чисел");
            System.out.println();
        }

        try {
            Parametry parametry1 = new Cylinder(8, 3, 4, 5);
            if (parametry1.getDlina() < 0
                    || parametry1.getShirina() < 0
                    || parametry1.getVysota() < 0
                    || parametry1.getRadius() < 0) {
                throw new RuntimeException();
            }
            parametry1.Vychis();
        } catch (RuntimeException e) {
            System.out.println("Вы ввели неправильные параметры");
        }

         */

        Scanner scanner = new Scanner(System.in);
        int fff = 0;
        do {
            System.out.println("1.Parallelepiped тин колому жана аянты");
            System.out.println("2.Cylinder дин колому жана аянты");

            int vybory = scanner.nextInt();
            switch (vybory) {
                case 1:
                    try {
                        System.out.print("Введите длину для Parallelepiped: ");
                        int dlina = scanner.nextInt();

                        System.out.print("Введите ширину для Parallelepiped: ");
                        int shirina = scanner.nextInt();

                        System.out.print("Введите высоту для Parallelepiped: ");
                        int vysota = scanner.nextInt();

                        System.out.print("Введите радиус для Parallelepiped: ");
                        int radius = scanner.nextInt();

                        Parametry parametry = new Parallelepiped(dlina, shirina, vysota, radius);


                        if (parametry.getDlina() < 0
                                || parametry.getShirina() < 0
                                || parametry.getVysota() < 0
                                || parametry.getRadius() < 0) {
                            throw new ArithmeticException();
                        } else if (String.valueOf(parametry.getDlina()).matches("\\D")
                                || String.valueOf(parametry.getShirina()).matches("\\D")
                                || String.valueOf(parametry.getVysota()).matches("\\D")
                                || String.valueOf(parametry.getRadius()).matches("\\D")) {
                            throw new NumberFormatException();
                        } else if (dlina > 1000000
                                || shirina > 1000000
                                || vysota>1000000
                                || radius>1000000) {
                            throw new RuntimeException();
                        }

                        parametry.Vychis();
                        System.out.println();
                    } catch (ArithmeticException e) {
                        System.out.println("Вы ввели неправильные параметры для Parallelepiped");
                        System.out.println();
                    } catch (InputMismatchException ex) {
                        System.out.println("Вы ввели буквы вместо чисел для Parallelepiped");
                        System.out.println();
                    }catch (RuntimeException exc){
                        System.out.println(" значение должен быть меньше 1000000");
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Введите длину для Cylinder: ");
                        int dlina = scanner.nextInt();

                        System.out.print("Введите ширину для Cylinder: ");
                        int shirina = scanner.nextInt();

                        System.out.print("Введите высоту для Cylinder: ");
                        int vysota = scanner.nextInt();

                        System.out.print("Введите радиус для Cylinder: ");
                        int radius = scanner.nextInt();

                        Parametry parametry1 = new Cylinder(dlina, shirina, vysota, radius);
                        if (parametry1.getDlina() < 0 || parametry1.getShirina() < 0 || parametry1.getVysota() < 0 || parametry1.getRadius() < 0) {
                            throw new ArithmeticException();
                        } else if (String.valueOf(parametry1.getDlina()).matches("\\D")
                                || String.valueOf(parametry1.getShirina()).matches("\\D")
                                || String.valueOf(parametry1.getVysota()).matches("\\D")
                                || String.valueOf(parametry1.getRadius()).matches("\\D")) {
                            throw new NumberFormatException();
                        } else if (dlina > 1000000
                                || shirina > 1000000
                                || vysota>1000000
                                || radius>1000000) {
                            throw new RuntimeException();
                        }
                        parametry1.Vychis();
                        System.out.println();
                    } catch (ArithmeticException e) {
                        System.out.println("Вы ввели неправильные значения для Cylinder");
                        System.out.println();
                    } catch (InputMismatchException e) {
                        System.out.println("Вы ввели буквы вместо чисел для Cylinder");
                        System.out.println();
                    }catch (RuntimeException exc){
                        System.out.println(" значение должен быть меньше 1000000");
                    }
                    break;
                default:
                    System.out.println("Выбран не правильный пункт");
            }
        } while (fff != 3);
    }
}

