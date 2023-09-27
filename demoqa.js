#1.classes from a demo qa

class:
//button[@class='btn btn-primary']

class:
button#submit

xpath-image:
//div[@id='app']//img[1]
long-xpath:
//div[@id='app']/header[1]/a[1]/img[1]

css-images(are working when refresh the browser?)
div#app>header>a>img

boxes
userName
@FindBy(how = How.ID, using="userName")
private WebElement fullName;
public void enterOnFullName(String str){
	undefined(fullName,str);
//return page;
}

Box-class-path:
//input[@class=' mr-sm-2 form-control']
Box-attribute
//input[@placeholder='Full Name']

//label[text()='Full Name']/following::input

xpath:
//label[text()='Full Name']/following::input
@FindBy(how = How.XPATH, using="//label[text()='Full Name']/following::input")
private WebElement fullName;
public void enterOnFullName(String str){
	undefined(fullName,str);
//return page;
}

//input[@placeholder='Full Name']
@FindBy(how = How.XPATH, using="//input[@placeholder='Full Name']")
private WebElement fullName;
public void enterOnFullName(String str){
	undefined(fullName,str);
//return page;
}

submit-button:
@FindBy(how = How.ID, using="submit")
private WebElement submit;
public void clickOnSubmit(){
	undefined(submit);
//return page;
}

//button[text()='Submit']

button#submit

@FindBy(how = How.XPATH, using="//div[@class='col-md-9 col-sm-12']//input")
private WebElement fullName;
public void enterOnFullName(String str){
	undefined(fullName,str);
//return page;
}
