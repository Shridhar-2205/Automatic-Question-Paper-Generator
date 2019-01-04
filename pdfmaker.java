/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paper;

/**
 *
 * @author Dell
 */
public class pdfmaker {
    public static void main(String args[])
    {
        String filePath = "C:\\Program Files (x86)\\NCH Software\\Doxillion\\doxillion.exe";
        try {
             
            Process p = Runtime.getRuntime().exec(filePath);
             
        } catch (Exception e) {
            e.printStackTrace();
        }
         
    }
    
}
