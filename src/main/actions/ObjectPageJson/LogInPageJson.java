package ObjectPageJson;

import com.google.gson.annotations.Expose;

import com.google.gson.annotations.SerializedName;

public class LogInPageJson {
	@SerializedName("actualEmpty_msg")
	@Expose
	private String actualEmpty_msg;
	
	@SerializedName("numeric")
	@Expose
	private String numeric;
	
	@SerializedName("actualNumeric_msg")
	@Expose
	private String actualNumeric_msg;
	
	@SerializedName("invalidEmail")
	@Expose
	private String invalidEmail;
	
	@SerializedName("actualInvalidEmail_msg")
	@Expose
	private String actualInvalidEmail_msg;
	
	@SerializedName("email")
	@Expose
	private String email;
	
	@SerializedName("password")
	@Expose
	private String password;
	
	@SerializedName("incorrectPassword")
	@Expose
	private String incorrectPassword;
	
	
	@SerializedName("invalidPassword")
	@Expose
	private String invalidPassword;
	
	@SerializedName("actualInvalidPassword_msg")
	@Expose
	private String actualInvalidPassword_msg;
	
	@SerializedName("actualIncorrectPassword_msg")
	@Expose
	private String actualIncorrectPassword_msg;
	
	public String getActualIncorrectPassword_msg() {
		return actualIncorrectPassword_msg;
	}

	public void setActualIncorrectPassword_msg(String actualIncorrectPassword_msg) {
		this.actualIncorrectPassword_msg = actualIncorrectPassword_msg;
	}

	@SerializedName("title")
	@Expose
	private String title;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getActualInvalidPassword_msg() {
		return actualInvalidPassword_msg;
	}

	public void setActualInvalidPassword_msg(String actualInvalidPassword_msg) {
		this.actualInvalidPassword_msg = actualInvalidPassword_msg;
	}

	public String getInvalidPassword() {
		return invalidPassword;
	}

	public void setInvalidPassword(String invalidPassword) {
		this.invalidPassword = invalidPassword;
	}

	public String getIncorrectPassword() {
		return incorrectPassword;
	}

	public void setIncorrectPassword(String incorrectPassword) {
		this.incorrectPassword = incorrectPassword;
	}

	public String getActualNumeric_msg() {
		return actualNumeric_msg;
	}

	public void setActualNumeric_msg(String actualNumeric_msg) {
		this.actualNumeric_msg = actualNumeric_msg;
	}

	public String getInvalidEmail() {
		return invalidEmail;
	}

	public void setInvalidEmail(String invalidEmail) {
		this.invalidEmail = invalidEmail;
	}

	public String getActualInvalidEmail_msg() {
		return actualInvalidEmail_msg;
	}

	public void setActualInvalidEmail_msg(String actualInvalidEmail_msg) {
		this.actualInvalidEmail_msg = actualInvalidEmail_msg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getActualEmpty_msg() {
		return actualEmpty_msg;
	}

	public void setActualEmpty_msg(String actualEmpty_msg) {
		this.actualEmpty_msg = actualEmpty_msg;
	}

	public String getNumeric() {
		return numeric;
	}

	public void setNumeric(String numeric) {
		this.numeric = numeric;
	}

}
