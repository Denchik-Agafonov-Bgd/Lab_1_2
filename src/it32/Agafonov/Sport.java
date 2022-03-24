package it32.Agafonov;

import java.util.Scanner;

import org.apache.logging.log4j.*;

public class Sport {
    static final Logger Logger = LogManager.getLogger(Sport.class);
    double distance;
    int percent;
    int days;

    Sport() {

    }

    Sport(double dist, int perc, int days) {
        this.distance = dist;
        this.percent = perc;
        this.days = days;
    }

    double sum_dist() {
        Scanner scanner = new Scanner(System.in);
        double sum = distance, i = 1;

        System.out.println("1 - while, 2 - for ");
        int choice;
        choice = scanner.nextInt();

        Logger.info("Введенны данные: " + choice);

        if (choice == 1) {
            Logger.debug("Выбран цикл while");
            while (days > i) {
                distance *= (percent * 0.01 + 1);
                sum += distance;
                i++;

            }
        } else {
            Logger.debug("Выбран цикл for");
            for (int j = 1; j < days; j++) {
                distance *= (percent * 0.01 + 1);
                sum += distance;

            }
        }
        scanner.close();
        return sum;
    }
}
