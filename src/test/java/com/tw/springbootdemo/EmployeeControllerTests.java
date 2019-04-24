package com.tw.springbootdemo;

import com.tw.springbootdemo.controller.EmployeeController;
import com.tw.springbootdemo.controller.HelloWorldController;
import com.tw.springbootdemo.service.EmployeeService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeControllerTests {
    private MockMvc mvc;

    @Autowired
    private EmployeeController employeeController;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(employeeController).build();
    }

    @Test
    public void getEmployees() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/employees").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(
                        "[{\"id\":0,\"name\":\"小明\",\"age\":20,\"gender\":\"男\"}," +
                                "{\"id\":1,\"name\":\"小红\",\"age\":19,\"gender\":\"女\"}," +
                                "{\"id\":2,\"name\":\"小智\",\"age\":15,\"gender\":\"男\"}," +
                                "{\"id\":3,\"name\":\"小刚\",\"age\":16,\"gender\":\"男\"}," +
                                "{\"id\":4,\"name\":\"小霞\",\"age\":15,\"gender\":\"女\"}]"));
    }
}
