package com.javafse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class ServiceTest {

    @Test
    public void testFetchDataReturnsMockedData() {
        // 1. Arrange: Create the mock and define its behavior
        Api mockApi = mock(Api.class);
        when(mockApi.getData()).thenReturn("Successfully fetched mock data!");
        
        Service service = new Service(mockApi);
        
        // 2. Act: Call the method we want to test
        String result = service.fetchData();
        
        // 3. Assert: Verify the result and the interaction
        assertEquals("Successfully fetched mock data!", result, "The service should return the exact string provided by the mock API");
        verify(mockApi, times(1)).getData();
    }
}