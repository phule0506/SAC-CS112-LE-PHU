
public class Dice {
		private  int m_Dice;
		private int m_value;
		int[] History = new int[100];
				
		public Dice (int dice)
		{
		m_Dice = dice;
		}
		public int Roll() {
			int value =(1 + (int) (Math.random() * (6))) * m_Dice;
			m_value = value;
			for (int i=0; i<History.length; i++) 
				History[i] = value;
				return value;
		}
		public void SetDice(int num){
			m_Dice = num;
		}
		public int value(){
		return m_value; 
		}
		public void history()
		{
		 System.out.println("Game History rolls:");
		 for(int i = 0;i<History.length;i++)
			 System.out.println(History[i]);
		 
		}
	 }	