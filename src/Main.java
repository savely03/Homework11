public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №11");
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Task1:");
        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        System.out.printf(" ФИО сотрудника - %s %s %s.\n", middleName, firstName, lastName);
    }

    public static void task2() {
        System.out.println("Task2:");
        String fullName = "Ivanov Ivan Ivanovich";
        fullName = fullName.toUpperCase();
        System.out.printf(" Данные ФИО сотрудника для заполнения отчета - %s.\n", fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("Task3:");
        String fullName = "Иванов Семен Семенович";
        fullName = fullName.replace('ё', 'e' );
        System.out.printf(" Данные ФИО сотрудника - %s.\n", fullName);
    }
}