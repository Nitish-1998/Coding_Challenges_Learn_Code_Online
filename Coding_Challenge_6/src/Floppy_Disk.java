import java.util.*;
public class Floppy_Disk 
{
	public static void main(String[] args) 
	{ int f,u,o,n,TotalDiskSize,CurrentUsedDiskSize,CurrentFreeDiskSize;
		Scanner input=new Scanner(System.in);		
	    System.out.println("Enter Free Bytes of floppy:- ");
	    f=input.nextInt();
	    System.out.println("Enter Used Bytes of Floppy:- ");
	    u=input.nextInt();
	   System.out.println("Enter Deleted Byte File Size of Floppy:- ");
	   o=input.nextInt();
	   System.out.println("Enter the New Byte Size of Floppy:- ");
	   n=input.nextInt();
	   TotalDiskSize=f+u;
	   CurrentUsedDiskSize=u-o;
	   CurrentUsedDiskSize=CurrentUsedDiskSize+n;
	   CurrentFreeDiskSize=TotalDiskSize-CurrentUsedDiskSize;
	   System.out.println("Free Space Available "+ CurrentFreeDiskSize +" Bytes");
	   input.close();
	}

}
