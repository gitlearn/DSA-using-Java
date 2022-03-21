public class Main
{
	public static void main(String[] args) {
	    int a = 0b1010;
		System.out.println(a); //10
		int b = 12_234;
		System.out.println(b); //12234
		int c = 016; //1*8+6=14
		System.out.println(c);
		int d = 0x17; //16*1+7=23
		System.out.println(d);
		long e = 23331514L;
		System.out.println(e);
		double f = 0x12.2P2; //(16*1+2+2/16)*2^2=72.5. P is binary exponent.
		System.out.println(f);
		float g = 2.345f;
		System.out.println(g);
		double h = 2e6;
		System.out.println(h); //2*10^6=2000000.0
		char i = 66;
		System.out.println(i); //B
		boolean j = true;
		System.out.println(j);
		String k = "imastring";
		System.out.println(k);
	}
}
