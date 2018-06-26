package fr.myschool.supcommerce.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fr.myschool.supcommerce.model.Product;

public class ProductDao {

	private static ArrayList<Product> myListProduct = new ArrayList<>();
	private static long count = 0;

	public static List<Product> getAllProducts() {
		return myListProduct;
	}

	public static void addProduct(Product p) {
		p.setId(count);
		count++;
		myListProduct.add(p);
	}

	public static Product findProduct(Long id) {
		for (Product p : myListProduct) {
			if (p.getId() == id) {
				return p;
			}
		}
		return null;
	}

	public static void removeProduct(Long id) {
		Iterator<Product> it = myListProduct.listIterator();

		while (it.hasNext()) {
			Product p = it.next();
			if (p.getId() == id) {
				it.remove();
				return;
			}
		}
	}
}
