package com.tbp.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tbp.crud.dao.PurchaseRepository;
import com.tbp.crud.entity.Purchase;

@Service
public class PurchaseService {
@Autowired
private PurchaseRepository purchaseRepository;

public Purchase createPurchase(Purchase purchase){
	return purchaseRepository.save(purchase);
}

public List<Purchase> createPurchases(List<Purchase> purchases){
	return purchaseRepository.saveAll(purchases);
}

public Purchase getPurchaseById(int id){
	return purchaseRepository.findById(id).orElse(null);
}

public List<Purchase> getPurchases(){
	return purchaseRepository.findAll();
}

/*public Purchase UpdatePurchase(Purchase Purchase){
	Purchase oldPurchase=null;
	Optional<Purchase> optionalPurchase=PurchaseRepository.findById(Purchase.getId());
	if(optionalPurchase.isPresent()){
		oldPurchase=optionalPurchase.get();
		oldPurchase.setName_Purchase(Purchase.getName_Purchase());
		oldPurchase.setContract_type(Purchase.getContract_type());
		oldPurchase.setAddress(Purchase.getAddress());
		oldPurchase.setContact(Purchase.getContact());
		PurchaseRepository.save(oldPurchase);
	}else {
		return new Purchase();
	}
	return oldPurchase;
}*/

public Purchase UpdatePurchase(int id, Purchase purchase){
	if (purchaseRepository.findById(id).isPresent()){
		Purchase p=purchaseRepository.findById(id).get();
		p.setName_Purch(purchase.getName_Purch());
		p.setDate(purchase.getDate());
		p.setProvider(purchase.getProvider());
		p.setArticle(purchase.getArticle());
		p.setQuantity(purchase.getQuantity());
		return purchaseRepository.save(p);
	}else {
		return null;
	}
}

public String deletePurchaseById(int id){
	purchaseRepository.deleteById(id);
	return "Purchase got deleted";
}

}
