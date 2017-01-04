package nirmesh.rahul.hackernews.service;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;
import nirmesh.rahul.hackernews.model.Item;

/**
 * Created by NIRMESH on 1/1/2017.
 */
public interface StoryService {
    @GET("/v0/topstories.json?print=pretty")
    List<Integer> GetTopStories();

    @GET("/v0/item/{id}.json")
    Item StoryItem(@Path("id") int itemId);
}
