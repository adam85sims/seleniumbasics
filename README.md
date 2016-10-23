# seleniumbasics
<h2>Selenium Basics Tutorials</h2>

<h4>Welcome to some basic Selenium with Java binding tutorials for those of you interested in getting to grips with Selenium automation.</h4>

<p>Typically I will be using Eclipse which I find works well with the Java bindings. If you are using other bindings, I suggest finding the tool that works for you. For example, when writing test cases with Python bindings, I prefer to use Atom. Use what’s comfortable for you.</p>

<p>So, when creating these tutorials, I used the following:</p>

<ul>
<li>Eclipse Mars</li>
<li>Selenium 2.52</li>
<li>Firefox 45</li>
</ul>

<p>You can use updated versions of the above, however please be aware of compatibility issues - there have been many issues with people having trouble getting Selenium 3 up and running. I haven't had a chance to play around with it yet, but when I do, I will add Selenium 3 tutorials</p>

<h2>Installation</h2>

<p>Install Firefox and Eclipse as normal. If you intend on following these tutorials step by step, ensure you have installed <b>Eclipse Mars</b> and <b>Firefox 45</b>. Can't find them? Google.</p>
<p>Download Selenium 2.52 and add it to a directory you will remember. Either directly on your C drive or My Documents - something you will remember, because you're going to be navigating to this folder. A lot.</p>

<h2>Setting up Eclipse</h2>

<p>If you've made it this far without throwing things out the window - then well done. Also give it time, you'll be hurtling things at the wall in frustration shortly.</p>

<p>Let's get a default project set up.</p>

<p>Open Eclipse.. if you've problems here, then you'll need to install Java. That's not difficult, so off you go and do that.</p>

<p>For those of you that opened Eclipse, welcome to the piece of software that is widely used and widely loathed by many developers. I don't mind it, but I think the reason a lot of people don't like it is speed. Sometimes this thing is just slow. Real slow. You'll learn this in time.</p>

<p>Close the default welcome message, make sure you've chosen your workspace (It's not important where you put this - just don't put it somewhere you'll forget if you want to refer back to this later) and fit 'File', 'new', 'java project'. If 'java project' isn't sitting there in front of you, scroll down to the bottom of the 'new' submenu and select 'other', then 'java project' will be right there. Name it whatever you like. For the sake of this tutorial, name it 'SeleniumBasics'</p>

<p>Ta-da! You've a new java project. Consider this your test suite. Inside your test suite, we need test cases. We'll build those up in a little while. Remember when I told you to remember where you put that Selenium folder? Well, you're gonna need it. That folder is full of Jar files. Those tasty little Jar files help that automated magic happen! Let’s get them imported.</p>

<p>Right click on your project, select 'properties' and in the 'properties' screen, select 'Java Build Path'. Inside 'Java Build Path', hit 'Libraries' and 'add external Jars'. Navigate to the location of your Selenium Jars and add all in the folder and the 'libs' folder. Once you've done this, hit 'Apply' and 'OK'.</p>

<p>You, my nerdy little friend are good to go and ready to make your first test case.<p/>

<h2>Creating your first Class/Test Case</h2>

<p>For the sake of simplicity, I will be referring to classes as test cases. Let’s get this going and get you started on your default properties. This will be the same for each test case you create.</p>
<p>Right click on your project and rather than hit 'properties' like you did last time, select 'new' and 'class'. Give this badboy a name.. lets call it 'OpenBrowser' and <b>make sure you tick 'public static void main(String[] args)'</b> followed by 'OK'.</p>

<p>This Class should open and you are ready to code. Your code should look like this:</p>

```
package SeleniumBasics;

public class OpenBrowser {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}

```

<p>So where does your code go? Below it? No! I'll show you</p>


```
package SeleniumBasics;

public class OpenBrowser {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
  /////code goes here code goes here code goes here code goes here/////
    
  }

}

```

<p>Now you're setup - well done. Move on to the first exercise 'OpenBrowser' to start some automation!</p>


