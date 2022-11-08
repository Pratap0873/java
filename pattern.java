// public class pattern {
    

//     public static void main(String[] args) {
        
//         for(int i=1;i<=5;i++)
//         {
            
//             for(int j=1;j<=5;j++)
//             {
//                 System.out.print(j+" ");
                

//             }

//             System.out.println();
//         }
//     }
// }




// public class pattern {
    

//     public static void main(String[] args) {
        
//         for(int i=1;i<=5;i++)
//         {
            
//             for(int j=1;j<=5;j++)
//             {
//                 System.out.print(i+" ");
                

//             }

//             System.out.println();
//         }
//     }
// }




// public class pattern {
    

//     public static void main(String[] args) {
        
//         for(int i=1;i<=5;i++)
//         {
            
//             for(int j=1;j<=5;j++)
//             {
//                 System.out.print(i+j+" ");
                

//             }

//             System.out.println();
//         }
//     }
// }



// public class pattern {
    

//     public static void main(String[] args) {
        
//         int c=1;
//         for(int i=1;i<=5;i++)
//         {
            
//             for(int j=1;j<=5;j++)
//             {
//                 System.out.printf("%2d ",c);
//                 c++;

//             }

//             System.out.println();
//         }
//     }
// }




// public class pattern {
    

//     public static void main(String[] args) {
        
//         for(int i=1;i<=5;i++)
//         {
            
//             for(int j=1;j<=5;j++)
//             {

//                 if(i>=j)
//                 {
//                     System.out.print(j+" ");
//                 }
                

//             }

//             System.out.println();
//         }
//     }
// }




// public class pattern {
    

//     public static void main(String[] args) {
        
//         int c=1;
//         for(int i=1;i<=5;i++)
//         {
            
//             for(int j=1;j<=5;j++)
//             {
//                 if(i>=j)
//                 {
//                     System.out.printf("%02d ",c);
//                     c++;
//                 }
                

//             }

//             System.out.println();
//         }
//     }
// }



// public class pattern {
    

//     public static void main(String[] args) {
        
//         for(int i=1;i<=5;i++)
//         {
            
//             for(int j=1;j<=5-i+1;j++)
//             {
//                 System.out.print(j+" ");
                

//             }

//             System.out.println();
//         }
//     }
// }



// public class pattern {
    

//     public static void main(String[] args) {
        
//         for(int i=1;i<=5;i++)
//         {
            
//             for(int j=1;j<=5;j++)
//             {
//                 if(j>=i)
//                 {
//                     System.out.print(j+" ");
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








// public class pattern {
    

//     public static void main(String[] args) {
        
//         for(int i=1;i<=5;i++)
//         {
            
//             for(int j=1;j<=5;j++)
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


//////////////////////IMP

// public class pattern {
    

//     public static void main(String[] args) {
        
//         for(int i=1;i<=5;i++)
//         {
            
//             for(int j=1;j<=5;j++)
//             {
//                 if(i+j>5)
//                 {
//                     System.out.print("* ");
//                 }

//                 else
//                 {
//                     System.out.print("  "); ///   double space
//                 }

//             }

//             System.out.println();
//         }
//     }
// }





public class pattern {
    

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





