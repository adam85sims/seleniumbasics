<h2>OpenBrowser</h2>
<p>Ready to do some voodoo browser emm.. stuff? Ok... settle down.</p>
<h3>Let’s look at the code</h3>
<p>I know you've probably taken a look at the code already because you're a naughty little person. But, so it makes sense, I'm going to walk you through some of it.</p>

```
package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        WebDriver driver = new FirefoxDriver();
        
        driver.get("http://www.w3schools.com/");
    }

}

```

<h3>Line by line(ish)</h3>
```
package SeleniumBasics;
```
<p>This is going to be the name of whatever you called your Java project. If you called it something else, you're going to get a different name here. If that's the case, there's no real need to worry.</p>

```
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
```

<p>In order for your code to operate properly, you need to import packages to actually make it work. If you did not import these, you'll get some error messages and will be throwing things around a lot and/or crying. Here's a little trick though. You don't actually have to type this. Read on and I'll explain why</p>

```
public class OpenBrowser {
```
<p>This signifies the start of your Class.</p>

```
    public static void main(String[] args) {
        // TODO Auto-generated method stub
```
<p>Ok, cool. If you didn't tick the box demanding that Eclipse put this in for you - you need to put it in yourself. This is the start of your method. Without that, you are nothing. <b>NOTHING!</b> Your friends will point and laugh at you and you will no longer be able to maintain an erection.</p>

```
        WebDriver driver = new FirefoxDriver();
```
<p>Now we're getting into the fun stuff. We're selecting WebDriver and defining that we should be using the FirefoxDriver. This lets you control Firefox and run your test automation.</p>
<p>Remember when I said you didn’t have to actually type import org.openqa.selenium.WebDriver; and import org.openqa.selenium.firefox.FirefoxDriver;? Well, once you type the code we have just gone over and you select <b>Ctrl</b>, <b>Shift</b> and <b>O</b> (that's the letter O and not zero), Eclipse will automatically realise that Webdriver needs to be imported and it'll do this for you.</p>
<p>Moving on..</p>

```
        driver.get("http://www.w3schools.com/");
```

<p>This instructs the browser, once opened to navigate to http://www.w3schools.com/. 'driver' calls WebDriver '.get()' instructs the browser to navigate to or 'get' the url within the brackets and ';' is a terminator. I probably should have talked about terminators before. But you're big and strong. I'm sure you figured it out.</p>

<p>Provided you ran the code as instructed, congratulations, you've run your first Selenium script!</p>

<h3>Make things more interesting</h3>

<p>The browser just kinda sitting there not doing anything is annoying me. I'm going to give you a keyword below and I want you to see if you can figure out how to close it the next time you run your script:</p>

<ul><li>.close</li></ul>

<p>If you figured it out, cool! If you didn't, I hope you at least tried. We'll run through it in the next section 'OpenBrowserClose'.</p>



