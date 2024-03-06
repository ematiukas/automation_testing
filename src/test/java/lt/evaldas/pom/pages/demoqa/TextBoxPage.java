package lt.evaldas.pom.pages.demoqa;

import lt.evaldas.pom.pages.Common;

public class TextBoxPage {
    public static void open(String url) {
        Common.setUpChrome(8);
        Common.openUrl(url);
    }

    public static void close() {
        Common.quitChromeDriver();
    }
}
