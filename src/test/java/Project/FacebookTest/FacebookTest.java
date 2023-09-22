package Project.FacebookTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.PageObjectManager.ManageObjectFacebook;
import com.ReaderManager.ReaderManager;

import Baseclass.Base;

public class FacebookTest extends Base {

	public static WebDriver driver;
	public static ManageObjectFacebook Objface = new ManageObjectFacebook(driver);

	public static void main(String[] args) throws Exception {

		LaunchBrowser("chrome");
		Implicitwait(20, TimeUnit.SECONDS);

		String url = ReaderManager.Instant_ReaderManager().InstantReaderMaster().getUrl();
		getURL(url);

		String email = ReaderManager.Instant_ReaderManager().InstantReaderMaster().getEmail();
		Inputvalue(Objface.Instant_login().getEmailid(), email);

		String password = ReaderManager.Instant_ReaderManager().InstantReaderMaster().getPassword();
		Inputvalue(Objface.Instant_login().getPassword(), password);

		clickAction(Objface.Instant_login().getCreatenewaccountbutton());

		String month = ReaderManager.Instant_ReaderManager().InstantReaderMaster().getMonth();
		Dropdown(Objface.Instant_Createaccountpage().getBirthmonth(), month);

		String day = ReaderManager.Instant_ReaderManager().InstantReaderMaster().getDay();
		Dropdown(Objface.Instant_Createaccountpage().getBirthday(), day);

		String year = ReaderManager.Instant_ReaderManager().InstantReaderMaster().getYear();
		Dropdown(Objface.Instant_Createaccountpage().getBirthyear(), year);

	}

}
