package com.adt.utilityservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Mail {
    private String from;
    private String to;
    private String subject;
    private String body;
    private String content;
    private Map<String, Object> model;
    private HashMap<String, File> attachments;
    private List<String> toArray;
    private int empId;
}



