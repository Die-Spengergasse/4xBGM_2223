package at.spengergasse.spengermed;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class SpengermedApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void testGetAllPeople() throws Exception {
		mockMvc
				.perform(get("/people/"))
				.andExpect(status().isOk())
				.andExpect(content().json("[{\"pnr\":1,\"firstName\":\"Max\",\"lastName\":\"Mustermann\"},{\"pnr\":2,\"firstName\":\"Maria\",\"lastName\":\"Musterfrau\"}]"));
	}

	@Test
	public void testGetPersonById() throws Exception {
		mockMvc
				.perform(get("/people/1"))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("{\"pnr\":1,\"firstName\":\"Max\",\"lastName\":\"Mustermann\"}")));
	}

	@Test
	public void testAddPerson() throws Exception {
		mockMvc
				.perform(get("/people/add/Max/Mustermann"))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("{\"pnr\":3,\"firstName\":\"Max\",\"lastName\":\"Mustermann\"}")));
	}

	@Test
	public void testDeletePerson() throws Exception {
		mockMvc
				.perform(get("/people/delete/1"))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("Person deleted")));
	}

	@Test
	public void testUpdatePerson() throws Exception {
		mockMvc
				.perform(get("/people/update/1/Max/Mustermann"))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("{\"pnr\":1,\"firstName\":\"Max\",\"lastName\":\"Mustermann\"}")));
	}

	@Test
	public void testGetPersonByLastName() throws Exception {
		mockMvc
				.perform(get("/people/lastname/Mustermann"))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("[{\"pnr\":1,\"firstName\":\"Max\",\"lastName\":\"Mustermann\"},{\"pnr\":3,\"firstName\":\"Max\",\"lastName\":\"Mustermann\"}]")));
	}

	@Test
	public void testGetPersonByFirstName() throws Exception {
		mockMvc
				.perform(get("/people/firstname/Maria"))
				.andExpect(status().isOk())
				.andExpect(content().string(equalTo("{\"pnr\":2,\"firstName\":\"Maria\",\"lastName\":\"Musterfrau\"}")));
	}
}
