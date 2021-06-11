package IndainStateCensus;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

import com.opencsv.CSVReader;

public class StateCensusAnalyser {
	 public int numberOfEntries() throws StateCSVException, IOException {
	                int count = 0;
	                try {
	                    Reader reader = Files
	                            .newBufferedReader(Paths.get("C:\\\\Users\\\\Saket Jain\\\\Downloads\\\\IndiaStateCensusData.csv"));

	                    CSVReader csvReader = new CSVReader(reader);
	                    String records[];
	                    while ((records = csvReader.readNext()) != null) {
	                        for (String record : records) {
	                            System.out.println(record);

	                        }
	                        count += 1;
	                    }
	                    csvReader.close();
	                } catch (NoSuchFileException noSuchFileException) {
	                    throw new StateCSVException(StateCSVException.StateCsvExceptionType.NO_SUCH_FILE,
	                            "!!Unable to retrieve file , no such file exist!!");

	                } catch (RuntimeException runtimeException){
	                    throw new StateCSVException(StateCSVException.StateCsvExceptionType.INCORRECT_ENTRIES,"!!File Contains Incorrect Data!!");
	                }
	                return  count;
	            }
	 
	    public int stateCodeCsvFile() throws StateCSVException, IOException {
	        int count = 0;
	        try {
	            Reader reader = Files
	                    .newBufferedReader(Paths.get("C:\\Users\\Saket Jain\\Downloads\\StateCode.csv"));

	            CSVReader csvReader = new CSVReader(reader);
	            String records[];
	            while ((records = csvReader.readNext()) != null) {
	                for (String record : records) {
	                    System.out.println(record);

	                }
	                count += 1;
	            }
	            csvReader.close();
	        } catch (NoSuchFileException noSuchFileException) {
	            throw new StateCSVException(StateCSVException.StateCsvExceptionType.NO_SUCH_FILE,
	                    "!!Unable to retrieve file , no such file exist!!");

	        } catch (RuntimeException runtimeException){
	            throw new StateCSVException(StateCSVException.StateCsvExceptionType.INCORRECT_ENTRIES,"!!File Contains Incorrect Data!!");
	        }
	        return  count;
	    }
}
