package com.zakstudent.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.zakstudent.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{
	public List<Etudiant> findByNom(String nom); // afficher tous les etudiants
	public Page<Etudiant> findByNom(String nom,Pageable pageable); // afficher les etudiants page par page
	@Query("select e from Etudiant e where e.nom like :x")
	public Page<Etudiant> chercherEtudiant(@Param("x") String mc,Pageable pageable); // si on veut ajouter notre propre methode, on donne le nom et les paramtres, puis on ecrit notre code sql. ":x" est le scanf. et le @Param specifie d'ou vient le param a injecter dans la commande sql
	
	@Query("select e from Etudiant e where e.date > :x and e.date < :y") // date=date naissance, on veut la liste des etudiants né entre date x et date y
	public List<Etudiant> chercherEtudiant(@Param("x") Date d1,@Param("y") Date d2);
	
	
}
