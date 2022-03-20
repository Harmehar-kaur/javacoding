/*one data type is converting into other, bigger size types can't be converted into 
smaller size types,*/
public class tycasting {
    public static void main(String args[]) {
        char ch = 'a';
        int i = ch;
        System.out.println(i);
        ch = (char) i;
        /*
         * explicit data loss is there since a larger value is being stored ina smaller
         * size data
         * type
         */
        System.out.println(ch);
        ch = (char) (ch + 1);
        System.out.println(ch);
        short s = 17;
        int k = s;
        System.out.println(k);
        s = (short) k;
        System.out.println(s);
        s = (short) (k + 1);
        System.out.println(s);
        int m = (int) 10.6;// all deciamls are double by default
        System.out.println(m);
        float f = (float) 1.7;
        System.out.println(f);
        System.out.println(4 + 4);
        System.out.println(4 + 4.5);
        System.out.println(4.1 + 4.4);
        System.out.println((double) 2 / 5);// double states 2 is double
        System.out.println(2.0 / 5);// other way to write the above statement  
        System.out.println("Harmehar Kaur");
    }

}
