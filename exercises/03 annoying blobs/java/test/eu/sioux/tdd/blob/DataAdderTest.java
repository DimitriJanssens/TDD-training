/**
 * 
 */
package eu.sioux.tdd.blob;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DataAdderTest
{
    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception
    {
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception
    {
    }
    
    @Test
    public void testData()
    {
        DataAdder myDataAdder = new DataAdder();
        myDataAdder.doSomeAdding();
    }
}