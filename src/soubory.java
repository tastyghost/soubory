import java.io.*;
public class soubory 

	{
	
	public static void main(String[] args) 
	
	{
	File vstupS=new File ("vstup.txt");
	File vystupS=new File ("vystup.txt");
	File data=new File ( "data.txt");
	

	try
	{	
		FileReader vr=new FileReader (vstupS);
		FileReader dr=new FileReader (data);
		FileWriter vw=new FileWriter (vystupS);
		int c2;
		char z2;
		String [] pole;
		StringBuffer s2=new StringBuffer();
		while ((c2=dr.read())!=-1)
		{
			z2=(char)c2;
			s2.append(z2);	
		}
		
		String s3=s2.toString();	
		pole=s3.split("=");
		
		//ètení dokumentu do string
		
		
		int c;
		
		char z;
		
		StringBuffer s1=new StringBuffer();		
		
		while ((c=vr.read())!=-1) 
			{	
				z=(char)c;
				s1.append(z);	
			}
		System.out.println(s1);
		vw.close();
		dr.close();
		vr.close();
	}
	catch (IOException e)
	{
		 System.out.println("Soubor " + vstupS + "nelze otevøít");

	}
	}
	}
	


