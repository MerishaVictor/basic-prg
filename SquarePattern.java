public class SquarePattern {
    public static void main(String[] args) {
        System.out.println("merisha code here");
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if((i==2 && j==2) || (i==3 && j==3) || (i==2 && j==3) || (i==3 && j==2))
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
