package day38.BrowserTask;

public class BrowserObject {
    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        chrome.openBrowser();
        chrome.closeBrowser();


        FireFox fireFox = new FireFox();
        fireFox.openBrowser();
        fireFox.closeBrowser();


        Opera opera = new Opera();
        opera.openBrowser();
        opera.closeBrowser();


        Safari safari = new Safari();
        safari.openBrowser();
        safari.closeBrowser();





    }
}
