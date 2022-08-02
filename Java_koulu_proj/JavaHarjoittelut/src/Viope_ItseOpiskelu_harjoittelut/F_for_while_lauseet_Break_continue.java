package Viope_ItseOpiskelu_harjoittelut;

/**
 *
 * @author vadimzubchenko
 */
public class F_for_while_lauseet_Break_continue {
    public static void main(String[] args){
       
    int i, yla_raja = 25;
            System.out.println("------break toiminta----------");
           for(i=1; i<=10; i++)
           {
              if(i<=yla_raja)
                  System.out.println(i);
              else
                 break;
           }
           /*
           * contunue toiminnon esim. Vain parilliset luvut esille.
           */
           System.out.println("------vain parilliset! -contunue- toiminta----------");
           
           int jako_jaannos;
           for(i = 1; i < 11; i++)
         {
            jako_jaannos = i % 2;
     
            if(jako_jaannos != 0)
            {
                continue;
            }
            else
            {
                System.out.println(i);
            } 
         }
           System.out.println("------while silmukan toiminta----------");
           i = 1;
           while( i <= 10)
         {
             System.out.println(i);
              i++;
         }
    }
}
