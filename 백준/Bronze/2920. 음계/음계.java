import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for(int i = 0 ; i<8; i++)
            arr[i]=sc.nextInt();
        int a=0;
        for(int k = 0 ; k<8; k++){
            if(arr[k]!=k+1){
                a=0;
                break;
            }
            a=1;
        }
        if(a==1){
            System.out.println("ascending");
            System.exit(0);
        }
        for(int j = 0 ; j<8; j++){
            if(arr[j]!=8-j){
                a=0;
                break;
            }
            a=2;
        }
        if(a==2){
            System.out.println("descending");
            System.exit(0);
        }
        
            System.out.println("mixed");
   
       
    }
}