import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
	
	/*nast�pnie w mainie stw�rz kilka danych testowych:
		(np.: 3-4 samochody i niech ka�dy ma po 0-5 napraw)
		
		- znajdz samoch�d kt�ry mia� najwi�cej napraw
		- znajdz samoch�d kt�ry mia� najdro�sz� napraw�
		- znajd� najdro�sz� napraw�
		- oblicz kwot� napraw w danym miesi�cu/roku - metoda double calculateTotalServiceCostFor(int month, int year, List<Car> cars)*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter = new SimpleDateFormat("MM/yyyy");
		Date date = null;//formatter.parse(year + "/" + month);
		List <Car> cars = new ArrayList<>();
		//Date year_of_production, String model, int mileage, int number_of_repairs, double cost_of_repair, Date date
		//cars.add(new Car("08/2016", "Fiat", 320, 4, 700.90, "09/2015"))
		
		cars.forEach(System.out::println);
	}

}
