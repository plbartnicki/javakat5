package klb.binaryfinder;

/**
 * Created by klb on 18.03.18.
 */
public class Main {

    //wiemy że T jest posortowana niemalejąco
    //np. T=3, 3.2, 4, 4, 5.3, 9, 11.2, 12
    //      i             s              j
    private static boolean find(double x, double []T) {
		//new feature
        int i = 0;
		int j=T.length - 1;


        while(i<=j) {
            int s = (i+j)/2;
            if(T[s] == x) {
                return true;
            }

            if(x < T[s]) {
                //trzeba szukac x w lewej czesci
                j = s - 1;
            } else {
                i = s + 1;
            }
        }

        return false;
    } //O(logn)

    public static void main(String[] args) {
        double []test1 = {3, 3.2, 4, 4, 5.3, 9, 11.2, 12};
        System.out.println(find(11.2, test1));
    }
}
