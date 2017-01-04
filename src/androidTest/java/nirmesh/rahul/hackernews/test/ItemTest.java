package nirmesh.rahul.hackernews.test;

import org.junit.Test;

import java.util.Date;

import nirmesh.rahul.hackernews.model.Item;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by NIRMESH on 1/1/2017.
 */
public class ItemTest {
    @Test
    public void isComment() {
        Item item = new Item();
        item.type = "Comment";
        assertTrue(item.isComment());
    }

    @Test
    public void testStoryDesc() {
        Item item = mock(Item.class);
        item.by = "Rahul";
        item.type = "story";
        item.title = "HackerNews";

        when(item.getTimeSpan()).thenReturn("1 hour ago");
        when(item.getStoryDesc()).thenCallRealMethod();
        String s = item.getStoryDesc();
        assertEquals("by Rahul 1 hour ago", s);
    }

    @Test
    public void testCommentDesc(){
        Item item = mock(Item.class);
        item.by = "Nirmesh";
        item.type = "comment";
        item.title = "TCombinator";

        when(item.getTimeSpan()).thenReturn("10 seconds ago");
        when(item.getCommentDesc()).thenCallRealMethod();
        String s = item.getCommentDesc();
        assertEquals("by Nirmesh 10 seconds ago", s);
    }
}
