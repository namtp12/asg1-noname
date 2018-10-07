/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author Administrator
 */

import java.io.IOException;
import main.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    
    
    public static void main(String[] args) throws IOException {
        //DictionaryManagement dMng = new DictionaryManagement();
        DictionaryCommandLine dCmd = new DictionaryCommandLine();
        Dictionary d = new Dictionary();
        //dCmd.insertFromCommandline(d);
        dCmd.insertFromFile(d);
        dCmd.showAllWords(d);
    }
}
