import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float price,distance;//price=Ücret -- distance = mesafe
		try (Scanner giris = new Scanner(System.in)) {
			
			System.out.print("Gidilen Mesafe : ");
			distance=giris.nextFloat();
			
			if(distance<0) {
			System.out.println("Girilen Mesafe Hatalıdır.Girilen Mesafe 0'dan Küçük Olamaz!!!");
		}
			
		else if(distance<20) {
			price=20;
			System.out.print("Taksimetre Ücretiniz = "+price);
		}
			
		else if(distance>=20) {
			price=(float) (10+(distance*2.20));//casting işlemi uyguladık yani çıkan sonucu "price" float tanımlı olduğu için floata çevirdik
			System.out.print("Taksimetre Ücretiniz = "+price);
		}
			
		}
		

	}

}
