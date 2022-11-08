
// /*

//      j  1  2  3  4  5
//   i 1   *
//     2   *  *
//     3   *  *  *
//     4   *  *  *  *
//     5   *  *  *  *  *


//  */




// public class StarPatterns {
    

//     public static void main(String[] args) {
        

//         for(int i=1;i<=7;i++)
//         {
//             for(int j=1;j<=7;j++)
//             {
//                 if(i>=j)
//                 {
//                     System.out.print("* ");
//                 }
//                 else
//                 {
//                     System.out.print("  ");
//                 }
//             }

//             System.out.println();
//         }
//     }
// }





// /*

//      j  1  2  3  4  5
//   i 1   *  *  *  *  *
//     2      *  *  *  *
//     3         *  *  *
//     4            *  *
//     5               *


//  */



// public class StarPatterns {
    

//     public static void main(String[] args) {
        

//         for(int i=1;i<=7;i++)
//         {
//             for(int j=1;j<=7;j++)
//             {
//                 if(j>=i)
//                 {
//                     System.out.print("* ");
//                 }
//                 else
//                 {
//                     System.out.print("  ");
//                 }
//             }

//             System.out.println();
//         }
//     }
// }









//3.  


// /*

//      j  1  2  3  4  5
//   i 1   *  *  *  *  *
//     2   *  *  *  *
//     3   *  *  *
//     4   *  *
//     5   *


//  */



// public class StarPatterns {
    

//     public static void main(String[] args) {
        

//         for(int i=1;i<=7;i++)
//         {
//             for(int j=1;j<7-i+1;j++)
//             {
                
//                 System.out.print("* ");

//             }

//             System.out.println();
//         }
//     }
// }




// /*

//      j  1  2  3  4  5
//   i 1               *
//     2            *  *
//     3         *  *  *
//     4      *  *  *  *
//     5   *  *  *  *  *


//  */






// public class StarPatterns {
    

//     public static void main(String[] args) {
        

//         for(int i=1;i<=7;i++)
//         {
//             for(int j=1;j<=7;j++)
//             {
//                 if(i+j>7)
//                 {
//                     System.out.print("* ");
//                 }
//                 else
//                 {
//                     System.out.print("  ");
//                 }
//             }

//             System.out.println();
//         }
//     }
// }






/*
        
                    *
                 *  *  *
              *  *  *  *  *
           *  *  *  *  *  *  *
        *  *  *  *  *  *  *  *  *        


 */



public class StarPatterns {
    

    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++)
        {
            
            for(int j=1;j<=5;j++)
            {
                if(i+j>5)
                {
                    System.out.print("* ");
                }

                else
                {
                    System.out.print("  ");
                }

            }

            // System.out.println();
            for(int k=2 ;k<=5;k++)
            {
                if(k<=i)
                {
                   System.out.print("* "); 
                }
                else
                {
                    System.out.print("  ");
                }

            }

            System.out.println();
        }
    }
}





