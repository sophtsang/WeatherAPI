public class Simulator {
    public static void main(String args[])
    {
        City city = new City();
        Temperature temperature = new Temperature();
        Weather weather = new Weather();
        Ozone ozone = new Ozone();

        System.out.println(city.getData());
        System.out.println(temperature.getData());
        System.out.println(weather.getData());
        System.out.println(ozone.getData());
    }
}
