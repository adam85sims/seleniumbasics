# seleniumbasics

<h3>OpenBrowserMaximize</h3>

<p>Lets make things big. Or as big as your screen anyway.</p>

<p>So we've got this far and we aren't doing too bad. Well done if you're following along.</p>

<p>What we want to do now is open the browser, navigate to W3Schools and maximize the browser... before closing it again.</p>

<p>The code we had before was:<p>

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

<p>Not bad, eh? But with one simple line of code, we can get more control and.. you know.. actually see the page properly. That would be nice.</p>

<p>Let's add this:</p>

```
		driver.manage().window().maximize();
```

<p>So you're thinking one thing or the other right now. You're either thinking "Ooh.. is that it?" or you're thinking "What? What does this mean?!". Don't panic if you're the second guy. You probably haven't been coding for long. It's easy.</p>

<p>By now you realize when we want WebDriver to do pretty much anything, we've got to call it with 'driver'. We defined driver at the start, remember? Then from here, you've got to think about how testing works. It's sort of linear. In fact, forget about 'sort of'. It's freaking methodical. Step 1, step 2, step 3, that's how testing works. We are using three steps here one after the other in one line of code:</p>

<ul>
<li>manage</li>
<li>window</li>
<li>maximize</li>
</ul>

<p>If you're reading it like that, it's pretty simple. If you pop that in, you get this:</p>

```
package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowserMaximize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.w3schools.com/");

		driver.manage().window().maximize();

		driver.close();
	}

}
```

<p>Simple. Next we're going to talk about locating elements and navigating a site. Strap yourselves in. Lets have some fun and argue about XPATH and CSS Selectors.</p>
