package RuntimeAnalysis_BigONotation;

public class StringConcatPerformance {
    public static void main(String[] args) {
        int count = 1_000_000;
        String text = "hello";

        // String 
        long startString = System.nanoTime();
        String str = "";
        for (int i = 0; i < count; i++) {
            str += text;
        }
        long endString = System.nanoTime();
        double stringTime = (endString - startString) / 1_000_000.0;

        // StringBuilder 
        long startBuilder = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(text);
        }
        long endBuilder = System.nanoTime();
        double builderTime = (endBuilder - startBuilder) / 1_000_000.0;

        // StringBuffer 
        long startBuffer = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buffer.append(text);
        }
        long endBuffer = System.nanoTime();
        double bufferTime = (endBuffer - startBuffer) / 1_000_000.0;

        System.out.printf("String Concatenation Time: %.2f ms\n", stringTime);
        System.out.printf("StringBuilder Concatenation Time: %.2f ms\n", builderTime);
        System.out.printf("StringBuffer Concatenation Time: %.2f ms\n", bufferTime);
    }
}
