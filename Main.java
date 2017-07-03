# jj
import java.io.*;
//import java.util.*;
public class Main {
	
	public static void main(String args[])throws  Exception{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter any integer values");
	Integer num1=Integer.parseInt(br.readLine());
	if(num1>0)
	{
	System.out.println(num1 +" positive numbers:");
	} 
	else if(num1<0)
	{
	System.out.println(num1 +" negative numbers:");
	}
	else
	{
	System.out.println(num1 +" it is zero");
	}
	}
	}

