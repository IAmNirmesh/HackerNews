package nirmesh.rahul.hackernews.test;

import org.junit.Test;

import nirmesh.rahul.hackernews.Utls;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by NIRMESH on 1/1/2017.
 */
public class UtlsTest {
    @Test
    public void stringIsNull() {
        assertTrue(Utls.IsNullOrEmpty(null));
    }

    @Test
    public void stringIsEmpty() {
        assertTrue(Utls.IsNullOrEmpty(""));
    }

    @Test
    public void stringNotNullEmpty() {
        assertFalse(Utls.IsNullOrEmpty("test"));
    }

    @Test
    public void getRestAdapter(){
        assertNotNull(Utls.GetRestAdapter());
    }
}
