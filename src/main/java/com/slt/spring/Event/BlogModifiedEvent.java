package com.slt.spring.Event;

import org.springframework.stereotype.Component;

@Component

public class BlogModifiedEvent {
    public  String content;
    public   boolean  importantChange;

    public BlogModifiedEvent() {
        this("1234679", true);
    }
    public BlogModifiedEvent(String blog, boolean importantChange) {
        this.content = blog;
        this.importantChange = importantChange;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isImportantChange() {
        return importantChange;
    }

    public void setImportantChange(boolean importantChange) {
        this.importantChange = importantChange;
    }
}
