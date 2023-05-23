package com.rahma.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.rahma.produits.entities.Produit;
import com.rahma.produits.repos.ProduitRepository;
import com.rahma.produits.service.ProduitService;

@SpringBootTest
class ProduitssApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	
	@Autowired
	private ProduitService produitService;
	/* INSERT */
	
		@Test
		public void testCreateProduit() 
		{
			Produit prod = new Produit("PC hp Envy",4250.500,new Date());
			produitRepository.save(prod);
		}
		
	/* FIND */ 
	
		@Test
		public void testFindProduit()
		{ 
			Produit p = produitRepository.findById(1L).get(); 
			System.out.println(p);
		}
		
	/* UPDATE */
	
		@Test
		public void testUpdateProduit()
		{ 
			Produit p = produitRepository.findById(1L).get(); 
			p.setPrixProduit(2000.0);
			produitRepository.save(p);
			System.out.println(p);
		}
		
	/* DELETE */
	
	@Test
	public void testDeleteProduit()
	{ 
		produitRepository.deleteById(1L); 
		
	}
	
	
	/* FIND_ALL */
	
	@Test
	public void testFindAllProduits()
	{ 
		List<Produit> prods = produitRepository.findAll(); 
		for(Produit p:prods)
			System.out.println(p);
	}
	
	
	/*Par Page */
	@Test
	public void testFindByNomProduitContains()
	{
	Page<Produit> prods = produitService.getAllProduitsParPage(0,2);
	System.out.println(prods.getSize());
	System.out.println(prods.getTotalElements());
	System.out.println(prods.getTotalPages());
	prods.getContent().forEach(p -> {System.out.println(p.toString());
	});
	/*ou bien
	for (Produit p : prods.getContent())
	{
	System.out.println(p);
	} */
	}
	

}
