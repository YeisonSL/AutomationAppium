package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TEXT_USER= Target.the("Pass textbox").locatedBy("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@text='person']]");
    public static final Target TEXT_PASS = Target.the("User textbox").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
    public static final Target ENTRY_BUTTON = Target.the("Entry button").locatedBy("//*[@text='ENTRAR']");
   

}
