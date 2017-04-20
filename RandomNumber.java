public class RandomNumber// create a new class
{
	private int mlow;
	private int mhigh;

	public RandomNumber(int highx, int lowx) {
		mlow = lowx;
		mhigh = highx;
	}

	public int GetLowNumber() {
		return mlow;
	}

	public int GetHighNumber() {
		return mhigh;
	}

	public int GetANumberx()

	{
		int numberrd;
		numberrd = 0 + (int) (Math.random() * mhigh);
		return numberrd;// need to return the value
	}

	public int GetANumber()
	// public int Getanumberbetween1and10()//calling a method
	{
		int numberrd;
		numberrd = mlow + (int) (Math.random() * (mhigh - mlow));
		return numberrd;// need to return the value
	}

	public int Getanumberbetween1and10()// calling a method
	{
		int numberrd;
		numberrd = 0 + (int) (Math.random() * 10);
		return numberrd;// need to return the value
	}

}