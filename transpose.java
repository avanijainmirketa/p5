import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int r,c,i,j;
	    r=sc.nextInt();
	    sc.nextLine();
	    c=sc.nextInt();
	    sc.nextLine();
	    int a[][]=new int[r][c];
	    for(i=0;i<r;i++)
	    { for(j=0;j<c;j++)
	    { a[i][j]=sc.nextInt();
	     System.out.print(a[i][j]+" ");
	    }
	    System.out.println();
	    }
	    System.out.println();
	    for(i=0;i<c;i++)
	    { for(j=0;j<r;j++)
	    { System.out.print(a[j][i]+" ");
	    }
	    System.out.println();
	    }
	}
}
