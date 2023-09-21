package methods;

/**
 * Params
 */
public class Params {

    int addNums(int x, int y) {
        return x+y;
    }
    int addNums(int x, int y, int z) {
        return x+y+z;
    }
    int addNums(int... nums) {
        int res=0;
        for (int x; nums) {
            res += x;
        }
        return res;
    }
    float addNums (float x, float y) {
        return x+y;
    }

    public static void main(String[] args) {
        Params p = new Params();
        System.out.println(p.addNums(10, 44));
        System.out.println(p.addNums(10, 20, 30));
        System.out.println(p.addNums(5, 10, 15, 20));
        System.out.println(p.addNums(3.5f, 2.5f));
    }
}