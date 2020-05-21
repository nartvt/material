/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5_28_03;

import java.util.Comparator;

/**
 *
 * @author hv
 */
public class Dictionary {
    String word;
    String mean;

    public Dictionary(String word, String mean) {
        this.word = word;
        this.mean = mean;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }
    public Comparator<Dictionary>Diccompare=new Comparator<Dictionary>(){
        @Override
        public int compare(Dictionary o1, Dictionary o2) {
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return o1.word.compareTo(o2.word);
        }
        
    };
    
}
