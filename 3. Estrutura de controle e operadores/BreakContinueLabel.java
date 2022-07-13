public class BreakContinueLabel {
   public static void main(String args[]) {
      first:
         for (int i = 0; i <= 5; i++) {
           System.out.println("Line: i = " + i);
           for(int j = 0; j <= 2; j++){
              if(j == 0){
                 continue; //interno não passa nenhum j=0
               }
               if(i == 1){
                  System.out.println("Skip line: i = " + i);
                  continue first;
               }
               System.out.println("i: " + i + " j:" + j);
            }
         }

         System.out.println("Second");
    
         second:
            for (int i = 0; i <= 5; i++) {
                  if(i == 4){
                     break second;
                  }    
                  System.out.println("i: " + i);
            }
    }

}
