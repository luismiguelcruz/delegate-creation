/**
 * All rights reserved.
 * Copyright (c) Ixxus Ltd 2016
 */
package co.ixxus.uk.delegate_creation.controllers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author Luis Miguel Cruz
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class SpringBootIntegrationTests {
    @Autowired
    private TestRestTemplate restTemplate;

    private final String P_TAG = "<p>";
    private final String END_P_TAG = "</p>";

    @Test
    public void incorrectDepartmentTest() {
        final String html = this.restTemplate.getForObject("/department?type=incorrect", String.class);
        final String title = html.substring(html.indexOf(P_TAG) + P_TAG.length(), html.indexOf(END_P_TAG));

        assertThat(title).isEqualTo("Department key not found!");
    }

    @Test
    public void otherDepartmentTest() {
        final String html = this.restTemplate.getForObject("/department?type=other", String.class);
        final String title = html.substring(html.indexOf(P_TAG) + P_TAG.length(), html.indexOf(END_P_TAG));

        assertThat(title).isEqualTo("Department Created: Other department!");
    }

    @Test
    public void recruitmentDepartmentTest() {
        final String html = this.restTemplate.getForObject("/department?type=recruitment", String.class);
        final String title = html.substring(html.indexOf(P_TAG) + P_TAG.length(), html.indexOf(END_P_TAG));

        assertThat(title).isEqualTo("Department Created: Recruitment department!");
    }

    @Test
    public void salesDepartmentTest() {
        final String html = this.restTemplate.getForObject("/department?type=sales", String.class);
        final String title = html.substring(html.indexOf(P_TAG) + P_TAG.length(), html.indexOf(END_P_TAG));

        assertThat(title).isEqualTo("Department Created: Sales department!");
    }

    @Test
    public void supportDepartmentTest() {
        final String html = this.restTemplate.getForObject("/department?type=support", String.class);
        final String title = html.substring(html.indexOf(P_TAG) + P_TAG.length(), html.indexOf(END_P_TAG));

        assertThat(title).isEqualTo("Department Created: Support department!");
    }
}