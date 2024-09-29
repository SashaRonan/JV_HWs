//Задача 3. Удаление пустых строк из текста
//Дана строка с несколькими строками текста, разделенными переводами строки.
//        Напишите метод, который удаляет все пустые строки из текста


package homeworks;

public class removeEmptyLines {

    public static void main(String[] args) {

        String text = "line1\n" +
                "\n" +
                "line2\n" +
                "\n" +
                "\n" +
                "\n" +
                "line3\n" +
                "\n" +
                "\n";
        System.out.println(removeEmptyLines(text));
    }

    public static String removeEmptyLines(String text) {
        StringBuilder result = new StringBuilder();
        String[] array = text.split("\n");
        for (int i = 0; i < array.length; i++) {
            if (!array[i].trim().isEmpty()) {
                result.append(array[i].trim()).append("\n");
            }
        }
        return result.toString().trim();
    }


}


