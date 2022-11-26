package com.tbp.crud.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tbp.crud.entity.Purchase;
import com.tbp.crud.service.PurchaseService;

@RestController
public class PurchaseController {

	@Autowired
	private PurchaseService purchaseService;

	@PostMapping("/addPurchase")
	public Purchase addPurchase(@RequestBody Purchase purchase) {
		return purchaseService.createPurchase(purchase);
	}

	@PostMapping("/addPurchases")
	public List<Purchase> addPurchases(@RequestBody List<Purchase> purchases) {
		return purchaseService.createPurchases(purchases);
	}

	@GetMapping("/Purchase/{id}")
	public Purchase getUserById(@PathVariable int id) {
		return purchaseService.getPurchaseById(id);
	}

	@GetMapping("/Purchases")
	public List<Purchase> getAllPurchases() {
		return purchaseService.getPurchases();
	}

	/*@PostMapping("/UpdateProvider")
	public Provider updateProvider(@RequestBody Provider provider) {
		return providerService.UpdateProvider(provider);
	}*/
	
	@PutMapping (value = "/UpdatePurchase/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Purchase> updatePurchase (@PathVariable (value="id") int id,
            @RequestBody Purchase p){
        return new ResponseEntity<>(purchaseService.UpdatePurchase(id, p),HttpStatus.OK);
    }

	@DeleteMapping("/DeletePurchase/{id}")
	public String DeletePurchase(@PathVariable int id) {
		return purchaseService.deletePurchaseById(id);
	}
}
