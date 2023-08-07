package com.oop.pattern.decorator;

public abstract class Decorator implements IProduct {
	protected IProduct product;
	
	public Decorator() {}
	
	public Decorator(IProduct product) {
		this.product = product;
    }

    public IProduct getProduct() {
        return product;
    }

    public void setProduct(IProduct product) {
        this.product = product;
    }
}


class TagDecor extends Decorator {
	public TagDecor(IProduct product) {
		this.product = product;
    }

	@Override
	public String setFunction(String function) {
		this.product.setFunction(this.product.getFunction() + " - " + " has Tag");
		return this.product.getFunction();
	}

	@Override
	public String getFunction() {
		return this.product.getFunction();
	}
}

class BarcodeDecor extends Decorator {
	public BarcodeDecor(IProduct product) {
		this.product = product;
    }

	@Override
	public String setFunction(String function) {
		this.product.setFunction(this.product.getFunction() + " - " + " has Barcode");
		return this.product.getFunction();
	}

	@Override
	public String getFunction() {
		return this.product.getFunction();
	}
}
