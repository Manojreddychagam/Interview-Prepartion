package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Retervie;
import service.ReteriveService;

@Entity
@RestController
@RequestMapping("Manu")

public class ReteriveController {
    @ManyToOne
	@Autowired
	ReteriveService rs;
    @RequestMapping("/welcome")
    public String Welcome() {
    	return rs.Reterivewm();
    }
    
    @RequestMapping("/man")
    public void manu() {
    	throw new RuntimeException("manoj");
    }
   @PostMapping("all")
    public List getall() {
    	ArrayList<Object> arrayList = new ArrayList<>();
    	Iterable<Retervie> all = rs.getAll();
    	for (Retervie retervie : all) {
			retervie.getName();
			retervie.getAge();
			retervie.getId();
			
			arrayList.add(retervie);
		}
		return arrayList;
    	}
    @GetMapping("{Id}")
    public Optional<Retervie> getName(@PathVariable("Id") Long Id) {
		System.out.println("given id is:"+Id);
    	return rs.getName(Id);
	} 
   
}
