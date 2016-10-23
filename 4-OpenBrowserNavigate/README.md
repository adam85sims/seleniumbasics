#SeleniumBasics

<h3>OpenBrowserNavigate</h3>

<p>Now I don't wanna fight about this. The bottom line is you need to learn both XPATH and CSS Selectors, so I'll be using them both throughout this.</p>

<p>If you go through this short little introductory course and decide "Hey, automation is cool. Thanks Adam, you're totally awesome.", I will first agree with you, aggressively, then tell you that no matter where you go, your team lead will probably want you to work in the same way as the rest of the team. So get to grips with different ways of navigating and you will be having a much better time.</p>

<p>I'm using W3Schools for a reason in my examples. That reason is for you to read the pages we are going to navigate to. If you're just throwing my code into Eclipse without typing it yourself, you'll notice that the browser ain't closing. That's because when we land, we're going to land on the XPATH syntax page and you my friend are going to read it.</p>

<h3>Before we begin..</h3>

<p>Before we begin, we need to install some more Firefox addons. Add the following to Firefox:</p>

<ul>
  <li>Firebug</li>
  <li>Firepath</li>
</ul>

<p>Once you've had these installed, you should be able to right click on any element of the page and select 'inspect in Firepath'.</p>
<p>Once you click on this, a console will load in the browser and you will have a dropdown which will give you the option to view XPATH or CSS Selectors for the object you clicked on. If you lost it, navigate round the buttons and you should find a pointer that brings up the selector of any element your mouse touches. This is pretty cool and will help you write scripts to automate your testing.</p>

<h3>The script before navigation</h3>

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

<p>Remember this? We're going to remove driver.close() and add to it. This will be in several parts, but all within this readme document, so refer back to this whenever you like.</p>

<h3>Finding elements and selecting them</h3>

<p>We're going to get our hands a little dirtier here and by the end of this section, our script is going to be an awful lot longer. But step by step.</p>

<ol><li>Load the W3Schools site and inspect the 'Tutorials' menu icon in 'Firepath'. This is our target. When I inspect this element, I get the following: ``` .//*[@id='navbtn_tutorials']```</li>
<li>You want to use some new code now to navigate to this and insert the XPATH selector as your target. The code we will use is: ```driver.findElement(By.xpath(".//*[@id='navbtn_tutorials']")).click();```</li>
<li>Add this to your script. If you've still got close on there, just paste over it. Run the script and see what happens. Your code should now look like this:</li></ol>

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

		driver.findElement(By.xpath(".//*[@id='navbtn_tutorials']")).click();
	}

}
```

<p>Lets break down the following:</p>

```
		driver.findElement(By.xpath(".//*[@id='navbtn_tutorials']")).click();
```

<p>Remember how testing is linear? Here's another example. Here, what we are doing is</p>
<ul><li>Calling the driver</li> <li>asking it to .findElement</li><li>Telling it what we want to find the element By.xpath.</li><li>Telling it the XPATH selector we found and want to use</li><li>Using '.click()' to click on that element.</li><li>Terminating the command with our ';' terminator</li></ul>

<p>It's not as confusing as it might look.</p>

<h3>Further navigation exercises to come.</h3>
