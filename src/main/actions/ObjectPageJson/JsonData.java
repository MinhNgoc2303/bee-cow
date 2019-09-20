package ObjectPageJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JsonData {

	@SerializedName("LogIn")
	@Expose
	private LogInPageJson logInPageJson;
	
	@SerializedName("CreateProduct")
	@Expose
	private CreateProductPageJson CreateProduct;

	public CreateProductPageJson getCreateProduct() {
		return CreateProduct;
	}

	public void setCreateProduct(CreateProductPageJson createProduct) {
		CreateProduct = createProduct;
	}

	public LogInPageJson getLogInPageJson() {
		return logInPageJson;
	}

	public void setLogInPageJson(LogInPageJson logInPageJson) {
		this.logInPageJson = logInPageJson;
	}

}
