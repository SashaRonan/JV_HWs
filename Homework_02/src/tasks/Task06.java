package tasks;

import static tasks.Task05.getDirectoryContent;

public class Task06 {

    public static void expansion(String[] content) {
        String expansions = "";
        for (int i = 0; i < content.length; i++) {
            String file = content[i];
            for (int j = file.length() - 1; j >= 0; j--) {
                if (file.charAt(j) == '.') {
                    expansions = file.substring(j + 1);
                    System.out.println((i+1) + ". " + "Расширение файла: " + expansions);
                }
            }
        }
    }


    public static void main(String[] args) {
        String currentDirectory = "dirForTask06"; // Текущая директория
        String[] contents = getDirectoryContent(currentDirectory);
        expansion(contents);
    }
}
