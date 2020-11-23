  import io.appium.java_client.MobileElement;
import org.junit.Test;

import java.net.MalformedURLException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ApkTest {
	
	@Test
    public void loginFail () throws MalformedURLException, InterruptedException {
        Apk apk = new Apk();
        Thread.sleep(1000);
        boolean login = false;
        List<MobileElement> btns = (List<MobileElement>) apk.driver.findElementsByClassName("android.widget.Button");
        MobileElement btnLogin = btns.get(0);
        if(btnLogin != null) {
        	login = true;
        }
        assertEquals(login, false);
    }
	
	@Test
    public void loginSuccess () throws MalformedURLException, InterruptedException {
        Apk apk = new Apk();
        Thread.sleep(1000);
        boolean login = false;
        List<MobileElement> btns = (List<MobileElement>) apk.driver.findElementsByClassName("android.widget.Button");
        MobileElement btnLogin = btns.get(0);
        btnLogin.click();
        if(btnLogin != null) {
        	login = true;
        }
        assertEquals(login, true);
    }
	
	@Test
    public void aceitarPassageiros () throws MalformedURLException, InterruptedException {
        Apk apk = new Apk();
        Thread.sleep(1000);
        List<MobileElement> btn1 = (List<MobileElement>) apk.driver.findElementsByClassName("android.widget.Button");
        MobileElement btnLogin = btn1.get(0);
        btnLogin.click();
        Thread.sleep(1000);
        boolean actrPass = false;
        List<MobileElement> btn2 = (List<MobileElement>) apk.driver.findElementsByClassName("android.widget.Button");
        MobileElement btnActrPass = btn2.get(1);
        btnActrPass.click();
        if(btnActrPass != null) {
        	actrPass = true;
        }
        assertEquals(actrPass, true);
    }
	
	@Test
    public void periodos () throws MalformedURLException, InterruptedException {
        Apk apk = new Apk();
        boolean period = false;
        Thread.sleep(1000);
        List<MobileElement> btn1 = (List<MobileElement>) apk.driver.findElementsByClassName("android.widget.Button");
        MobileElement btnLogin = btn1.get(0);
        btnLogin.click();
        Thread.sleep(1000);
        List<MobileElement> btns = (List<MobileElement>) apk.driver.findElementsByClassName("android.widget.Button");
        MobileElement btnPeriod = btns.get(4);
        btnPeriod.click();
        if(btnPeriod != null) {
        	period = true;
        }
        assertEquals(period, true);
    }

}
