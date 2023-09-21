package loops;

/**
 * SimpleArray
 */
public class SimpleArray {

    public static void main(String[] args) {
        //integer array
        int nums[] = new int [] { 1,2,3,4,5};
        System.out.println(nums.length);

        int x[] = new int[5];// without initialization
        x[0]=1;
        x[1]=2;
        x[2]=3;
        x[3]=4;
        x[4]=5;
        System.out.println(x.length);
        //access values of array
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);
        //System.out.println(x[5]); invalid index
        System.out.println(Arrays.toString(x));

        //String Arrays
        String[] names = {"Alex", "John" , "Bill"};
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);



    }
}