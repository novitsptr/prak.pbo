public class Throws2
{
	static void division() throws ArithmeticException
	{
		int div;
		div = 15 / 0;
		throw new ArithmeticException("bagi nol");
	}
	public static void main(String args[])
	{
		try {
				division();
		}
		catch (ArithmeticException ae) {
			System.out.println("Bilangan tidak bisa dibagi 0 (zero)");
		}
		finally {
			System.out.println("Blok telah dieksekusi");
		}
	}
}