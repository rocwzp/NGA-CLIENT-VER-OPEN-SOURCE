
package gov.anzong.meizi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MeiziTopicMData {


    public String title;

    public List<TopicContentItem> content;

    public String date;

    public MeiziTopicMData() {
        date="";
        content = new ArrayList<MeiziTopicMData.TopicContentItem>();
    }

    public static class TopicContentItem {
        public ContentItemType type;

        public String imgUrl;

        public String msg;
    }

    public enum ContentItemType {
        MSG,
        IMAGE
    }
}
