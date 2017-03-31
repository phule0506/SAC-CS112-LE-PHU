public class RandomNumber// create a new class
{
    public int GetANumber (int high)
  //public int Getanumberbetween1and10()//calling a method
  {
    int numberrd;
    numberrd = 0 + (int)(Math.random() * high); 
    return numberrd;//need to return the value
  }
}