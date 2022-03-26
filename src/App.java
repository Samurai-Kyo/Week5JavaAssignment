public class App {
    public static void main(String[] args) {
        AsteriskLogger ALogger = new AsteriskLogger();
        SpacedLogger SLogger = new SpacedLogger();
        ALogger.StringInput("DOOOM");
        ALogger.RecordError("DOOOMED");
        SLogger.StringInput("DOOOM");
        SLogger.RecordError("DOOOMED");
    }
}
