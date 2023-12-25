package com.baomidou.mybatisplus.samples.jsonb.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Data
@ToString
public class TestContent {
    private String title;
    private String content;

    public static TestContent of(String title, String content) {
        TestContent tc = new TestContent();
        tc.setTitle(title);
        tc.setContent(content);
        return tc;
    }
}
