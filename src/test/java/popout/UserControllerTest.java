package popout;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.WebApplicationContext;
import popout.back.ControllerApplication;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ControllerApplication.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserControllerTest {
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    @Before
    public void setup(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void verifyAllUsersList() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/allUsers").accept(MediaType.APPLICATION_JSON))
                //.andExpect(jsonPath("$", hasSize(12))).andDo(print());
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void verifyLogin() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/login")
                .contentType(MediaType.APPLICATION_JSON)
                .content("    {\n" +
                        "        \"id\": 24,\n" +
                        "        \"username\": \"test\",\n" +
                        "        \"password\": \"test\",\n" +
                        "        \"first_name\": \"TEST\",\n" +
                        "        \"last_name\": \"TEST\",\n" +
                        "        \"favorite_type\": \"test\",\n" +
                        "        \"email\": \"test@test.com\"\n" +
                        "    }")
        .accept(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").exists())
                .andExpect(jsonPath("$.username").exists())
                //.andExpect(jsonPath("$.password").exists())
                .andExpect(jsonPath("$.first_name").exists())
                .andExpect(jsonPath("$.last_name").exists())
                .andExpect(jsonPath("$.favorite_type").exists())
                .andExpect(jsonPath("$.email").exists())
                .andDo(print());

    }

    @Test
    public void verifyProcessRegistration() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/register")
                .contentType(MediaType.APPLICATION_JSON)
                .content("    {\n" +
                        "        \"username\": \"test2\",\n" +
                        "        \"password\": \"test2\",\n" +
                        "        \"first_name\": \"TEST2\",\n" +
                        "        \"last_name\": \"TEST2\",\n" +
                        "        \"favorite_type\": \"test2\",\n" +
                        "        \"email\": \"test2@test.com\"\n" +
                        "        \"birthday\": \"11/11/1111\"\n" +
                        "        \"favorite_food\": \"test2\"\n" +
                        "        \"description\": \"test2\"\n" +
                        "    }")
                .accept(MediaType.APPLICATION_JSON))
                .andDo(print());
    }

    @Test
    public void verifyUpdateUser() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.put("/updateUser")
        .contentType(MediaType.APPLICATION_JSON)
                .content("    {\n" +
                        "        \"id\": 24,\n" +
                        "        \"username\": \"test2\",\n" +
                        "        \"password\": \"test2\",\n" +
                        "        \"first_name\": \"TEST2\",\n" +
                        "        \"last_name\": \"TEST2\",\n" +
                        "        \"favorite_type\": \"test2changed\",\n" +
                        "        \"email\": \"test2@test.com\"\n" +
                        "        \"birthday\": \"11/11/1111\"\n" +
                        "        \"favorite_food\": \"test2changed\"\n" +
                        "        \"description\": \"test2changed\"\n" +
                        "    }")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print());
    }
}
