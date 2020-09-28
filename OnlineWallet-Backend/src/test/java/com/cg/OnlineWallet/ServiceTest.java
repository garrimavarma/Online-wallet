package com.cg.OnlineWallet;

import com.cg.OnlineWallet.Entity.WalletUser;
import com.cg.OnlineWallet.Repository.WalletUserInterface;
import com.cg.OnlineWallet.Service.ServiceClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ServiceTest {
	
	@Mock
	WalletUserInterface authRepoMock;

	ServiceClass authService;


	@BeforeEach
	void setup(){
		authService = new ServiceClass(authRepoMock);
	}

	@Test
	void testLoginWhenUserPresent() {	
		int userId = 345;
		String password = "GarimaV12";
		when(authRepoMock.userLogin(userId, password)).thenReturn(new WalletUser(345,"garima450","9182734656","GarimaV12","garVer"));	
		WalletUser result = authService.userLogin(userId, password);
		assertNotNull(result);
	} 
	
	@Test
	void testLoginWhenUserNotPresent() {	
		int userId = 345;
		String password = "Gari23";
		when(authRepoMock.userLogin(userId, password)).thenReturn(null);
		WalletUser result = authService.userLogin(userId, password);
		assertNull(result);
	}
	
	@Test
	void testLoginWhenWrongPassword() {	
		int userId = 345;
		String password = "Gari23";
		when(authRepoMock.userLogin(userId, password)).thenReturn(null);
		WalletUser result = authService.userLogin(userId, password);
		assertNull(result);
	}
	
	
	
}
