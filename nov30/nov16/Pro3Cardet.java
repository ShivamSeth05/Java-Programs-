package nov16;
class Car{
	int wheels;
	String modele;
	Car(int wheels){
		this.wheels=wheels;
	}
	void setmodel(String modele) {
		this.modele=modele;
	}
	void dis() {
		System.out.println(wheels+" "+modele);
	}
}
public class Pro3Cardet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obCar = new Car(4);
		obCar.setmodel("BMW");
		obCar.dis();
	}

}
