package com.loyanix.slicerweb.entity;

import javax.persistence.*;

@Entity
@Table(name = "INFO_ABOUT_LINES")
public class LineInfo {

    @Id
    @GeneratedValue
    @Column(name = "ID_LINE")
    private int id;
    @Column(name = "LONGEST_WORD_IN_LINE")
    private String longestWord;
    @Column(name = "LENGTH_WORD_LONG")
    private int lengthLongWord;
    @Column(name = "SHORTEST_WORD_IN_LINE")
    private String shortestWord;
    @Column(name = "LENGTH_WORD_SHORT")
    private int lengthShortWord;
    @Column(name = "AVG_WORD_LENGTH_IN_LINE")
    private int avgLengthWord;
    @Column(name = "LINE_LENGTH")
    private int lengthLine;
    @ManyToOne
    @JoinColumn(name = "ID_FILE")
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
