package jdbchub;

import java.util.*;
public class DatD {
public static void main(String[] args) {
	
	
int a[]=new int[] {1,2,3,4,2,4,5,6,7,3,4};

int i;
for(int ii=0;ii<a.length;ii++)
{
	for(i=ii;i<a.length;i++)
	{
	if(a[ii]>a[i])
	{
		int temp=a[ii];
		a[ii]=a[i];
		a[i]=temp;
		
	}
	}
	
}
int count=1;
for(i=0;i<a.length-1;i++)
{

if(a[i]==a[i+1])
{
	count++;
}else
{
	System.out.println(a[i]+" "+count);
	count=1;
}	
}
System.out.println(a[i]+" "+count);


	for(int b:a)
	{
		System.out.println(b);
	}
	
	

	
	
}
	
	
}
