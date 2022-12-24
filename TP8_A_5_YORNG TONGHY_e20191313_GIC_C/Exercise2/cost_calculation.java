package Exercise2;
import java.util.Scanner;
public class cost_calculation {
    private int cost;
    private float result;
    private int age;
    private float discount;
    private int percentDis; //percentage discount
    public cost_calculation(int cost){
        this.cost=cost;
    }
    public cost_calculation(){

    }
     // get cost input 
    public void getInputExample1(){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Input total buying cost: ");
        cost = sc.nextInt();
        if(cost >0 && cost>=50){
            System.out.print("Input age: ");
            age = sc.nextInt();
            System.out.print("\n");
            // System.out.print("Total cost: "+ cost);
            // System.out.println("Discount:   ");
            // System.out.println("Total discount:   ");
        }else if(cost<0){
            System.out.print("Cost must be positive.");
            getInputExample1();
        }

    }
    public void display(){
        System.out.println("\t\tTotal Cost: "+cost+" $");
        System.out.println("\t\tDiscount:   "+percentDis+" %");
        System.out.println("\t\tTotal discount: "+discount+" $");
        System.out.println("\t\t---------------------");
        System.out.println("\t\tTotal payment: "+result+" $");
    }

    //normal condition
    public void condition(){
        getInputExample1();
        
        if(age>60){// For elder Costumer
            if(cost>=50 && cost<=100){
                percentDis= 10*2;
                discount=(percentDis*cost/100);
                result= cost - discount ;
                display();
            }else if (cost>=100 && cost<=200){
                percentDis= 15*2;
                discount=(percentDis*cost/100);
                result= cost - discount ;
                display();
            }else if (cost>=200 && cost<=350){
                percentDis= 25*2;
                discount=(percentDis*cost/100);
                result= cost - discount ;
                display();
            }else if (cost>=350 && cost<=500){
                percentDis= 20*2;
                discount=(percentDis*cost/100);
                result= cost - discount ;
                display();
            }
            else if (cost>=500){
                percentDis= 30*2;
                discount=(percentDis*cost/100);
                result= cost - discount ;
                display();
            }else if(cost<50){
                percentDis=0;
                discount=0;
                result=cost;
                display();
            }
        
        }else{// For normal Costomers
            if(cost>=50 && cost<=100){
                percentDis= 10;
                discount=(percentDis*cost/100);
                result= cost - discount ;
                display();
            }else if (cost>=100 && cost<=200){
                percentDis= 15;
                discount=(percentDis*cost/100);
                result= cost - discount ;
                display();
            }else if (cost>=200 && cost<=350){
                percentDis= 25;
                discount=(percentDis*cost/100);
                result= cost - discount ;
                display();
            }else if (cost>=350 && cost<=500){
                percentDis= 20;
                discount=(percentDis*cost/100);
                result= cost - discount ;
                display();
            }
            else if (cost>=500){
                percentDis= 30;
                discount=(percentDis*cost/100);
                result= cost - discount ;
                display();
            }else if(cost<50){
                percentDis=0;
                discount=0;
                result=cost;
                display();
            }
        }

        
    }

}
