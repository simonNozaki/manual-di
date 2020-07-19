package com.example.di

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Import
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.MvcResult
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

@Import(TestConfiguration::class)
@SpringBootTest
class DiApplicationTests(private val webApplicationContext: WebApplicationContext) {

	private lateinit var mockMvc: MockMvc

	@BeforeEach
	fun setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build()
	}

	@Test
	fun contextLoads() {
		val mvcResult: MvcResult = this.mockMvc.perform(
					get("http://localhost:8080/")
					.contentType(MediaType.APPLICATION_JSON)
			).andReturn()

		val resultContent: String = mvcResult.response.contentAsString

		println(resultContent)

	}

}
