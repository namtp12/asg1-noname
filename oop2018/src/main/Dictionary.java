/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */

public class Dictionary {
    ArrayList<Word> wList = new ArrayList<>();
    
    
    public Dictionary() {
        
    }
    
    Dictionary(Dictionary d) {
        Word tmp = new Word();
        for(Word w : d.wList) {
            tmp.setWTarget(w.getWTarget());
            tmp.setWExplain(w.getWExplain());
            this.wList.add(tmp);
        }
    }
    
    public void addWord(Word w) {
        wList.add(w);
    }
    
    public ArrayList<Word> getWList() {
        return wList;
    }
}
