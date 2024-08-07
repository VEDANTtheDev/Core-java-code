public class Recursion2 {
    static int cnt = 0;
    public static void main(String[] args) {
        int n = 3;
        hanoiTower(n,"S","H","D");
        System.out.println(cnt);
    }
    static void hanoiTower(int n,String src,String helper,String dest){
        if (n==1){
            System.out.println("Move disk " + n + " from " + src + " to " + dest);
            cnt++;
            return;
        }
        hanoiTower(n-1,src,dest,helper);
        System.out.println("Move disk " + n + " from " + src + " to " + dest );
        cnt++;
        hanoiTower(n-1,helper,src,dest);
    }
}