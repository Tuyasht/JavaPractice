package day38.BrowserTask;
import day38.BrowserTask.Browser;
public class Opera extends Browser{


    @Override
    public void openBrowser() {
        System.out.println("opening opera browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing opera browser");
    }

}
