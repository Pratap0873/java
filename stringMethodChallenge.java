public class stringMethodChallenge {
    

    public static void main(String[] args) {
        
        String str="programmer@gmail.com";

        //  check email id is on gmail

        boolean a=str.contains("gmail");

        if(a==true)
        {
            System.out.println("Email id is on gmail");
        }
        else
        {
            System.out.println("Email id is not on gmail");
        }


        //  username and domain name 

        int index=str.indexOf("@");

     
        System.out.println("Username is : "+ str.substring(0, index));

        System.out.println("Domain name is : "+ str.substring(index+1));

    }
}
