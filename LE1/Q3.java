// Q3. Write a program in Java to print the table of a number received through command
// line argument.

public class Main{
    public staticvoid main(String[], args){
        int n = 4;
        for(int i=1; i<=10; ++i){
            System.out.println("%d * %d = %d\n", n,i,n*i);
        }
    }
}