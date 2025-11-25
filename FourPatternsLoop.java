//import java.util.Scanner;
//
//public class FourPatternsLoop{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//      
//        
//    }
//}

//import java.util.Scanner;
//
//public class FourPatternsLoop{
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//       
//    }
//}


public class FourPatternsLoop{
    public static void main(String[] args){
        for(int row = 1;row<=6;row++){
            for(int column=1; column<=row;column++){
                
            System.out.printf("%d ", column);
            }
            System.out.println();
        }

        for(int row = 6;row>=1;row--){
            for(int column=1; column<=row;column++){
                
            System.out.printf("%d ", column);
            }
            System.out.println();
        }
//        
        for(int row = 1;row<=6;row++){
            for(int column=row; column<6;column++){
                
//            System.out.printf("%d ", column);
            System.out.print("  ");
            }
            for(int ran = 1; ran <= row; ran++){
            System.out.printf(" %d", ran);
            }
            System.out.println();
        }


        for(int row = 6;row>=1;row--){
            for(int column=row; column<6;column++){
                
//            System.out.printf("%d ", column);
            System.out.print(" ");
            }
            for(int ran = 1; ran <= row; ran++){
            System.out.printf("%d", ran);
            }
            System.out.println();
        }

      
        
    }
}
