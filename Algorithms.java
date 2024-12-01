import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twoDigits = twoDigits();
        int greatFHun = greatFHun();
        int greatestNum = greatestNum();
        int smallestNum = smallestNum();
        int sumNum = sumNum();
        double mean = mean();
        int mode = modeNum();

        System.out.print("Odds: ");
        System.out.println(odds);
        System.out.print("Evens: ");
        System.out.println(evens);
        System.out.print("Two digit numbers: ");
        System.out.println(twoDigits);
        System.out.print("Greater than five hundred: ");
        System.out.println(greatFHun);
        System.out.print("Greatest number: ");
        System.out.println(greatestNum);
        System.out.print("Smallest number: ");
        System.out.println(smallestNum);
        System.out.print("Sum of all numbers: ");
        System.out.println(sumNum);
        System.out.print("Average all numbers: ");
        System.out.println(mean);
        System.out.print("Most common number: ");
        System.out.println(mode);
        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }

    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }

    public static int twoDigits() throws FileNotFoundException{
        s = new Scanner(f);
        int twoDigits = 0;
        while (s.hasNext()) {
            int num = s.nextInt();
            if (num < 100 && num > 9)
                twoDigits++;
        }
        return twoDigits;
    }

    public static int greatFHun() throws FileNotFoundException{
        s = new Scanner(f);
        int greatFHun = 0;
        while (s.hasNext()) {
            if (s.nextInt() > 500)
                greatFHun++;
        }
        return greatFHun;
    }

    public static int greatestNum() throws FileNotFoundException{
        s = new Scanner(f);
        int greatestNum = 0;
        while (s.hasNext()) {
            if (s.nextInt() > greatestNum)
                greatestNum = s.nextInt();
        }
        return greatestNum;
    }

    public static int smallestNum() throws FileNotFoundException{
        s = new Scanner(f);
        int smallestNum = 999;
        while (s.hasNext()) {
            if (s.nextInt() < smallestNum)
                smallestNum = s.nextInt();
        }
        return smallestNum;
    }

    public static int sumNum() throws FileNotFoundException{
        s = new Scanner(f);
        int sumNum = 0;
        while (s.hasNext()) {
            sumNum += s.nextInt();
        }
        return sumNum;
    }

    public static double mean() throws FileNotFoundException{
        s = new Scanner(f);
        int sumNum = 0;
        double totalNum = 0.0;
        while (s.hasNext()) {
            sumNum += s.nextInt();
            totalNum++;
        }
        return (sumNum / totalNum);
    }

    public static int modeNum() throws FileNotFoundException{
        s = new Scanner(f);
        int most = 0;
        int mostCount = 0;
        for(int current=0; current<1000; current++){
            int currentCount = 0;
            while (s.hasNext()) {
                if(s.nextInt() == current){
                    currentCount++;
                }
            }
            if(currentCount > mostCount){
                most = current;
                mostCount = currentCount;
            }
        }
        return (most);
    }
}
