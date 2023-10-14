import org.w3c.dom.Text;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        ArrayList<Integer> student=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            student.add(i+1);
        }
        for (int i = 0; i < m; i++) {
            int p=scanner.nextInt();
            int q=scanner.nextInt();
            int id=0;
            for (int j = 0; j < n; j++) {
                if(student.get(j)==p)
                {
                    id=j;
                    break;
                }
            }
            student.remove(id);
            student.add(id+q,p);
        }
        for (int j = 0; j < n; j++) {
            System.out.print(student.get(j)+" ");
        }


    }
}
