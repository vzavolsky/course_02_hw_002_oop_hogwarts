import java.util.Random;

public class RandomValue extends Random{
    public int nextInt() {
        return super.nextInt(100);
    }
}
