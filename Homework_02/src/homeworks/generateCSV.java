package homeworks;

import java.util.Scanner;

public class generateCSV {

    public static String parseCSV(String[] headers, String[][] data) {
        StringBuilder resultCSV = new StringBuilder();
        for (int i = 0; i < headers.length; i++) {
            resultCSV.append(headers[i]);
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                resultCSV.append(data[i][j]);
            }
        }
        return resultCSV.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the header: ");
        String header = sc.nextLine();
        System.out.println("Enter the data: ");
        String data = sc.nextLine();
        String[] headers = header.split(",");
    }

}
