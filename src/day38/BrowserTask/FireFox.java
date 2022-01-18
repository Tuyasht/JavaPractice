package day38.BrowserTask;
import day38.BrowserTask.Browser;
public class FireFox extends Browser {

    @Override
    public void openBrowser() {
        System.out.println("opening firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing firefox browser");

    }
}