package service;

import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import model.Retervie;
import repository.RetervieRepositoryInterface;

@Entity
@Service
public class ReteriveService {
   @Autowired
	DataSource datasource;
   @ManyToOne
@Autowired
   RetervieRepositoryInterface RR;
	
  @Value("${welcome.msg}")
  private String welcomemsg;
  
  public String Reterivewm() {
	  return welcomemsg;
  }
   public Iterable<Retervie> getAll() {
	   return  RR.findAll();
	 }
   public Optional<Retervie> getName(Long Id) {
	   return   RR.findById(Id);
	
   }
  
}
