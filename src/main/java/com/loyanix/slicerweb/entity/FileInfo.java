package com.loyanix.slicerweb.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class FileInfo {

    @Id
    @GeneratedValue
    private int id;
    private String fileName;
    private String longestWord;
    private int lengthOfLongestWord;
    private String shortestWord;
    private int lengthOfShortestWord;
    private int avgLengthWord;
    private int avgLengthLine;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fileinfo")
    private List<LineInfo> lineInfos = new ArrayList();

    public FileInfo() {
    }

    public FileInfo(String fileName, String longestWord, int lengthOfLongestWord, String shortestWord, int lengthOfShortestWord, int avgLengthWord, int avgLengthLine, List<LineInfo> lineInfos) {
        this.fileName = fileName;
        this.longestWord = longestWord;
        this.lengthOfLongestWord = lengthOfLongestWord;
        this.shortestWord = shortestWord;
        this.lengthOfShortestWord = lengthOfShortestWord;
        this.avgLengthWord = avgLengthWord;
        this.avgLengthLine = avgLengthLine;
        this.lineInfos = lineInfos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public void setLongestWord(String longestWord) {
        this.longestWord = longestWord;
    }

    public int getLengthOfLongestWord() {
        return lengthOfLongestWord;
    }

    public void setLengthOfLongestWord(int lengthOfLongestWord) {
        this.lengthOfLongestWord = lengthOfLongestWord;
    }

    public String getShortestWord() {
        return shortestWord;
    }

    public void setShortestWord(String shortestWord) {
        this.shortestWord = shortestWord;
    }

    public int getLengthOfShortestWord() {
        return lengthOfShortestWord;
    }

    public void setLengthOfShortestWord(int lengthOfShortestWord) {
        this.lengthOfShortestWord = lengthOfShortestWord;
    }

    public int getAvgLengthWord() {
        return avgLengthWord;
    }

    public void setAvgLengthWord(int avgLengthWord) {
        this.avgLengthWord = avgLengthWord;
    }

    public int getAvgLengthLine() {
        return avgLengthLine;
    }

    public void setAvgLengthLine(int avgLengthLine) {
        this.avgLengthLine = avgLengthLine;
    }

    public List<LineInfo> getLineInfos() {
        return lineInfos;
    }

    public void setLineInfos(List<LineInfo> lineInfos) {
        this.lineInfos = lineInfos;
    }

    @Override
    public String toString() {
        return "FileInfo{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", longestWord='" + longestWord + '\'' +
                ", lengthOfLongestWord=" + lengthOfLongestWord +
                ", shortestWord='" + shortestWord + '\'' +
                ", lengthOfShortestWord=" + lengthOfShortestWord +
                ", avgLengthWord=" + avgLengthWord +
                ", avgLengthLine=" + avgLengthLine +
                ", lineInfos=" + lineInfos +
                '}';
    }
}
