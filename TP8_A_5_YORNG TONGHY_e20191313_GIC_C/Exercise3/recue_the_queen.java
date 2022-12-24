package Exercise3;
import java.util.Scanner;
//---------------- Question 1--------------------
class Q1{
    
    public void question1(){
        System.out.println("""
                Q1. You have to reached the big tree that the black wizard 
                took the princess to. There are 2 holes: the light hole 
                and dark hole.Which one will you enter? (A. Light hole, B. Dark hole) 
                """);
        char c;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Choice: ");
            c= sc.next().charAt(0);
        }while(c!='A' && c!= 'a' && c!='B' && c!='b');
        if (c=='A'|| c=='a'){
            // true answer ;
            System.out.println("A.The light is the exit into another dimension.You can safely go thourgh it");
            // go to the question 2
            Q2 q2 = new Q2();
            //recue_the_queen rq = new recue_the_queen();
            q2.question2();

        }else if (c == 'B' || c=='b'){
            // false answer;
            System.out.println("""
                    The dark is hell full of darkness, you are suffering from it
                    and need to return to choose the hole again
                    """);
                //back to hole again 
                Q1 q1 = new Q1();
                q1.question1();

        }

    }
}
//--------------------Question 2------------------------
class Q2{
    
    public void question2(){
        System.out.println("""
                Q2. (Only if pass Q1)you pass into the other dimension.
                in there you see 2 trees with the holes. Which one 
                will you take ? (A.Left hole,B. Right hole)
                """);
    char c;
    do{
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Choice: ");
        c= sc.next().charAt(0);

    }while(c!='A' && c!= 'a' && c!='B' && c!='b');
    if (c=='A'|| c=='a'){
        // Answer false 
        System.out.println("A.The left whole leads to Q1");
        // go to question 1
        Q1 q1 = new Q1();
        q1.question1();
       
       
        
    }else if (c == 'B' || c=='b'){
        // Answer true;
        System.out.println("The right leads to the temple of the back wizards");
        Q3 q3 = new Q3();
        //recue_the_queen rq = new recue_the_queen();
        q3.question3();
    }
}
}
//----------------Question3----------------------------- 
class Q3{
    
    public void question3(){
        System.out.println("""
                Q3. (Only if pass Q2) you enter the temple.
                A person is attacking by a dragon! To move further, not 
                paying to them of attention? (A.Yes,B.No)
                """);
        char c;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Choice('A' for Yes & 'B' for No): ");
            c= sc.next().charAt(0);
        }while(c!='A' && c!= 'a' && c!='B' && c!='b');
        if (c=='A'|| c=='a'){
            // Answer false
            
            System.out.println("""
                    You try to pass past, but the dragon notices your
                    presence and transforms you into ashes. you are
                    dead!! 
                    """);
            System.out.println("Game is over!");

        }else if (c == 'B' || c=='b'){
            // Answer true!!
            System.out.println("""
                    Congratulation, you have passed all tests of honor.
                    Princess gets to you !!! (Hero becomes the future king)
                    """);

        }

    }
}
public class recue_the_queen {
    Q1 q1 = new Q1();
    Q2 q2 = new Q2();
    Q3 q3 = new Q3();

    public recue_the_queen(){
    }

    public recue_the_queen(Q1 q1,Q2 q2,Q3 q3){
        this.q1 =q1;
        this.q2 =q2;
        this.q3=q3;
    }
    public void recue(){
        q1.question1();
        
    }
}


