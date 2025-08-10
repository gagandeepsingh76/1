import java.util.*;
public class hollowButterfly {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                if (i == 1 || j == 1 || i == r || j == r || (i == r / 2 && j == r / 2)){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            System.out.println(); 
        }
            
            for(int j=1;j<=2*(r-i);j++){
                System.out.print(" ");       
            }
            for(int j=1;j<=i;j++){
                if (i == 1 || j == 1 || i == r || j == r || (i == r / 2 && j == r / 2)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                System.out.println();
            }
            
        }
        for(int i=r;i>=1;i--){
            for(int j=1;j<=i;j++){
                if (i == 1 || j == 1 || i == r || j == r || (i == r / 2 && j == r / 2)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            
            for(int j=1;j<=2*(r-i);j++){
                if (i == 1 || j == 1 || i == r || j == r || (i == r / 2 && j == r / 2)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }      
            }
            for(int j=1;j<=i;j++){
                if (i == 1 || j == 1 || i == r || j == r || (i == r / 2 && j == r / 2)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }

}
