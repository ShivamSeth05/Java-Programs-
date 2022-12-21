//	Program-11
//	Define a method which accepts three boolean value as arguments and return true
//	if any of the two values are true, otherwise return false.
//	Write the method with the following specifications: 
//	Name of method countBoolean() // which accepts three boolean arguments, 
//	return true if any of the two values are true, else return false.
//	Arguments: two arguments of type boolean
//	Return Type: a boolean value 
//	Specifications: The value returned by the method countBoolean() is determined

//	by the following rules:
//	If b1 = true, b2 = true, b3 = true then, return true
//	If b1 = true, b2 = true, b3 = false then, return true
//	If b1 = true, b2 = false, b3 = false then, return false
//	If b1 = false, b2 = false, b3 = false then, return false


//"3 4 5 6"


package oct27;
class CountBoolean{
	boolean countBoolean( boolean a,boolean b,boolean c) {
		if(a&&b) return true;
		else if(b&&c) return true;
		else if (a&&c) return true;
		else if(a&&b&&c) return true;
		else return false ;
		
	}
}
public class Pro_11CountBoolean {

	public static void main(String[] args) {
		CountBoolean ob1 = new CountBoolean();
		System.out.println(ob1.countBoolean(false,false,false));
		System.out.println(ob1.countBoolean(true,true,true));
		System.out.println(ob1.countBoolean(true,true,false));
		System.out.println(ob1.countBoolean(false,true,true));
		System.out.println(ob1.countBoolean(true,false,true));
		System.out.println(ob1.countBoolean(false,false,true));
		System.out.println(ob1.countBoolean(true,false,false));
		System.out.println(ob1.countBoolean(false,true,false));
		System.out.println(ob1.countBoolean(false,false,true));

	}

}
