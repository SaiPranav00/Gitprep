public class pattern9 {
       public static void main(String[] args) {
       for(int i=1;i<=9;i=i+2)
        {
            for(int k=1;k<=i;k=k+2)
            {
                System.out.print(" ");
            }
            for(int j=9;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}