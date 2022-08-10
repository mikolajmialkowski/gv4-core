package com.gv4.core.services;

import com.gv4.core.models.PingResponse;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class PingServiceTest {

    @Test
    void getPingResponse_testing_response_structure() {

        //given
        PingService pingService = new PingService();
        String message = "test321";

        //when
        PingResponse pingResponse = pingService.getPingResponse(message);

        //then
        assertThat(pingResponse, hasProperty("message"));
        assertThat(pingResponse, hasProperty("timestamp"));
        assertThat(pingResponse, hasProperty("uuid"));
    }

    @Test
    void getPingResponse_testing_response_value() {

        //given
        String testMessage = "test_";
        PingService testedService = new PingService();

        //when
        PingResponse testedOutput = testedService.getPingResponse(testMessage);

        //then
        assertThat(testedOutput.getMessage(), is(equalTo(testMessage)));
        assertThat(testedOutput.getMessage(), is(instanceOf(String.class)));
    }

    @Test
    void getPingResponse_testing_different_timestamps() {

        //given
        PingService testedService = new PingService();

        //when
        PingResponse testResponse1 = testedService.getPingResponse(null);
        PingResponse testResponse2 = testedService.getPingResponse(null);

        //then

        assertThat(testResponse1.getTimestamp(), is(not(testResponse2.getTimestamp())));
    }
}