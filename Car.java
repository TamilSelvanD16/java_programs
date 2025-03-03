class Vehicle
{
    String Model="GT";
    public void Sound()
    {
        System.out.println("Hurrr!");
    }
}
class Car extends Vehicle
{
    String Brand="Mustang";
    public static void main(String a[])
    {
        Car myCar=new Car();
        myCar.Sound();
        
        System.out.println(myCar.Brand + " " + myCar.Model);
    }
}