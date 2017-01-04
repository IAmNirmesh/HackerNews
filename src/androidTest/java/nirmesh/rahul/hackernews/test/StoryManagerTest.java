package nirmesh.rahul.hackernews.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.ArrayList;
import java.util.List;

import nirmesh.rahul.hackernews.business.StoryManager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by NIRMESH on 1/1/2017.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StoryManagerTest {
    @Test
    public void test1() {
        assertNotNull(StoryManager.Instance());
    }

    @Test
    public void test2() {
        List<Integer> topStories = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            topStories.add(i);
        }
        StoryManager.Instance().SetTopStoryId(topStories);
        assertEquals(StoryManager.Instance().getLastLoadCount(), 0);
    }

    @Test
    public void test3() {
        StoryManager.Instance().LoadTenItems();
        assertEquals(StoryManager.Instance().getLastLoadCount(), 10);
    }

    @Test
    public void test4() {
        StoryManager.Instance().LoadTenItems();
        StoryManager.Instance().LoadTenItems();
        assertEquals(StoryManager.Instance().getLastLoadCount(), 0);
    }
}
