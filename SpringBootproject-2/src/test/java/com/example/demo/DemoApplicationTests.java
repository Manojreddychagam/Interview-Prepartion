package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import controller.ReteriveController;
import model.Retervie;
import service.ReteriveService;

@Entity
@RunWith(SpringRunner.class)
@SpringBootTest
@WebMvcTest(value=ReteriveController.class,secure=false)
public class DemoApplicationTests {
 @Autowired
	private MockMvc mockMvc;
	
 @ManyToOne
@MockBean
 private ReteriveService reteriveService;

 @ManyToOne
Retervie mockreterive=new Retervie((long) 1,"junit test",100);
	@Test
	
	
	public void contextLoads() throws Exception {
		
		Mockito.when(reteriveService.getAll()).thenReturn((Iterable<Retervie>) mockreterive);
		RequestBuilder requestbuilder=MockMvcRequestBuilders.get("/reterivejunit").accept(org.springframework.http.MediaType.APPLICATION_JSON);
		MvcResult result=mockMvc.perform(requestbuilder).andReturn();
		System.out.println(result.getResponse());
		String Expected="{id=1,name:junittest,age:100}";
		JSONAssert.assertEquals(Expected, result.getResponse().getContentAsString(), false);
		
	}

}
