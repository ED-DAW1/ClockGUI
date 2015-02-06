package daw.ed.uml.clock;

public class NumberDisplay
{
    private int limit;
    private int value;

    /**
     * Constructor for objects of class NumberDisplay.
     * Set the limit at which the display rolls over.
     */
    public NumberDisplay(int limit)
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Return the current value.
     */
    public int getValue()
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Return the display value (that is, the current value as a two-digit
     * String. If the value is less than ten, it will be padded with a leading
     * zero).
     */
    @Override
    public String toString()
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Set the value of the display to the new specified value. If the new
     * value is less than zero or over the limit, do nothing.
     */
    public void setValue(int value)
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * Increment the display value by one, rolling over to zero if the
     * limit is reached.
     */
    public void increment()
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
