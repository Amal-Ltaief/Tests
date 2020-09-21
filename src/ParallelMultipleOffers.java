import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

public class ParallelMultipleOffers {
 
    @Test
    public void runAllTests() throws IOException {
		Writer output = new BufferedWriter(new FileWriter("parallelMultipleOffers.txt", true));

        Class<?>[] classes = {TakeOfferSecondGroup.class,TakeOfferFirstGroup.class};
 
        // ParallelComputer(true,true) will run all classes and methods
        // in parallel.  (First arg for classes, second arg for methods)
        // I set true, true this means classes and methods runs in parallel.
        JUnitCore.runClasses(new ParallelComputer(true, true), classes);
        output.append("\n *************** \n");
        output.close();
    }
}
