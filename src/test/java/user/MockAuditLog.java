package user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MockAuditLog implements AuditLog {
    private String expectedLogType;
    private String expectedSubType;
    private String expectedData;
    private boolean logCalled;
    private boolean enableAssertions;

    @Override
    public void log(String logType, String subType, String data) {
        if (enableAssertions) {
            assertEquals(expectedLogType, logType);
            assertEquals(expectedSubType, subType);
            assertEquals(expectedData, data);
            logCalled = true;
        }
    }

    public void verify() {
        assertTrue(logCalled);
    }

    public void expect(String logType, String subType, String data) {
        expectedLogType = logType;
        expectedSubType = subType;
        expectedData = data;
    }

    public void enable() {
        enableAssertions = true;
    }
}
