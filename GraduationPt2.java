package WhileLoopLab;

import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int counter = 1;
        int excluded = 0;
        double sum = 0;
        while (counter <= 12){
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4.00){
                excluded++;

            }
            else{
                counter++;
            }

            if (excluded > 1){
                break;
            }

            sum = sum + grade;

        }

        double avg = sum/12;

        if (excluded > 1){
            System.out.printf("%s has been excluded at %d%n", name, counter);
        }

        else {
            System.out.printf("%s graduated. Average grade: %.2f", name, avg);
        }
    }
}