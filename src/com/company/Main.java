package com.company;
import java.util.Scanner;

public class Main {

    public static int LetterCounter(String string){
        if (string == null || string.isEmpty()){
            System.out.println("0 letters");
        }
        int nospace = string
                .replace(" ","")
                .replace("?","")
                .replace(",","")
                .replace(";","")
                .replace(".","")
                .replace("!","")
                .replace("\"","")
                .replace(":","")
                .replace("'","")
                .replace("-","").length();
        System.out.println(nospace + " letter(s)");
        return nospace;


    }

    public static int WordCounter(String string){
        if (string == null || string.isEmpty()){
            System.out.println("0 words");
        }
        String[] words = string.split(" ");
        System.out.println(words.length + " word(s)");
        return words.length;

    }

    public static int SentenceCounter(String string){
        if (string == null || string.isEmpty()){
            System.out.println("0 sentences");
        }
        String[] sentences = string.split("[.!?]");
        System.out.println(sentences.length + " sentence(s)");
        return sentences.length;


    }
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);

	    System.out.print("Text:");
        String string = text.nextLine();

        double L = LetterCounter(string);
        double W = WordCounter(string);
        double S = SentenceCounter(string);

        double AveL = (L/W) * 100;
        System.out.println(AveL);
        double AveS = (S/W) * 100;
        System.out.println(AveS);

        double index = (0.0588 * AveL) - (0.296 * AveS) - 15.8;
        System.out.println(index);
        int Grade = (int)Math.round(index);
        System.out.println(Grade);
        if (Grade < 1){
            System.out.println("Before Grade 1");
        } else if (Grade >= 16){
            System.out.println("Grade 16+");
        } else {
            System.out.println("Grade " + Grade);
        }

    }
}
