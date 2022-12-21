package classAssignment;

public class Fourth {
	String ringAlarm(int day,boolean vac) {
		if(day<0||day>6||vac!=false&&vac!=true) return"Invalid Input";
		else if(day>=1&&day<=5&&vac==true) return"10:00 ";
		else if(day>=1&&day<=5&&vac==false) return"07:00 ";
		else if(day==0||day==6&&vac==true) return"OFF ";
		else if(day==0||day==6&&vac==false) return"10:00 ";
		return " ";
	}

	public static void main(String[] args) {
		Fourth obFourth = new Fourth();
		System.out.println(obFourth.ringAlarm(4, true));

	}

}
