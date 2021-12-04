 public class Television
{
	//the maker of the tv
    private final String MANUFACTURER;
    
    //the screen size of the tv
    private final int SCREEN_SIZE;
    
    //the power on control
    private boolean powerOn;
    
    //the channel the tv is on
    private int channel;
    
    //the volume of the tv
    private int volume;

    public Television (String brand, int size)
    {
    	MANUFACTURER = brand;
    	SCREEN_SIZE=size;
        powerOn= false;
        volume= 20;
        channel=2;
    }
    //gets the values stored in volume
    public int getVolume()
    {
        return volume;
    }
    //gets the values stored in channel
    public int getChannel()
    {
        return channel;
    }

    //gets the values stored in MANUFACTURER 
    public String getManufacturer()
    {
        return MANUFACTURER;
    }

    //gets the values stored in SCREEN_SIZE
    public int getScreenSize()
    {
        return SCREEN_SIZE;
    }

    //sets the values stored in channel
    public void setChannel(int station)
    {
        channel = station;
    }

    // changes the state from true to false or from false to true.
    public void power()
    {
        powerOn = !powerOn;

    }

    //increases the volume
    public void increaseVolume()
    {
        volume++;
    }

    //decreases the volume
    public void decreaseVolume()
    {
        volume--;
    }

}