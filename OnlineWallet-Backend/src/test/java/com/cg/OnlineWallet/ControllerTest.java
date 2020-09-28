package com.cg.OnlineWallet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.cg.OnlineWallet.Service.ServiceClass;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class ControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	ServiceClass authServiceMock;
	
	@Test
	void userLogin() {	
	}
	
	
	@Test
	void register() {
		
	}
	

}
