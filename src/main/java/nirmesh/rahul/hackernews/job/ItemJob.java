package nirmesh.rahul.hackernews.job;

import de.greenrobot.event.EventBus;
import nirmesh.rahul.hackernews.model.Item;
import nirmesh.rahul.hackernews.service.StoryService;

/**
 * Created by NIRMESH on 1/1/2017.
 */
public class ItemJob extends ApiJob {
    private int itemId;

    public ItemJob(int itemId) {
        this.itemId = itemId;
    }

    @Override
    public void onAdded() {}

    @Override
    public void onRun() throws Throwable {
        StoryService service = adapter.create(StoryService.class);
        Item item = service.StoryItem(itemId);
        if (!item.deleted)
            EventBus.getDefault().post(item);
    }

    @Override
    protected void onCancel() {}
}
