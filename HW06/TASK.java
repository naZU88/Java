package HW06;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TASK {
    public static void main(String[] args) {
    file file1 = new file("Asus", "4", "1000", "Windows", "grey");
    file file2 = new file("Asus", "4", "1000", "Lunex", "black");
    file file3 = new file("Asus", "4", "2000", "Windows", "black");
    file file4 = new file("Asus", "16", "1000", "Windows", "grey");
    file file5 = new file("Huawei", "8", "1000", "Windows", "black");

    Set<file> files = new HashSet<>(List.of(file1, file2,
            file3, file4, file5));

    Map<String, String> sel = selectCriteria();

    sort(sel, files);

    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        return scan;
    }

    public static Map<String, String> selectCriteria() {
        Map<String, String> resultCriterias = new HashMap<>();
        while (true) {
            System.out.println("Вы хотите выбрать критерий? Если да введите 'y', если нет введите 'n'");
            String question = scanner();
            if (question.equals("n")) {
                break;
            } else {

                System.out.println(
                        "Введите цифру, соответствующую необходимому критерию: \n 1 - Название \n 2 - ОЗУ \n 3 - Объем ЖД \n 4 - Операционная система \n 5 - Цвет");
                String key = scanner();
                System.out.println("Введите значения для выбранного критерия: ");
                String value = scanner();

                resultCriterias.put(key, value);
            }
        }
        System.out.println(resultCriterias);
        return resultCriterias;

    }

   public static void sort(Map<String, String> criterias, Set<file> files) {

      Set<file> temp = new HashSet<>(files);
      for (file file : files) {

         for (Object pair : criterias.keySet()) {

            if (pair.equals("1") && !file.getName().equals(criterias.get(pair))) {
               temp.remove(file);
            }
            for (Object pair1 : criterias.keySet()) {

               if (pair1.equals("2") && !file.getRam().equals(criterias.get(pair1))) {
                  temp.remove(file);

               }
               for (Object pair2 : criterias.keySet()) {

                  if (pair2.equals("3") && !file.getHardDisk().equals(criterias.get(pair2))) {
                     temp.remove(file);

                  }
                  for (Object pair3 : criterias.keySet()) {

                     if (pair3.equals("4") && !file.getOperatingSystem().equals(criterias.get(pair3))) {
                        temp.remove(file);

                     }
                     for (Object pair4 : criterias.keySet()) {

                        if (pair4.equals("5") && !file.getColour().equals(criterias.get(pair4))) {
                           temp.remove(file);

                        }
                     }
                  }
               }
            }
         }

      }
      if (temp.isEmpty()) {
         System.out.println("По введенным критериям ничего не найдено!");
      } else {
         System.out.println("Вот что мы можем предложить: \n" + temp.toString());
      }

    }
}
