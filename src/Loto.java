import java.util.Random;

public class Loto {
    public static int[] main(String[] args) {


    Random random = new Random();
    int count = 6;


    int[] lotonumber = new int[count];
        for (int i = 0; i < count; i++) {
            lotonumber[i] = random.nextInt(46) + 1;

        }
        return lotonumber;

}
}