package Exercise1;

import java.util.Scanner;
public class numberUpDown {
    public int num;
    public numberUpDown(int num){
        this.num = num;
    }
    public numberUpDown(){

    }
    public void logic(){
        
        for (int i=1;i<=num;i=i+2){
            if (i<10){
                System.out.print("0"+i+ " ");
            }else if(i>=10){
                System.out.print(i);
            }
           
        }
        // -->space between two loop
        for (int i=num; i>0;i=i-2){
            if (i<10){
                System.out.print("0"+i+ " ");
            }else if(i>=10){
                System.out.print(i+ " ");
            }
        }
    }
    public void positiveNumber(){
        Scanner sc = new Scanner(System.in);

        //******input num******

        System.out.print("Input Positive number: ");
        num= sc.nextInt();

            if(num>0){
                System.out.println("Youre are a positive number!!");
                logic();
    
            }else if (num<0){

                positiveNumber();
            }else{
                System.out.println("Input only positive number: ");
                
            }
        
        

    }
  
}
