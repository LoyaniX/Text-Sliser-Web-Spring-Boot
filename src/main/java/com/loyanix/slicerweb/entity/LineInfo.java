package com.loyanix.slicerweb.entity;

import javax.persistence.*;

@Entity
public class LineInfo {

    @Id
    @GeneratedValue
    private int id;
    private String longestWord;
    private int lengthLongWord;
    private String shortestWord;
    private int lengthShortWord;
    private int avgLengthWord;
    private int lengthLine;
    @ManyToOne
    @JoinColumn(name = "fileId", referencedColumnName = "id")
    private FileInfo fileInfo;

    public LineInfo() {
    }

    public LineInfo(String longestWord, int lengthLongWord, String shortestWord, int lengthShortWord, int avgLengthWord, int lengthLine, FileInfo fileInfo) {
        this.longestWord = longestWord;
        this.lengthLongWord = lengthLongWord;
        this.shortestWord = shortestWord;
        this.lengthShortWord = lengthShortWord;
        this.avgLengthWord = avgLengthWord;
        this.lengthLine = lengthLine;
        this.fileInfo = fileInfo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public void setLongestWord(String longestWord) {
        this.longestWord = longestWord;
    }

    public int getLengthLongWord() {
        return lengthLongWord;
    }

    public void setLengthLongWord(int lengthLongWord) {
        this.lengthLongWord = lengthLongWord;
    }

    public String getShortestWord() {
        return shortestWord;
    }

    public void setShortestWord(String shortestWord) {
        this.shortestWord = shortestWord;
    }

    public int getLengthShortWord() {
        return lengthShortWord;
    }

    public void setLengthShortWord(int lengthShortWord) {
        this.lengthShortWord = lengthShortWord;
    }

    public int getAvgLengthWord() {
        return avgLengthWord;
    }

    public void setAvgLengthWord(int avgLengthWord) {
        this.avgLengthWord = avgLengthWord;
    }

    public int getLengthLine() {
        return lengthLine;
    }

    public void setLengthLine(int lengthLine) {
        this.lengthLine = lengthLine;
    }

    public FileInfo getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }

    @Override
    public String toString() {
        return "LineInfo{" +
                "id=" + id +
                ", longestWord='" + longestWord + '\'' +
                ", lengthLongWord=" + lengthLongWord +
                ", shortestWord='" + shortestWord + '\'' +
                ", lengthShortWord=" + lengthShortWord +
                ", avgLengthWord=" + avgLengthWord +
                ", lengthLine=" + lengthLine +
                ", fileInfo=" + fileInfo +
                '}';
    }

}
