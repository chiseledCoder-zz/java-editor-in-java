/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package textspeech;
/**
 *
 * @author Nikhil Shirsath
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
public class TextSpeech {
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args){
         Scanner scan_string=new Scanner(System.in);
         Scanner scan_int=new Scanner(System.in);
         String st,classname,filename;
         int input=0;
         try
         {
            System.setProperty("freetts.voices",
            "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
            Central.registerEngineCentral
            ("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
            Synthesizer synthesizer =
            Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));
            synthesizer.allocate();
            synthesizer.resume();
            System.out.println("Welcome to world of programming");
            synthesizer.speakPlainText("Welcome to world of programming", null);            
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
            synthesizer.speakPlainText("Start your java programming now.", null);
            System.out.println("Start your java programming now");
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
            synthesizer.speakPlainText("Enter your file name", null);
            System.out.println("Enter your file name");
            st=scan_string.nextLine();
            filename=st.substring(0,1).toUpperCase();
            classname=filename.concat(st.substring(1));
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
            synthesizer.speakPlainText("Creating new java file", null);
            System.out.println("Creating new java file");
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
            FileWriter fstream = new FileWriter(classname+".java",true);
            BufferedWriter output = new BufferedWriter(fstream);
            output.write("import java.io.*;");
            output.newLine();
            output.append("import java.util.*");
            output.newLine();
            Thread.sleep(2000);
            synthesizer.speakPlainText("File created", null);
            System.out.println("File created: ");
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
            synthesizer.speakPlainText("Importing basic packages.", null);
            System.out.println("Importing basic packages.");
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
            Thread.sleep(1500);
            synthesizer.speakPlainText("Packages imported.", null);
            System.out.println("Packages imported");
            Thread.sleep(500);
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
            synthesizer.speakPlainText("Enter 1 to create public class", null);
            System.out.println("Enter 1 to create public class");
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
            input=scan_int.nextInt();
            if(input==1)
            {
                synthesizer.speakPlainText("Creating public class", null);
                System.out.println("Creating public class");
                synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
                Thread.sleep(2000);
                synthesizer.speakPlainText("Done", null);
                System.out.println("Done.");
                synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
                output.write("public class "+classname);
                output.newLine();
                output.append("{");
                output.newLine();
                
            }            
            synthesizer.speakPlainText("Press 2 to create main function", null);
            System.out.println("Press 2 to create main function");
            input=scan_int.nextInt();
            if(input==2)
            {
                synthesizer.speakPlainText("Creating main function", null);
                System.out.println("Creating main function");
                synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
                Thread.sleep(2000);
                synthesizer.speakPlainText("Done", null);
                System.out.println("Done.");
                synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
                output.write("public static void main(String args[]) ");
                output.newLine();
                output.append("{");
                output.newLine();
            }
            synthesizer.speakPlainText("Press 3 to print something", null);
            System.out.println("Press 3 to print something");
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
            input=scan_int.nextInt();
            if(input==3)
            {
                synthesizer.speakPlainText("Type something that you want to print", null);
                System.out.println("Type something that you want to print:");
                synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
                String print=scan_string.nextLine();
                Thread.sleep(2000);
                synthesizer.speakPlainText("Done", null);
                System.out.println("Done.");
                synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
                output.write("System.out.println(\""+print+"\");");
                output.newLine();
            }
            synthesizer.speakPlainText("Press 4 to end programming", null);
            System.out.println("Press 4 to end programming");
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
            input=scan_int.nextInt();
            if(input==4)
            {
                synthesizer.speakPlainText("Inserting braces wherever necessary", null);
                System.out.println("Inserting braces wherever necessary");
                synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
                Thread.sleep(2500);
                synthesizer.speakPlainText("Done", null);
                System.out.println("Done.");
                synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
                output.write("}");
                output.newLine();
                output.write("}");
                output.close();
            }
            synthesizer.speakPlainText("Press 5 to compile and run the program", null);
            System.out.println("Press 5 to compile and run the program");
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
            input=scan_int.nextInt();
            if(input==5)
            {  
     
                try {
                    synthesizer.speakPlainText("Opening command promt", null);
                    System.out.println("Opening command promt");
                    synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
                    Thread.sleep(2000);    
                    Runtime.getRuntime().exec("cmd.exe /c start");
                } catch (IOException ex) {
                }
            }
            synthesizer.deallocate();
         }
        catch(Exception e)
        {
        }
   /* Open cmd using java
    * try {
        Runtime.getRuntime().exec("cmd.exe /c start");
        System.out.println("ok");
    } catch (IOException ex) {
        ex.printStackTrace();
    }*/
    }
}
