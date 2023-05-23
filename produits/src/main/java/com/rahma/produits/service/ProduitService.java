package com.rahma.produits.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.rahma.produits.entities.Produit;


public interface ProduitService {
	Produit saveProduit(com.rahma.produits.entities.Produit produit );
	Produit updateProduit(Produit p);
	void deleteProduit(Produit p);
	void deleteProduitById(Long id);
	Produit getProduit(Long id);
	List<Produit> getAllProduits();
	Page<Produit> getAllProduitsParPage(int page, int size);

}
