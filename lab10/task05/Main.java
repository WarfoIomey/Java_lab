package lab10.task05;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final String FILE_PATH = "C:\\Java_ex\\labs\\lab10\\task05\\example3.xlsx";
    private static final String SHEET_NAME = "Товары";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean retry = true;

        while (retry) {
            try {
                File file = new File(FILE_PATH);
                if (!file.exists()) {
                    throw new IOException("Файл не найден: " + FILE_PATH);
                }
                if (!FILE_PATH.endsWith(".xlsx")) {
                    throw new IOException("Неправильный формат файла. Ожидается файл с расширением .xlsx.");
                }
                try (FileInputStream inputStream = new FileInputStream(file);
                     XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {
                    XSSFSheet sheet = workbook.getSheet(SHEET_NAME);
                    if (sheet == null) {
                        throw new IOException("Лист с именем '" + SHEET_NAME + "' не найден.");
                    }
                    readSheet(sheet);
                    retry = false;
                }
            } catch (IOException e) {
                System.err.println("Ошибка: " + e.getMessage());
                System.err.println("Рекомендация: Убедитесь, что файл существует, имеет правильный " +
                        "формат и содержит лист с именем '" + SHEET_NAME + "'.");
                System.out.print("Хотите повторить попытку? (да/нет): ");
                String response = scanner.nextLine().trim().toLowerCase();
                if (!response.equals("да")) {
                    retry = false;
                }
            }
        }
        scanner.close();
    }

    private static void readSheet(XSSFSheet sheet) {
        System.out.println("Данные из листа '" + SHEET_NAME + "':");
        for (Row row : sheet) {
            for (Cell cell : row) {
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }
    }
}