package it32.Agafonov;

public class Month {
    int index_m;
    int index_y;

    Month() {
    }

    Month(int index_m, int index_y) {
        this.index_m = index_m;
        this.index_y = index_y;
    }

    String print() {
        switch (index_m) {
            case 1:
                return ("Номер который вы ввели это Январь в нем 31 день");

            case 2:
                if (((index_y % 4 == 0) && (index_y % 100 != 0)) || (index_y % 400 == 0)) {
                    return ("Номер который вы ввели это Февраль в нем 29 дней");
                } else {
                    return ("Номер который вы ввели это Февраль в нем 28 дней");
                }

            case 3:
                return ("Номер который вы ввели это Март в нем 31 день");

            case 4:
                return ("Номер который вы ввели это Апрель в нем 30 дней");

            case 5:
                return ("Номер который вы ввели это Май в нем 31 день");

            case 6:
                return ("Номер который вы ввели это Июнь в нем 30 дней");

            case 7:
                return ("Номер который вы ввели это Июль в нем 31 день");

            case 8:
                return ("Номер который вы ввели это Август в нем 31 день");

            case 9:
                return ("Номер который вы ввели это Сентябрь в нем 30 дней");

            case 10:
                return ("Номер который вы ввели это Октябрь в нем 31 день");

            case 11:
                return ("Номер который вы ввели это Ноябрь в нем 30 дней");

            case 12:
                return ("Номер который вы ввели это Декабрь в нем 31 день");

            default:
                return ("Месяца с таким номером нет");

        }
    }
}
