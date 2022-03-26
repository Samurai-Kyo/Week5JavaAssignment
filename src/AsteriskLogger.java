public class AsteriskLogger implements Logger {
    @Override
    public void StringInput(String input) {
        System.out.println("***" + input + "***");
    }

    @Override
    public void RecordError(String error) {
        System.out.println("*******************");
        System.out.println("***Error:" + error + "***");
        System.out.println("*******************");
    }
}
