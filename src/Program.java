import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();
        toyShop.addToy(new Lego());
        toyShop.addToy(new Transformer());
        toyShop.addToy(new Bear());

        ;
        while (true) {
            System.out.println("\nВыберете действие:");
            System.out.println("1. Розыгрыш игрушки");
            System.out.println("2. Добавление новой игрушки");
            System.out.println("3. Изменение частоты выпадения игрушки");
            System.out.println("4. Сохранить список игрушек в файл");
            System.out.println("5. Выйти");


            int no = Integer.parseInt(scanner.nextLine());

            if (no == 1) {
                toyShop.drawToys();
            } else if (no == 2) {
                System.out.println("Введите название новой игрушки:");
                String name = scanner.next();
                System.out.println("Введите количество новой игрушки:");
                int quantity = scanner.nextInt();
                System.out.println("Введите частоту выпадения новой игрушки");
                double weight = scanner.nextDouble();
                toyShop.addToy(new Toys(toyShop.setId(), name, quantity, weight));
                scanner.nextLine();
            } else if (no == 3) {
                toyShop.showToys();
                System.out.println("Введите id игрушки для изменения частоты выпадания");
                int toyId = scanner.nextInt();
                System.out.println("Введите частоту выпадания игрушки:");
                double newWeight = scanner.nextDouble();
                toyShop.setToyWeight(toyId, newWeight);
                scanner.nextLine();
            } else if (no == 4) {
                toyShop.saveToFile("src/main/java/MalyshevAA/Toys.txt");
                toyShop.saveToFile("src/main/java/MalyshevAA/Toys.json");
            } else if (no == 5) {
                System.out.println("Вы вышли.");
                scanner.close();
                break;
            } else
                System.out.println("Некорректный ввод!");

        }
    }
}

