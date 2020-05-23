package com.example.springmvc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

@SpringBootTest
@AutoConfigureMockMvc
class SpringMvcApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testBasicController() throws Exception {
		mockMvc.perform(get("/basic"))
				.andExpect(status().isOk())
				.andExpect(content().contentType("text/plain;charset=UTF-8"));
	}

	@Test
	void testControllerWithBasicView() throws Exception {
		mockMvc.perform(get("/views/welcome-view"))
				.andExpect(status().isOk())
				.andExpect(view().name("welcome"));
	}

	@Test
	void testControllerWithModelView() throws Exception {
		mockMvc.perform(get("/views/welcome-model"))
				.andExpect(status().isOk())
				.andExpect(model().attributeExists("name"))
				.andExpect(view().name("welcome-model"));
	}

}
