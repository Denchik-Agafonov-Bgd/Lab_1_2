//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package it32.Agafonov;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger Logger = LogManager.getLogger(Main.class);

    public Main() {
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        FileWriter fw = new FileWriter("output.txt");
        DecimalFormat df = new DecimalFormat("###.##");

        int value;
        int tmp;
        String error;
        String line;
        while(true) {
            try {
                System.out.println("Введите номер задания которое вы хотите проверить (1 - 4)");
                line = scanner.nextLine();
                error = "Введенны данные: " + line;
                Logger.info(error);
                value = Integer.parseInt(line);
                if (value != 1 && value != 2 && value != 3 && value != 4) {
                    error = "Введены некорректные данные при выборе задания";
                    Logger.warn(error);
                    System.out.println("Введены некорректные данные при выборе задания");
                } else {
                    System.out.println("1 - ввести с файла, 2 - ввести с консоли");
                    line = scanner.nextLine();
                    error = "Введенны данные: " + line;
                    Logger.info(error);
                    tmp = Integer.parseInt(line);
                    if (tmp == 1 || tmp == 2 || tmp == 3 || tmp == 4) {
                        break;
                    }

                    error = "Введены некорректные данные при выборе способа ввода информации";
                    Logger.warn(error);
                    System.out.println("Введены некорректные данные при выборе способа ввода информации");
                }
            } catch (NumberFormatException var34) {
                System.out.println("Некорректные данные, на этапе ввода номера задания и способа ввода информации нужно вводить только целые числа");
                error = "Некорректные данные, на этапе ввода номера задания и способа ввода информации нужно вводить только целые числа";
                Logger.warn(error);
            }
        }

        String var10000;
        switch(value) {
            case 1:
                Triangle abc = new Triangle();

                while(true) {
                    try {
                        if (tmp == 1) {
                            try {
                                FileReader fr = new FileReader("input.txt");

                                try {
                                    Scanner scan = new Scanner(fr);
                                    line = scan.nextLine();
                                    error = "Введенны данные с файла: " + line;
                                    Logger.info(error);
                                    abc.a = Double.parseDouble(line);
                                    line = scan.nextLine();
                                    error = "Введенны данные с файла: " + line;
                                    Logger.info(error);
                                    abc.b = Double.parseDouble(line);
                                    line = scan.nextLine();
                                    error = "Введенны данные с файла: " + line;
                                    Logger.info(error);
                                    abc.c = Double.parseDouble(line);
                                    scan.close();
                                    fr.close();
                                } catch (Throwable var25) {
                                    try {
                                        fr.close();
                                    } catch (Throwable var24) {
                                        var25.addSuppressed(var24);
                                    }

                                    throw var25;
                                }

                                fr.close();
                            } catch (IOException var26) {
                                error = "Файл не найден";
                                Logger.error(error);
                                System.out.println("Файл не найден");
                                System.exit(0);
                            }
                        } else {
                            System.out.println("Введите длину стороны a ");
                            line = scanner.nextLine();
                            error = "Введенны данные: " + line;
                            Logger.info(error);
                            abc.a = Double.parseDouble(line);
                            System.out.println("Введите длину стороны b ");
                            line = scanner.nextLine();
                            error = "Введенны данные: " + line;
                            Logger.info(error);
                            abc.b = Double.parseDouble(line);
                            System.out.println("Введите длину стороны c ");
                            line = scanner.nextLine();
                            error = "Введенны данные: " + line;
                            Logger.info(error);
                            abc.c = Double.parseDouble(line);
                        }
                        break;
                    } catch (NumberFormatException var27) {
                        if (tmp == 1) {
                            System.out.println("Некорректные данные в файле, можно вводить только числа");
                            error = "Некорректные данные в файле, можно вводить только числа";
                            Logger.warn(error);
                            System.exit(0);
                        } else {
                            System.out.println("Некорректные данные, можно вводить только числа");
                            error = "Некорректные данные, можно вводить только числа";
                            Logger.warn(error);
                        }
                    }
                }

                if (abc.check()) {
                    var10000 = df.format(abc.area());
                    error = "Треугольник существует, его площадь равна= " + var10000;
                    System.out.println(error);
                    Logger.info(error);
                    fw.write(error);
                } else {
                    System.out.println("Треугольник не существует");
                    error = "Треугольник не существует";
                    Logger.info(error);
                    fw.write("Треугольник не существует");
                }

                fw.close();
                break;
            case 2:
                Month month = new Month();

                while(true) {
                    try {
                        if (tmp == 1) {
                            try {
                                FileReader fr = new FileReader("input.txt");

                                try {
                                    Scanner scan = new Scanner(fr);
                                    line = scan.nextLine();
                                    error = "Введенны данные с файла: " + line;
                                    Logger.info(error);
                                    month.index_m = Integer.parseInt(line);
                                    line = scan.nextLine();
                                    error = "Введенны данные с файла: " + line;
                                    Logger.info(error);
                                    month.index_y = Integer.parseInt(line);
                                    scan.close();
                                    fr.close();
                                } catch (Throwable var22) {
                                    try {
                                        fr.close();
                                    } catch (Throwable var21) {
                                        var22.addSuppressed(var21);
                                    }

                                    throw var22;
                                }

                                fr.close();
                            } catch (IOException var23) {
                                error = "Файл не найден";
                                Logger.error(error);
                                System.out.println("Файл не найден");
                                System.exit(0);
                            }
                        } else {
                            System.out.println("Введите номер месяца ");
                            line = scanner.nextLine();
                            error = "Введенны данные: " + line;
                            Logger.info(error);
                            month.index_m = Integer.parseInt(line);
                            System.out.println("Введите год ");
                            line = scanner.nextLine();
                            error = "Введенны данные: " + line;
                            Logger.info(error);
                            month.index_y = Integer.parseInt(line);
                        }
                        break;
                    } catch (NumberFormatException var33) {
                        if (tmp == 1) {
                            System.out.println("Некорректные данные в файле, можно вводить только целые числа");
                            error = "Некорректные данные в файле, можно вводить только целые числа";
                            Logger.warn(error);
                            System.exit(0);
                        } else {
                            System.out.println("Некорректные данные, можно вводить только целые числа");
                            error = "Некорректные данные, можно вводить только целые числа";
                            Logger.warn(error);
                        }
                    }
                }

                System.out.println(month.print());
                error = month.print();
                System.out.println(error);
                Logger.info(error);
                fw.write(error);
                fw.close();
                break;
            case 3:
                Sport men = new Sport();

                while(true) {
                    try {
                        if (tmp == 1) {
                            try {
                                FileReader fr = new FileReader("input.txt");

                                try {
                                    Scanner scan = new Scanner(fr);
                                    line = scan.nextLine();
                                    error = "Введенны данные с файла: " + line;
                                    Logger.info(error);
                                    men.distance = Double.parseDouble(line);
                                    line = scan.nextLine();
                                    error = "Введенны данные с файла: " + line;
                                    Logger.info(error);
                                    men.percent = Integer.parseInt(line);
                                    line = scan.nextLine();
                                    error = "Введенны данные с файла: " + line;
                                    Logger.info(error);
                                    men.days = Integer.parseInt(line);
                                    scan.close();
                                    fr.close();
                                } catch (Throwable var19) {
                                    try {
                                        fr.close();
                                    } catch (Throwable var18) {
                                        var19.addSuppressed(var18);
                                    }

                                    throw var19;
                                }

                                fr.close();
                            } catch (IOException var20) {
                                error = "Файл не найден";
                                Logger.error(error);
                                System.out.println("Файл не найден");
                                System.exit(0);
                            }
                        } else {
                            System.out.println("Введите сколько спортсмен пробегает на первой тренировке ");
                            line = scanner.nextLine();
                            error = "Введенны данные: " + line;
                            Logger.info(error);
                            men.distance = Double.parseDouble(line);
                            System.out.println("Введите процент на сколько спортсмен увеличивает норму ");
                            line = scanner.nextLine();
                            error = "Введенны данные: " + line;
                            Logger.info(error);
                            men.percent = Integer.parseInt(line);
                            System.out.println("Введите кол-во дней сколько будут длиться тренировки ");
                            line = scanner.nextLine();
                            error = "Введенны данные: " + line;
                            Logger.info(error);
                            men.days = Integer.parseInt(line);
                        }
                        break;
                    } catch (NumberFormatException var28) {
                        if (tmp == 1) {
                            System.out.println("Некорректные данные в файле, можно вводить только числа");
                            error = "Некорректные данные в файле, можно вводить только числа";
                            Logger.warn(error);
                            System.exit(0);
                        } else {
                            System.out.println("Некорректные данные, можно вводить только числа");
                            error = "Некорректные данные, можно вводить только числа";
                            Logger.warn(error);
                        }
                    }
                }

                if (men.days < 1) {
                    error = "Спортсмен не занимался";
                    Logger.info(error);
                    System.out.println(error);
                    fw.write(error);
                    fw.close();
                } else {
                    var10000 = df.format(men.sum_dist());
                    error = "Спортсмен за все дни пробежал " + var10000 + " километров";
                    Logger.info(error);
                    System.out.println(error);
                    fw.write(error);
                    fw.close();
                }
                break;
            case 4:
                int lenght = 1;
                Sequence[] arr = new Sequence[lenght];
                Sequence a;
                if (tmp == 2) {
                    while(true) {
                        try {
                            System.out.println("Введите элемент последовательности ");
                            line = scanner.nextLine();
                            error = "Введенны данные: " + line;
                            Logger.info(error);
                            a = new Sequence(Integer.parseInt(line));
                            arr[0] = a;
                            break;
                        } catch (NumberFormatException var30) {
                            error = "Некорректные данные, можно вводить только целые числа";
                            Logger.info(error);
                            System.out.println("Некорректные данные, можно вводить только целые числа");
                        }
                    }
                }

                while(true) {
                    try {
                        if (tmp == 1) {
                            try {
                                BufferedReader fr = new BufferedReader(new FileReader("input.txt"));

                                try {
                                    line = fr.readLine();
                                    error = "Введенны данные с файла: " + line;
                                    Logger.info(error);
                                    arr[0] = new Sequence(Integer.parseInt(line));
                                    new Scanner(fr);

                                    while((line = fr.readLine()) != null) {
                                        error = "Введенны данные с файла: " + line;
                                        Logger.info(error);
                                        a = new Sequence(Integer.parseInt(line));
                                        ++lenght;
                                        Sequence[] arr1 = new Sequence[lenght];
                                        System.arraycopy(arr, 0, arr1, 0, arr.length);
                                        arr1[lenght - 1] = a;
                                        arr = arr1;
                                    }
                                } catch (Throwable var29) {
                                    try {
                                        fr.close();
                                    } catch (Throwable var17) {
                                        var29.addSuppressed(var17);
                                    }

                                    throw var29;
                                }

                                fr.close();
                                break;
                            } catch (IOException var31) {
                                error = "Файл не найден";
                                Logger.error(error);
                                System.out.println("Файл не найден");
                                System.exit(0);
                            }
                        } else {
                            System.out.println("Введите элемент последовательности, если элементов нет то введите 'NO'");
                            line = scanner.nextLine();
                            error = "Введенны данные: " + line;
                            Logger.info(error);
                            if (line.equals("NO")) {
                                break;
                            }

                            a = new Sequence(Integer.parseInt(line));
                            ++lenght;
                            Sequence[] arr1 = new Sequence[lenght];
                            System.arraycopy(arr, 0, arr1, 0, arr.length);
                            arr1[lenght - 1] = a;
                            arr = arr1;
                        }
                    } catch (NumberFormatException var32) {
                        if (tmp == 1) {
                            System.out.println("Некорректные данные в файле, можно вводить только целые числа");
                            error = "Некорректные данные в файле, можно вводить только целые числа";
                            Logger.warn(error);
                            System.exit(0);
                        } else {
                            System.out.println("Некорректные данные, можно вводить только числа");
                            error = "Некорректные данные, можно вводить только числа";
                            Logger.warn(error);
                        }
                    }
                }

                for(int i = 0; i < lenght; ++i) {
                    if (arr[i].value > 0) {
                        error = "Первым в последовательности встречается положительное число";
                        Logger.info(error);
                        System.out.println(error);
                        fw.write(error);
                        break;
                    }

                    if (arr[i].value < 0) {
                        error = "Первым в последовательности встречается отрицательное число";
                        Logger.info(error);
                        System.out.println(error);
                        fw.write(error);
                        break;
                    }

                    if (i + 1 == lenght) {
                        error = "В последовательности встречаются только нули";
                        Logger.info(error);
                        System.out.println(error);
                        fw.write(error);
                    }
                }

                fw.close();
        }

        scanner.close();
    }
}