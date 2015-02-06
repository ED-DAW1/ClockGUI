package daw.ed.uml.clock;

public class ClockDisplay
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplay()
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplay(int hour, int minute)
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute)
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Return the current time of this display in the format HH:MM.
     * @return current time
     */
    public String getTime()
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * @see getTime()
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    
}
