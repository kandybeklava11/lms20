import java.lang.annotation.AnnotationFormatError;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
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

