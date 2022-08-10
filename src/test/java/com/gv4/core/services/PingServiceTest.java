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
}