//Подсказка № 1
//        Для добавления сайта в историю посещений используйте метод addFirst из Deque.
//        Это добавит сайт в начало очереди, что позволит вам хранить самые последние
//        посещенные сайты в начале истории.
//        Подсказка № 2
//        Для возвращения к сайту, который был посещен steps назад, используйте метод
//        stream вместе с skip и findFirst из Deque. Метод stream создаст поток элементов
//        из очереди, skip пропустит первые steps элементов, а findFirst вернет первый
//        оставшийся элемент или null, если шагов больше, чем элементов в очереди.
//        Подсказка № 3
//        Метод getHistory должен просто вернуть сам Deque, который уже содержит историю
//        посещений в нужном порядке — от последнего посещенного к первому.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDirectory {

    // Хранилище для студентов: имя - список оценок
    private Map<String, List<Integer>> students = new HashMap<>();

    // Добавление или обновление студента
    public void addStudent(String name, Integer grade) {
        // computeIfAbsent добавляет новый список, если такого имени нет
        students.computeIfAbsent(name, k -> new ArrayList<>()).add(grade);
    }

    // Поиск студента по имени
    public List<Integer> findStudent(String name) {
        // getOrDefault вернет список оценок, если студент есть, или пустой список
        return students.getOrDefault(name, new ArrayList<>());
    }

    // Получение всех студентов
    public Map<String, List<Integer>> getAllStudents() {
        return students;
    }

    // Удаление студента по имени
    public void removeStudent(String name) {
        students.remove(name);
    }

    // Тестирование программы
    public static void main(String[] args) {
        StudentDirectory directory = new StudentDirectory();

        // Добавляем студентов
        directory.addStudent("Alice", 90);
        directory.addStudent("Bob", 85);
        directory.addStudent("Alice", 95); // Обновление студента Alice

        // Поиск студента
        System.out.println("Оценки Alice: " + directory.findStudent("Alice")); // [90, 95]
        System.out.println("Оценки Bob: " + directory.findStudent("Bob")); // [85]
        System.out.println("Оценки Charlie: " + directory.findStudent("Charlie")); // []

        // Получение всех студентов
        System.out.println("Все студенты: " + directory.getAllStudents());

        // Удаление студента
        directory.removeStudent("Bob");
        System.out.println("После удаления Bob: " + directory.getAllStudents());
    }
}
