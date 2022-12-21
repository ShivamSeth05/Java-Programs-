package EmpPack;

public class DataReader {
	StringBuffer sb[] = null;//in
	public DataReader(StringBuffer[] sb) {
		this.sb = sb;
	}
	public void read() {
		for (StringBuffer k : sb) {
			System.out.println(k);
			
		}
		
	}
}
