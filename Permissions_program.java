//Murooj Al-zahrani





package Permissions_program;


import java.util.Random;//import to make the Random class available to my program
import java.util.Scanner;//import to make the Scanner class available to my program
import java.util.Date;//import to make the Date class available to my program

public class Permissions_program {
    

    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);//to creates an object of the class Scanner and names it input

       int Year ;//A variable declaration in which the Year of  Visa Expiration  entered by the user is stored
       int permit;//A variable declaration in which the required permit number (Hajj  or Umrah Permission) entered by the user is stored
       int nationality = 0 ;//A variable declaration in which the nationality number entered by the user is stored
       int [] [] wheelchairs = new int [2][4];
       int premissionID = 0,premissionVisa = 0, premissionId=0, passport=0;
       int period = 0, day = 0;
       String id = null ,visa = null;
       String ID = null,Visa = null; 
       String [] Time = new String [8];//declare and create the array (This matrix represents the The time periods allotted for performing Umrah )
       String [] Day  =new String[8];
       String information = null;
       Day [1]="Saturday";Day [2]="Sunday";Day [3]="Monday";Day [4]="Tuesday";Day [5]="Wednesday";Day [6]="Thursday";Day [7]="Friday" ;
       Random premission_ID = new Random() ;
       Random premission_Visa = new Random() ;
       Date date=new Date();//to creates an object of the class Date and names it date (This object prints the date and time of booking the appointment

       //-------------------------------------------------------------------------------------------------------
       //*HomePage
       System.out.println("**=**=**=**=**=**=**=**=**=**=**=**=**=**=**=**=**=**=**=**=**=**");
       System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
       System.out.println("----------------------+Permissions program+----------------------");
       System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
       System.out.println("**=**=**=**=**=**=**=**=**=**=**=**=**=**=**=**=**=**=**=**=**=**=");
       System.out.println("\n");
       System.out.println("*=*=-----------------------------------------------------------------------------------------");
       System.out.println("Program objective                |  providing permissions for for doing either hajj or umrah");
       System.out.println("service beneficiaries            |  Citizens and residents");
       System.out.println("service provider                 |  General Administration of Domestic Pilgrims");
       System.out.println("Is there a fee for the service?  |  yes");
       System.out.println("*=*=-----------------------------------------------------------------------------------------");
       System.out.println("\n");
       //*personal information
       System.out.println("First name ");
       String name1 = input.next();
       System.out.println("Last name ");
       String name2 = input.next();
       String Name =name1+" "+name2; 
       System.out.println("[o[o[o[o[o*=*=*=*=*=[o[o[o[o[o*=*=*=*=*=[o[o[o[o[o*=*=*=*=*=[o[o[o[o[o*=*=*=*=*=");
       //print a welcome message with the addition of the first and last name entered by the user
       System.out.println("                        Welcome " + Name +"\n We are happy for you and wish you to perform easy religious duties\n                        in the sanctuary of Makkah");
       System.out.println("[o[o[o[o[o*=*=*=*=*=[o[o[o[o[o*=*=*=*=*=[o[o[o[o[o*=*=*=*=*=[o[o[o[o[o*=*=*=*=*=");
       System.out.println("\n");
       String num = num();//A method call that requests the user to enter his mobile number
      
       
        System.out.println("\n");
        System.out.println("----------------------------------Booking page----------------------------------");
        System.out.println("[o[o[o[o[o*=*=*=*=*=[o[o[o[o[o*=*=*=*=*=[o[o[o[o[o*=*=*=*=*=[o[o[o[o[o*=*=*=*=*=");
        System.out.println("Dear, choose the service you want to book. and obtain a permit for it");
        System.out.println("[o[o[o[o[o*=*=*=*=*=[o[o[o[o[o*=*=*=*=*=[o[o[o[o[o*=*=*=*=*=[o[o[o[o[o*=*=*=*=*=");
        System.out.println("\n");
        System.out.println("1-Hajj Permission\n2- Umrah Permission");
        System.out.println("Enter the required permit number");
        permit = input.nextInt();
        
        while(permit>2|permit<1){//The loop is executed if the user entered an incorrect number
        System.out.println("\n");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~X~X~X~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The number you entered is not registered in the system \n please enter the reservation number again");          
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~X~X~X~~~~~~~~~~~~~~~~~~~~~~~~~~~");   
        System.out.println("\n");
        System.out.println("--------------------Booking page--------------------");
        System.out.println("****************************************************");
        System.out.println("Dear, choose the service you want to book. and obtain a permit for it");
        System.out.println("****************************************************");
        System.out.println("1-Hajj Permission\n2- Umrah Permission");
        System.out.println("Enter the required permit number");
        permit = input.nextInt();}//end while

       if(permit==1){//If the user enters the number 1, the program transfers him to the Hajj part
                System.out.println("what is your nationality?");
                System.out.println("1-Saudi\n2- not Saudi");
                System.out.println("Enter the number corresponding to your nationality");
                nationality = input.nextInt();
                if (nationality>2|nationality<1){//The loop is executed if the user entered an incorrect number
                    
                while (nationality>2|nationality<1){
                System.out.println("The nationality number entered is incorrect, please enter again");  
                System.out.println("what is your nationality?");
                System.out.println("1-Saudi\n2- Non-Saudi");
                System.out.println("Enter the number corresponding to your nationality");
                nationality = input.nextInt();}}//end while and end if block
                
                //After the user enters his nationality, he is transferred to the part of the tasks related to his nationality
                switch(nationality){
                case 1: // If the user is Saudi
                ID=ID();//Call to a method that requests the user to enter  ID, storing the value generated from the method in a variable(ID)
                id= ID.substring(2, 8);//Cut out part of the ID number to use it on Permission number
                premissionID =premission_ID .nextInt(50);//Choose a random number from zero to 49 to complete Permission number
                break;
                case 2://If the user is Non-Saudi
                Visa= Visa();//Call to a method that requests the user to enter  Visa , storing the value generated from the method in a variable(Visa)
                visa =Visa.substring(2, 8);//Cut out part of the ID number to use it on Permission number
                premissionVisa =premission_Visa.nextInt(50);//Choose a random number from zero to 49 to complete Permission number
                System.out.println("Enter the Visa Expiry Date (Year of Expiration) (It must be 4 number long)");
                Year = input.nextInt();
                IsVisaValid(Year);//Call the method that tests the visa expiry number entered by the user
                break;  }//end switch    
       }//end if block
                                
        else if(permit==2){ //If the user enters the number 1, the program transfers him to the Umrah part  
                    System.out.println("what is your nationality?");
                    System.out.println("1-Saudi\n2- Non-Saudi");
                    System.out.println("Enter the number corresponding to your nationality");
                     nationality = input.nextInt();
                    if (nationality>2|nationality<1){//The loop is executed if the user entered an incorrect number
                    while (nationality>2|nationality<1){
                     System.out.println("The nationality number entered is incorrect, please enter again");  
                     System.out.println("what is your nationality?");
                     System.out.println("1-Saudi\n2- not Saudi");
                     System.out.println("Enter the number corresponding to your nationality");
                     nationality = input.nextInt();}} //end while and end if block 
                     //After the user enters his nationality, he is transferred to the part of the tasks related to his nationality
                    switch(nationality){
                     case 1://If the user is Saudi 
                     ID=ID();//Call to a method that requests the user to enter  ID, storing the value generated from the method in a variable(ID)
                     id= ID.substring(2, 8);//Cut out part of the ID number to use it on Permission number
                     premissionID =premission_ID .nextInt(50);//Choose a random number from zero to 49 to complete Permission number
                     break;
                     case 2://If the user is Non-Saudi
                     System.out.println("Enter the passport number or Iqama number ");
                     passport = input.nextInt();
                     premissionID =premission_ID .nextInt(500);//Choose a random number from zero to 499 to use it on Permission number
                     premissionId= premissionID+ premissionID+ premissionID +premissionID;//I used this method to create a Permission number for non-Saudis who perform Umrah
                     break;}//end switch
                    //---------------------------------------------------------------------------------
                    //This part is specific to determining the day and time of performing Umrah
                    System.out.println("What day do you want to perform Umrah?");
                    System.out.println("1-Saturday\n2-Sunday\n3-Monday\n4-Tuesday\n5-Wednesday\n6-Thursday\n7-Friday");
                    System.out.println("Enter the number preceding the day you want to book");
                    day = input.nextInt();
                    System.out.println("\n");
                    while( day>8| day<1){//The loop is executed if the user entered an incorrect number
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~X~X~X~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("The number of the day you entered is incorrect\n  please enter the number again");          
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~X~X~X~~~~~~~~~~~~~~~~~~~~~~~~~~~");     
                    System.out.println("What day do you want to perform Umrah?");
                    System.out.println("1-Saturday\n2-Sunday\n3-Monday\n4-Tuesday\n5-Wednesday\n6-Thursday\n7-Friday");
                    System.out.println("Enter the number preceding the day you want to book");
                    day = input.nextInt();
                    System.out.println("\n");}//end while
                    
                    System.out.println("What time do you want to perform Umrah?");
                    Time[0]="period 1: |12:00AM--3:00AM|";
                    Time[1]="period 2: |3:00AM--6:00AM |";
                    Time[2]="period 3: |6:00AM--9:00AM |";
                    Time[3]="period 4: |9:00AM--12:00PM|";
                    Time[4]="period 5: |12:00PM--3:00PM|";
                    Time[5]="period 6: |3:00PM--6:00PM |";
                    Time[6]="period 7: |6:00PM--9:00PM |";
                    Time[7]="period 8: |9:00PM--12:00AM|";
                    //to Print the matrix of time periods  
                    for (int i =  0 ; i< Time.length;i++){//open for loop 
                        System.out.println(Time[i]);
                        System.out.println("           ________________")   ;}//end for loop 
 
                    System.out.println("Enter the number of the period in which you want to book");
                    period =  input.nextInt();
                    System.out.println("\n");
                    
                    if ( period<1| period>8){//The loop is executed if the user entered an incorrect number
                    System.out.println("The period number entered is incorrect, please enter again");
                    while( period<1| period>8){//The loop is executed if the user entered an incorrect number
                        for (int i =  0 ; i< Time.length;i++){
                        System.out.println(Time[i]);
                        System.out.println("           ________________")   ;}//end for loop
                        System.out.println("Enter the number of the period in which you want to book");
                        period =  input.nextInt();
                        System.out.println("\n");}}//end while loop and if block

                    System.out.println("Do you need a wheelchair?");
                    System.out.println("1-yse\n2-No ");
                    int wheelchair =  input.nextInt();
                    if(wheelchair == 1 ){//If the user enters number 1, that is, he wants wheelchair, then the program will transfer him to information about reserving wheelchair
                       wheelchairs =Needwheelchair();//Call to a method to information about reserving wheelchair, storing the value generated from the method in a variable(wheelchairs)
                        if      ( wheelchairs[0][2]==1){ information = "Wheelchair type: Manual ,Number of seats:One seat, Where to use:Tawaf";}
                        else if ( wheelchairs[0][2]==2){  information = "Wheelchair type: Manual ,Number of seats:One seat, Where to use:Sai";}
                        else if ( wheelchairs[0][2]==3){  information = "Wheelchair type: Manual ,Number of seats:One seat, Where to use:Tawaf and Sai";}
   
                        if      ( wheelchairs[1][1] == 1& wheelchairs[1][2]==1){ information = "Wheelchair type: Electric ,Number of seats:One seat, Where to use:Tawaf";} 
                        else if (wheelchairs[1][1] == 1& wheelchairs[1][2]==2){ information ="Wheelchair type: Electric ,Number of seats:One seat, Where to use:Sai";}
                        else if ( wheelchairs[1][1] == 1& wheelchairs[1][2]==3){ information ="Wheelchair type: Electric ,Number of seats:One seat, Where to use:Tawaf and Sai";}
        
                       else if ( wheelchairs[1][1] == 2& wheelchairs[1][2]==1){ information ="Wheelchair type: Electric ,Number of seats:Tow seat, Where to use:Tawaf";} 
                       else if ( wheelchairs[1][1] == 2& wheelchairs[1][2]==2){ information ="Wheelchair type: Electric ,Number of seats:Tow seat, Where to use:Sai";}
                       else if (wheelchairs[1][1] == 2& wheelchairs[1][2]==3){ information ="Wheelchair type: Electric ,Number of seats:Tow seat, Where to use:Tawaf and Sai";}
                    }//end if 
                    
                    if(wheelchair>2|wheelchair<1){//The loop is executed if the user entered an incorrect number
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~X~X~X~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("The entered number is incorrect\n  please enter the number again");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~X~X~X~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("Do you need a wheelchair?");
                    System.out.println("1-yse\n2-No ");
                    wheelchair =  input.nextInt();
                    if(wheelchair == 1 ){ wheelchairs =Needwheelchair();}//end if 
                    }//end if(wheelchair>2|wheelchair<1)
        }//end else if(permit==2)
       
      //------------------------------------ 
      //This particular part To print the permission
       System.out.println("\n");
       System.out.println("*#*#*#*#*#*#*#-------------------------------------------------");
       System.out.println("********--------------p-r-e-m-i-s-s-i-o-n--------------********");
       System.out.println("-------------------------------------------------*#*#*#*#*#*#*#");
       System.out.println("Name                          : "         +Name);
       System.out.println("mobile number                 : "         +num );
       System.out.println("The date of booking the permit: "         + date );
       System.out.println("----------------------------------------------------------------");
       if(permit==1){//If the user requests a permission to perform the Hajj, the program will print what is inside this block
            if(nationality ==1) {//Information about the Saudis
                System.out.println("Prmission Number       : "        +(id+premissionID ) );  
                System.out.println("Nationality            : "        +"Saudi"  );
                System.out.println("national ID            :"         +  ID  );
                }//end if block (nationality ==1)
            else if (nationality ==2){//Information about the Non-Saudis
                System.out.println("Prmission Number       : "        +(visa+premissionVisa) );  
                System.out.println("Nationality            : "        +"Non-Saudi");
                System.out.println("national ID            :"         + Visa  );  
                }//end else if block (nationality ==2)
       System.out.println("Type of the permission : "        +"Hajj Permission" );
       }//end if block(permit==1)
       
    //--------------------------------------   
       else if(permit==2)
       {//If the user requests a permission to perform the Umrah, the program will print what is inside this block
           if(nationality ==1) {//Information about the Saudis
               System.out.println("Prmission Number       : "        +(id+premissionID ));  
               System.out.println("Nationality            : "        +"Saudi");
               System.out.println("national ID            :"         +ID  );
               }//end if block (nationality ==1)
            else if (nationality ==2){//Information about the Non-Saudis
               System.out.println("Prmission Number       : "        +premissionId  );  
               System.out.println("Nationality            : "        +"Non-Saudi"  );
               System.out.println("national ID            :"         + passport  );  
               }//end if block (nationality ==2)
       System.out.println("Type of the permission : "        +"Umrah Permission" );                  
      
       if (wheelchairs[0][3]!=0){
           System.out.println("---------------------------------------------------------------");
           System.out.println("Information about the wheelchair you have reserved :");
           System.out.println(information);
           System.out.println("The total amount       : "        + wheelchairs[0][3] +"SR");}
       else {
           System.out.println("---------------------------------------------------------------");
           System.out.println("Information about the wheelchair you have reserved :");
           System.out.println(information);
           System.out.println("The total amount       : "        +wheelchairs[1][3]+"SR");}  
           System.out.println("---------------------------------------------------------------");
           System.out.println("You are permitted to enter the Great Mosque of Mecca " );
           System.out.println("Per day :"                   + Day[day]);
           System.out.println("time (from - to)"            +Time[period-1]);
       }//end if block(permit==2)
     
       System.out.println("*#*#*#*#*#*#*#-------------------------------------------------");
       System.out.println("********-----------------------------------------------********");
       System.out.println("-------------------------------------------------*#*#*#*#*#*#*#");
      
       
   
    }//end main block
        
    
        
  //----------------------------------------------------------------------------------------------------------  
        
  //Method 1 : IsVisaValid 
  //This method tests the  date of expiration of the visa entered by the user
public static Boolean  IsVisaValid(int visa){
    Boolean year = null ;
    if (visa>2023|visa==2023){//open if block
    year=true;
        System.out.println(" visa is valid");
    }//end if block
    else if  (visa<2022|visa==2022){//open else if block
    year=false;
     System.out.println(" visa is invalid");
     System.out.println("Please renew the visa if you want to perform Hajj");
     System.out.println("Thank you for trying, we are waiting for you to register again after renewing the visa");
     System.exit(0);//The user exits the entire program
    }//end else if block

        return year;}//end method IsVisaValid

//Method 2 : Needwheelchair()
//This method shows wheelchair information (type - number of  seats - place of use - prices) according to the user's request
    public static int[][] Needwheelchair() {
          Scanner input = new Scanner(System.in);//to creates an object of the class Scanner and names it input
          int [] [] wheelchair =new int [2][4];//declare and create the 2D arrayIt consists of two rows and four columns
          int A,B,C;//A variable declaration in which (A to type) and (B to seats) and (C to place of use) and (D to prices )
         System.out.println("The type of wheelchair you want ?");
         System.out.println("1-manual\n2-electric");
         System.out.println("Enter the number of the type you want");
         A = input.nextInt();
         if(A>2|A<1) { A=type(A);}//is executed if the user entered an incorrect number .The requested method is called to allow the user to enter the number again
          //Here the array values are stored according to what the user entered of the type he wants
           wheelchair[0][0] = A-1;
           wheelchair[1][0] = A-1;
          //In the event that the user requests a Manual wheelchair, the number of seats will always be one, so the value 1 is stored
           wheelchair[0][1] = 1;
                
         if (A==2){//In the event that the user requests an Electric wheelchair, the number of seats will  be 1 or 2
             //So we will ask the user how many seats they want
         System.out.println("The number of seats you want ?");
         System.out.println("1-one\n2-two");
         System.out.println("Enter the number you want");
          B  = input.nextInt();
         if(B>3|B<1) { B= seats(B);}//is executed if the user entered an incorrect number .The requested method is called to allow the user to enter the number again
         wheelchair[1][1] =B;//In the number of seats field, the value entered by the user is stored
         }//end if block

         System.out.println("Where do you want to use the wheelchair?");
         System.out.println("1-tawaf\n2-sai\n3-both(tawaf and sai)");
         System.out.println("Enter the number of use you want");
         C  = input.nextInt();
         if(C>3|C<1) {C= place(C);}//is executed if the user entered an incorrect number .The requested method is called to allow the user to enter the number again
          wheelchair[0][2] =C;//to Store the Place of Use of the wheelchair( Manual) entered by the user
          wheelchair[1][2] =C;//to Store the Place of Use of the wheelchair( Electric) entered by the user
        
        //To store prices according to each case
        if      (wheelchair[0][0] ==0& wheelchair[0][1] == 1& wheelchair[0][2]==1){ wheelchair[0][3]=150;}
        else if (wheelchair[0][0] == 0& wheelchair[0][1] == 1& wheelchair[0][2]==2){ wheelchair[0][3]=100;}
        else if (wheelchair[0][0] == 0& wheelchair[0][1] == 1& wheelchair[0][2]==3){ wheelchair[0][3]=250;}
   
        if      (wheelchair[1][0] == 1& wheelchair[1][1] == 1& wheelchair[1][2]==1){ wheelchair[1][3]=50;} 
        else if (wheelchair[1][0] == 1& wheelchair[1][1] == 1& wheelchair[1][2]==2){ wheelchair[1][3]=50;}
        else if (wheelchair[1][0] == 1& wheelchair[1][1] == 1& wheelchair[1][2]==3){ wheelchair[1][3]=100;}
        
        else if (wheelchair[1][0] == 1& wheelchair[1][1] == 2& wheelchair[1][2]==1){ wheelchair[1][3]=100;} 
        else if (wheelchair[1][0] == 1& wheelchair[1][1] == 2& wheelchair[1][2]==2){ wheelchair[1][3]=100;}
        else if (wheelchair[1][0] == 1& wheelchair[1][1] == 2& wheelchair[1][2]==3){ wheelchair[1][3]=200;}

         
         return wheelchair;}

//-----------------------------------------------------------------------------------------------------------------------
  
  //This method has the function of alerting the user that he entered the wrong type number, and allowing him to enter the number again
  public static int type(int A){
     Scanner input = new Scanner(System.in);
        do{ 
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~X~X~X~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The Type of wheelchair you entered is not available\n please enter the number of the type you want again ");          
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~X~X~X~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The type of wheelchair you want ?");
        System.out.println("1-manual\n2-electric");
        System.out.println("Enter the number of the type you want");
         A = input.nextInt();}
         while(A>2|A<1) ;
       
  return A;
}
 // This method has the function of alerting the user that he entered the wrong seats number, and allowing him to enter the number again
public static int seats (int B){
     Scanner input = new Scanner(System.in);
        do{ 
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~X~X~X~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The Type of wheelchair you entered is not available\n please enter the number of seats  you want again ");          
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~X~X~X~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The number of seats you want ?");
        System.out.println("1-one\n2-two");
        System.out.println("Enter the number you want");
        B= input.nextInt();}
        while(B>2|B<1) ;
       
  return B;
}
//This method has the function of alerting the user that he entered the wrong Place of Use number, and allowing him to enter the number again
public static int place(int C){
     Scanner input = new Scanner(System.in);
        do{ 
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~X~X~X~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("The Type of wheelchair you entered is not available\n please enter the number of use you want again ");          
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~X~X~X~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Where do you want to use the wheelchair?");
        System.out.println("1-tawaf\n2-sai\n3-both(tawaf and sai)");
        System.out.println("Enter the number of use you want");
         C= input.nextInt();}
         while(C>3|C<1) ;
       
  return C;
}
//This method allows to the user enter the  Visa number
public static String Visa(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the visa number (It must be 10 number long)");
    String visa1 = input.nextLine();
    boolean visa= (visa1.matches("[0-9]{10}"));
    if( visa==true) {
    System.out.println("The entered visa number correct");}//end of the  block if
    while(visa==false){
    System.out.println("The entered visa number is incorrect, Please enter your visa again");
    System.out.println("Enter the visa (It must be 10 number long)");
    visa1 = input.nextLine();
    visa= (visa1.matches("[0-9]{10}"));} 
        return visa1;
}
//This method allows to the user enter the ID number
public static String ID(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the ID (It must be 10 number long)");
    String ID = input.nextLine();
    boolean Id= (ID.matches("[0-9]{10}"));
    if( Id==true){
    System.out.println("ID is valid"); }//end of the  block if
    while(Id==false){
    System.out.println(" ID is invalid, Please enter your ID again");
    System.out.println("Enter the ID (It must be 10 number long)");
    ID = input.nextLine();
    Id= (ID.matches("[0-9]{10}"));   }//end while
        return ID;

}

//This method allows the user to enter his mobile number
public static String num(){
       Scanner input = new Scanner(System.in);
       boolean  indexnum;
       String num; 
       System.out.println("Enter the mobile number (start with 05)");
       num= input.nextLine();
       indexnum = (num.matches("[0]{1}[5]{1}[0-9]{8}"));
        if( indexnum==true) 
        {System.out.println(" Number is valid");}
       
        while(indexnum==false){
         System.out.println("\n");
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~X~X~X~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
         System.out.println(" Number is invalid, Please enter your mobile number again");
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~X~X~X~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
         System.out.println("\n");
         System.out.println("Enter the mobile number (start with 05)");
         num= input.nextLine();
         indexnum = (num.matches("[0]{1}[5]{1}[0-9]{8}"));
       }//end of the  block while
        return num;
}


} //end the class block

