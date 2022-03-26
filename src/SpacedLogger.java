public class SpacedLogger implements Logger {
    @Override
    public void StringInput(String input) {
        for (int x = 0; x < input.length(); x++) {
            System.out.print(input.charAt(x) + " ");
        }
        System.out.print("\n");
    }

    @Override
    public void RecordError(String error) {
        System.out.print("ERROR: ");
        StringInput(error);
    }
}
