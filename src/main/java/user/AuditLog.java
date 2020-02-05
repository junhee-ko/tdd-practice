package user;

public interface AuditLog {
    void log(String logType, String subType, String data);
}
