//INTERFACE

/**
Provides the Interface for the AlarmClock Class
@author Ryan George
*/
interface AlarmClock
{
    /**
    Sets the alarm to a new time.
    @param time - int value used to show the number of seconds
    */
    void setAlarm(int time);
    
    /**
    Reduces the alarm time and determines if the alarm will go off.
    @param time - int value used to reduce the alarm timer
    @return boolean - shows whether or not the alarm timer is at 0 or less
    */
    boolean stopAlarm(int time);
    
    /**
    Returns the amount of time left on the alarm timer.
    @return int - how many seconds are left on the alarm timer
    */
    int currentAlarm();
    
    /**
    Sets the alarm volume to a new value.
    @param newVolume - int value used to show the amplitude of volume
    */
    void volume(int newVolume);
    
    /**
    Returns the amplitude of the volume.
    @return int - the amplitude of the volume
    */
    int checkVolume();
}



//WATCH CLASS

/**
The Watch class that utilizes the AlarmClock interface.
@author Ryan George
*/
public class Watch implements AlarmClock
{
    //Instance Variables
    private int alarm;
    private int volume;
    
    //Non-Parameterized Constructor
    public Watch()
    {
        alarm = 60;
        volume = 5;
    }
    
    //Parameterized Constructor
    public Watch(int time, int vol)
    {
        alarm = time;
        volume = vol;
    }
    
    /**
    Sets the alarm to a new time.
    @param time - int value used to show the number of seconds
    */
    public void setAlarm(int time) 
    {
        alarm = time;
    }
    
    /**
    Sets the alarm volume to a new value.
    @param newVolume - int value used to show the amplitude of volume
    */
    public void volume(int newVolume) 
    {
        volume = newVolume;
    }
    
    /**
    Reduces the alarm time and determines if the alarm will go off.
    @param time - int value used to reduce the alarm timer
    @return boolean - shows whether or not the alarm timer is at 0 or less
    */
    public boolean stopAlarm(int time) 
    {
        alarm -= time;
        
        if(alarm <= 0) {
            System.out.println("BEEP BEEP BEEP!!");
            return true;
        }
        
        System.out.println("The alarm has " + alarm + " seconds remaining.");
        return false;
    }
    
    /**
    Returns the amount of time left on the alarm timer.
    @return int - how many seconds are left on the alarm timer
    */
    public int currentAlarm() 
    {
        return alarm;
    }
    
    /**
    Returns the amplitude of the volume.
    @return int - the amplitude of the volume
    */
    public int checkVolume() 
    {
        return volume;
    }
}



//BOMB CLASS

/**
The Bomb class that utilizes the AlarmClock interface.
@author Ryan George
*/
public class Bomb implements AlarmClock
{
    //Instance Variables
    private int alarm;
    private int volume;
    
    //Non-Parameterized Constructor
    public Bomb()
    {
        alarm = 300;
        volume = 100;
    }
    
    //Parameterized Constructor
    public Bomb(int time, int vol)
    {
        alarm = time;
        volume = vol;
    }
    
    /**
    Sets the alarm to a new time.
    @param time - int value used to show the number of seconds
    */
    public void setAlarm(int time) 
    {
        alarm = time;
    }
    
    /**
    Sets the alarm volume to a new value.
    @param newVolume - int value used to show the amplitude of volume
    */
    public void volume(int newVolume) 
    {
        volume = newVolume;
    }
    
    /**
    Reduces the alarm time and determines if the bomb will go off.
    @param time - int value used to reduce the alarm timer
    @return boolean - shows whether or not the alarm timer is at 0 or less
    */
    public boolean stopAlarm(int time) 
    {
        alarm -= time;
        
        if(alarm <= 0) {
            System.out.println("BOOOOOOM!");
            return true;
        }
        
        System.out.println("The alarm has " + alarm + " seconds remaining.");
        return false;
    }
    
    /**
    Returns the amount of time left on the alarm timer.
    @return int - how many seconds are left on the alarm timer
    */
    public int currentAlarm() 
    {
        return alarm;
    }
    
    /**
    Returns the amplitude of the volume.
    @return int - the amplitude of the volume
    */
    public int checkVolume() 
    {
        return volume;
    }
}
