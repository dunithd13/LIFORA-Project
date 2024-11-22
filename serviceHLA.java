import java.util.Scanner;
public class serviceHLA{
    public static void main(String []args){
        Scanner inputData= new Scanner(System.in);

        //Declaring 6 Arrays for storing 2 values related to 3 HLA types of donor and recepient 
        int dHLAa[]= new int[2];
        int dHLAb[]= new int[2];
        int dHLAdr[]= new int[2];

        int rHLAa[]= new int[2];
        int rHLAb[]= new int[2];
        int rHLAdr[]= new int[2];


        //Storing HLA values of donor
        for(int i=0; i<2;i++){
            System.out.print("Donor's HLA-A value "+(i+1)+": " );
            dHLAa[i]= inputData.nextInt();
            }
        System.out.println();

        for(int i=0; i<2;i++){
            System.out.print("Donor's HLA-B value "+(i+1)+": " );
            dHLAb[i]= inputData.nextInt();
        }
        System.out.println();

        for(int i=0; i<2;i++){
            System.out.print("Donor's HLA-DR value "+(i+1) +": ");
            dHLAdr[i]= inputData.nextInt();
            }
        System.out.println();

        //Storing HLA values of Recepient
        for(int i=0; i<2;i++){
            System.out.print("Recipient's HLA-A value "+(i+1)+": " );
            rHLAa[i]= inputData.nextInt();
            }
        
        System.out.println();

        for(int i=0; i<2;i++){
            System.out.print("Recipient's HLA-B value "+(i+1)+": " );
            rHLAb[i]= inputData.nextInt();
            }
        System.out.println();


        
        for(int i=0; i<2;i++){
            System.out.print("Recipient's HLA-DR value "+(i+1)+": " );
            rHLAdr[i]= inputData.nextInt();
            }
        System.out.println();

        int match=0;   //variable to store number of matchings

        //Comparing values of HLA-A from donor and recepient
        for(int i=0; i<2;i++){
            if(dHLAa[i]==rHLAa[i]){
                match=match+1;
            }
        }
        //Comparing values of HLA-B from donor and recepient
        for(int i=0; i<2;i++){
            if(dHLAb[i]==rHLAb[i]){
                match=match+1;
            }
        }
        //Comparing values of HLA-DR from donor and recepient
        for(int i=0; i<2;i++){
            if(dHLAdr[i]==rHLAdr[i]){
                match=match+1;
            }
        }

        System.out.println("Number of Matches is :"+ match);

        if(match==6){
            System.out.println("Perfect Scenario for Organ Transplantation.");
        }
        else if(match>=4){
            System.out.println("Organ Transplantation can be done but with a risk.");
        }
        else{
            System.out.println("Zero Chance for Organ Transplantation.");
        }


}

}