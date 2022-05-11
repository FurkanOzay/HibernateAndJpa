package com.javacourse.project.dto;

import lombok.Data;

import java.util.List;

@Data
public class OgrenciKitap {
    private String ogrenciName;
    private List<String> bookNames;

}
