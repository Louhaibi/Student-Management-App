package com.zakstudent.web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zakstudent.dao.EtudiantRepository;
import com.zakstudent.entities.Etudiant;

@Controller
@RequestMapping(value="/Etudiant") // tous les request mapping de ce controller start avec /Etudiant/... . expl pr l index; pour acceder il faut taper localhost:8080/Etudiant/index . si on supprime ce request mapping du controller on peut acceder a index avec: localhost:8080/index
public class EtudiantController {
	
	@Autowired
	private EtudiantRepository etudiantrepository;
	
	@RequestMapping(value="/index") // when i will go to ../index, it will return me the html file: etudiants.html (bcz we have returned it at the end so we forcefully need to create the etudiants.html) 
	public String index(Model model,
						@RequestParam(name="page", defaultValue = "0") int page,
						@RequestParam(name="motCle", defaultValue = "") String mc) {
	
		Page<Etudiant> pageEtudiants = etudiantrepository.chercherEtudiant("%"+mc+"%",PageRequest.of(page, 5));
		
		int pageCount = pageEtudiants.getTotalPages();
		int[] pages= new int[pageCount];
		for(int i=0; i<pageCount;i++ ) pages[i]=i;
		
		model.addAttribute("pages", pages);
		model.addAttribute("pageEtudiants", pageEtudiants);
		model.addAttribute("pageCourante", page);
		model.addAttribute("motCle", mc);
		return "etudiants";
	}
	
	@RequestMapping(value="/form", method=RequestMethod.GET) // when i will go to ../form , the formEtudiant.html should be displayed
	public String formEtudiant(Model model) {	
		model.addAttribute("etudiant",new Etudiant()); // on cree un etudiant ici, puis on le saisit en utilisant le formulaire
		return "formEtudiant"; // il va chercher la fichier html thats called formEtudiant
		
	}
	
	@RequestMapping(value="/saveEtudiant", method=RequestMethod.POST) // ou bien (je pense) @PostMapping("/saveEtudiant")
	public String save(@Valid Etudiant etd, BindingResult bindingResult) {	// on peut utiliser String nom,String email... pour les args pour enregistrer les données envoyé par le formulaire mais c'est pas pratique, au lieu de ça on crée directement un objet etudiant, et spring va dir=" je ai un attribut nom du forulaire, je cherche donc parmis les attributs de l'objet fournit a cette classe et il va les affecter automatiquement // s'il a un champ du formulaire qui ne correspong a aucun attribut de l'objet, il va ignorer le champ // les champs sont identifiés par leur th:field // validation du formulaire coté serveur
		if(bindingResult.hasErrors()) { // s"ila erreur dans un des champs du formulaire, il va etre stocké dans le biding result. donc on return la meme pas s'il'ya errue puis on affiche ces errues
			return "formEtudiant";      // les inputs doivent respecter les annotations de spring qu'on a forcer sur la classe Etudiants sur leurs attributs
		}
		
		etudiantrepository.save(etd);
		return "redirect:index";
		
	}

}
