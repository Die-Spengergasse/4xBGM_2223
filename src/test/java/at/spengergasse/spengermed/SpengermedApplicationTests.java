package at.spengergasse.spengermed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest
@AutoConfigureMockMvc
class SpengermedApplicationTests {

	@Autowired
	MockMvc mockMvc;

	// todo put your own tests here
}
