package com.example.myapplication.dummy;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DummyContent {

    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 6;

    private static final int images1[] = {R.mipmap.im_0002_0001, R.mipmap.im_0002_0002, R.mipmap.im_0002_0003, R.mipmap.im_0002_0004, R.mipmap.im_0002_0005};

    static {
        ITEMS.clear();
        ITEM_MAP.clear();
        // Add some sample items.
        for (int i = 0; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        if (position == 1)
            return new DummyItem(String.valueOf(position), "Original", makeDetails(position), images1);
        if (position == 2)
            return new DummyItem(String.valueOf(position), "DMFNet", makeDetails(position), null);
        if (position == 3)
            return new DummyItem(String.valueOf(position), "Unet", makeDetails(position), null);
        if (position == 4)
            return new DummyItem(String.valueOf(position), "UNet++", makeDetails(position), null);
        if (position == 5)
            return new DummyItem(String.valueOf(position), "Ours", makeDetails(position), null);
        if (position == 6)
            return new DummyItem(String.valueOf(position), "GT", makeDetails(position), null);

        return new DummyItem(String.valueOf(position), "Some NN", makeDetails(position), null);

    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("The result of Neural Network ").append(position).append(" is ");
        return builder.toString();
    }

    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;
        public int[] images;

        public DummyItem(String id, String content, String details, int images[]) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.images = images;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
