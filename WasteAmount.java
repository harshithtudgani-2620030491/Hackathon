import java.util.Scanner;
public class WasteAmount{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter waste collected:");
int wastecollected = sc.nextInt();
if(wastecollected <=100){
System.out.println("Collection Target Achieved");
}else{
System.out.println("More Waste Collection Required");
}
}
}

