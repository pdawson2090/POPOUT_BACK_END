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
public class EventControllerTest {
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext wac;

    @Before
    public void setup(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void verifyAllEvents() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/allEvents")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print());
                //.andExpect(jsonPath("$", hasSize(15))).andDo(print());
    }

    @Test
    public void verifyNewEvent() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/newEvent")
        .contentType(MediaType.APPLICATION_JSON)
        .content("    {\n" +
                //"        \"id\": 40,\n" +
                "        \"event_title\": \"Study Session\",\n" +
                "        \"event_description\": \"OCA Grind\",\n" +
                "        \"event_date\": \"03/23/2018\",\n" +
                "        \"event_time\": \"6;00pm\",\n" +
                "        \"event_address\": \"11591 North Shore Drive, Reston, VA 20190\",\n" +
                "        \"event_host\": 19,\n" +
                "        \"event_type\": \"Custom\",\n" +
                "        \"latitude\": 0,\n" +
                "        \"longitude\": 0\n" +
                "    }")
        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @Test
    public void verifyGetEventById() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/event?id=1").contentType(MediaType.APPLICATION_JSON)
        .accept(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.event_title").value("WildBleach"))
                .andExpect(status().isOk())
                .andDo(print());
    }
}
