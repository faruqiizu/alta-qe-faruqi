import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //80 sampai 100 = A
        //65 sampai 79 = B+
        //50 sampai 64 = B
        //35 sampai 49 = C
        //0 sampai 34 = D

        //kurang dari 0 dan lebih dari 100 status "invalid"

        Scanner scan = new Scanner(System.in);
        System.out.println("StudentScore : ");
        int studentscore = scan.nextInt();
        String score = "";

        if (studentscore >= 80 && studentscore <= 100) {
            score = "A";
        } else if (studentscore >= 65 && studentscore <= 79) {
            score = "B+";
        } else if (studentscore >= 50 && studentscore <= 64) {
            score = "B";
        } else if (studentscore >= 35 && studentscore <= 49) {
            score = "C";
        } else {
            score = "D";
        }

        System.out.println("Nilai Mahasiswa Faruqi adalah " + score);
    }
}