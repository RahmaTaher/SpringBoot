package com.rahma.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahma.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
