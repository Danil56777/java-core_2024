package lr8.Task1;

import java.io.File;

public class Example1 {
    public static void main(String[] args) {
        try {
            File f1 = new File("/home/danila/IdeaProjects/java-core_2024/lr8/Task1/MyFile1.txt");
            f1.createNewFile(); // Создаёт новый файл, если он не существует
            if (f1.exists()) {
                System.out.println("Создан!!!!");
                System.out.println("Полный путь 1: " + f1.getAbsolutePath());
            }

            File f2 = new File("/home/danila/IdeaProjects/java-core_2024/lr8/Task1/MyFile2.txt");
            f2.createNewFile();
            System.out.println("Полный путь 2: " + f2.getAbsolutePath());

            File f3 = new File("/home/danila/IdeaProjects/java-core_2024/lr8/Task1/Papka1/Papka2/Papka3");
            f3.mkdirs(); // Создаёт иерархию папок, если они не существуют
            System.out.println("Полный путь 3: " + f3.getAbsolutePath());
        } catch (Exception e) {
            System.out.println("Ошибка!!! " + e.getMessage());
        }
    }
}
