/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgbreak.dan.pkgcontinue.pkg2;

/**
 *
 * @author HP
 */
public class BreakDanContinue2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("======== break ========");
        for (int x=0; x<10; x++){
        if (x == 5){
            break;
        }
             System.out.println("perulangan ke" +x);
             
             
             
        System.out.println("======== continue ========");
        for (int w=2; w<13; w++){
        if (w == 8){
            continue;
        }
             System.out.println("pengulangan ke " + w);
        }
            
 }   
}
}