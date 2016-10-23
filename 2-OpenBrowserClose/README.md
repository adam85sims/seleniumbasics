# seleniumbasics
<h3>OpenBrowserClose</h3>

<p>This is a pretty simple one and if you ran through the last tutorial, you can probably get this pretty quickly.</p>

<p>In comparison to the last code we wrote, there is only one additional piece of code we need to add. Let's check out the last code and check out the new code.</p>

```
package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowserClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.w3schools.com/");

	}

}

```

<p>As you probably (hopefully) remember, this code opened your browser and navigated to W3Schools. But the window stayed open - so you don't really know when your test is completed. To fix this, we add one line of code:</p>

```
driver.close();
```

<p>In this line of code, we call 'driver' to initiate WebDriver and '.close()' to end the session. This is pretty simple and is a decent example to show you some of the power you have over your browser... I mean it's not the most impressive thing in the world.. but it'll do for now. You're only wee.</p>

<p>The final code looks like this:</p>

```
package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowserClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.w3schools.com/");

		driver.close();
	}

}
```

<p>Moving on to part 3. Next please!</p>
