/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 *
 * @author Administrator
 */
public class DictionaryManagement {
    
    public void insertFromCommandline(Dictionary d) {
        DictionaryManagement dMng = new DictionaryManagement();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String line1;
        input.nextLine(); //This is very important. It behaves like fflush(stdin) in C++
        line1 = input.nextLine();
        String[] wTar = line1.split(" ");
        
        ArrayList<String> wTar_d = new ArrayList<>(Arrays.asList(wTar));
        
        String line2;
        line2 = input.nextLine();
        String[] wExp = line2.split(" ");
        ArrayList<String> wExp_d = new ArrayList<>(Arrays.asList(wExp));
        
        //Word tmp = new Word();
        for(int i = 0; i < n; i++) {
            Word tmp = new Word();
            tmp.setWTarget(wTar_d.get(i));
            tmp.setWExplain(wExp_d.get(i));
            d.addWord(tmp);
        }
    }
    
    /**
     *
     * @param d
     * @throws IOException
     */
    public void insertFromFile(Dictionary d) throws IOException {
        File f = new File("C:\\Users\\Administrator\\Desktop\\E_V.txt"); 
        ArrayList<String> res = (ArrayList<String>) Files.readAllLines(f.toPath());
        String[] resArr = new String[res.size()];
        //resArr = res.toArray(resArr);
        for (int i = 0; i < res.size(); i++) {
            resArr[i] = res.get(i);
        }
        
        ArrayList<String> wTar = new ArrayList<>();
        ArrayList<String> wExp = new ArrayList<>();
        
        String[] tmp;
        for (int i = 0; i < resArr.length; i++) { //resArr.length = res.size()
            
            tmp = resArr[i].split("<html><i>");
            wTar.add(tmp[0]);
            //wExp.add(tmp[1]);
            System.out.println(resArr[i]);
        }
        
        for (int i = 0; i < resArr.length; i++) {
            System.out.println(wTar.get(i));
        }
        
    }
}
