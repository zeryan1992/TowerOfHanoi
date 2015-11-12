/**
 * Created by imac on 11/12/15.
 */
public class TowersOfHanoi {
    public static void towerOfHanoi(int n, char towerA, char towerC,char towerB)
    {
        if (n==0)return;
        towerOfHanoi(n-1,towerA,towerB,towerC);
        System.out.println("number of disks moved: "+n+" from "+towerA+ " to "+towerC+" using "+towerB);
        towerOfHanoi(n-1,towerB,towerA,towerC);
    }
    public static void main(String[] args)
    {
        towerOfHanoi(2,'A','C','B');
    }
}
