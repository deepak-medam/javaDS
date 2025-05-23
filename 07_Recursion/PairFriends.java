public class PairFriends {

    public static int pairFriends(int n){
        if(n == 1 || n == 2){
            return n;
        }
        // can remain single
        int singleWays =  pairFriends(n-1);
        
        // can get paired
        int pairedWays =  (n-1) * pairFriends(n-2);

        int totalWays = singleWays + pairedWays;

        return totalWays;
    }

    public static void main(String args[]){
        System.out.println(pairFriends(3));
    }
    
}
