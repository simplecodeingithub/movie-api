package com.movie.api.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import com.movie.api.model.Movie;
import com.movie.api.service.MovieService;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//@ExtendWith(StringEx.class)
@WebMvcTest(MovieController.class)
class MovieControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private MovieService movieService;

    @Test
    void movieByID() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/api/v1/movie/20");
        MvcResult result = mockMvc.perform(request).andReturn();
        assertEquals("oi", result.getResponse().getContentType());

    }


    @Test
    void movieRecommendations() {
    }

    @Test
    void movieSimilar() {
    }

    @Test
    void genrelist() {
    }


    @Test
    void popularMovies() {
    }

    @Test
    void topRatedMovies() {
    }

    @Test
    void latestMovie() {
    }

    @Test
    void actorById() {
    }

    @Test
    void health() throws Exception {
        // this.mockMvc.perform(get("/api/v1/movie/health")).andDo(print()).andExpect(status().isOk())
        //       .andExpect(content().string(containsString(String.valueOf(Health.up().build()))));

        RequestBuilder request = MockMvcRequestBuilders.get("/api/v1/movie/health");
        MvcResult result = mockMvc.perform(request).andReturn();
        assertEquals("{\"status\":\"UP\"}", result.getResponse().getContentAsString());

        //mockMvc.perform(get("/actuator/health/random"))
        //      .andExpect(status().isNotFound());

        //mockMvc.perform(get("/actuator/health/random"))
        //      .andExpect(jsonPath("$.status").exists())
        //    .andExpect(jsonPath("$.details.strategy").value("thread-local"))
        //  .andExpect(jsonPath("$.details.chance").exists());
    }
}