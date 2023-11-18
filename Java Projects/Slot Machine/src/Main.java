import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Main {

    public static void sendMessage(int size , String str){
        //ClipBoard
        StringSelection stringSelection = new StringSelection(str);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection,null);

        try {

            Thread.sleep(5000);
            for(int i = 0 ; i < size ; i++) {
                //Robot
                Robot r1 = new Robot();
                r1.keyPress(KeyEvent.VK_CONTROL);
                r1.keyPress(KeyEvent.VK_V);

                r1.keyRelease(KeyEvent.VK_CONTROL);
                r1.keyRelease(KeyEvent.VK_V);

                r1.keyPress(KeyEvent.VK_ENTER);
                r1.keyRelease(KeyEvent.VK_ENTER);

               // Thread.sleep();
            }
        }catch (AWTException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("!!--  Welcome to Slot Machine No : 07  --!!");
        System.out.println("Give A String : ");
        Scanner data = new Scanner(System.in);
        String str = data.nextLine();
        int size = data.nextInt();
        sendMessage(size,str);
    }
}