package classAssignment;

public class Five {
	boolean countBoolean(boolean a,boolean b,boolean c) {
		if(a&&b)return true;
		else if(c&&b)return true;
		else if(a&&c)return true;
		return false;
	}

	public static void main(String[] args) {
		Five obFive = new Five();
			System.out.println(obFive.countBoolean(true,true,false));

	}

}
