package nirmesh.rahul.hackernews.job;

import java.util.List;

import de.greenrobot.event.EventBus;
import nirmesh.rahul.hackernews.service.StoryService;

/**
 * Created by NIRMESH on 1/1/2017.
 */
public class TopStoryJob extends ApiJob {

    @Override
    public void onAdded() {}

    @Override
    public void onRun() throws Throwable {
        StoryService service = adapter.create(StoryService.class);
        List<Integer> list = service.GetTopStories();
        if (list != null && list.size() > 0) {
            EventBus.getDefault().post(list);
        }
    }

    @Override
    protected void onCancel() {}
}
