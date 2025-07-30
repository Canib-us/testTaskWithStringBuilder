package org.itk.testtaskwithstringbuilder;

import java.util.Stack;

public class CustomStringBuilder {
    private final StringBuilder sb;
    private final Stack<String> snapshot = new Stack<>();

    public CustomStringBuilder(StringBuilder sb) {
        this.sb = sb;
    }

    public CustomStringBuilder append(String s) {
        saveSnapshot();
        sb.append(s);
        return this;
    }

    public CustomStringBuilder delete(int start, int end) {
        saveSnapshot();
        sb.delete(start, end);
        return this;
    }

    public CustomStringBuilder insert(int offset, String s) {
        saveSnapshot();
        sb.insert(offset, s);
        return this;
    }

    public CustomStringBuilder undo(){
        if(!snapshot.isEmpty()){
            String prevStr = snapshot.pop();
            sb.setLength(0);
            sb.append(prevStr);
        }
        return this;
    }

    public String toString() {
        return sb.toString();
    }

    private void saveSnapshot() {
        snapshot.push(sb.toString());
    }
}
