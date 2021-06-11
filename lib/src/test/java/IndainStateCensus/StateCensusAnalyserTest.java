package IndainStateCensus;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class StateCensusAnalyserTest {

    @Test
    public void givenCSVFile_WhenNumberOfRecordMatches_ShouldReturnTrue() throws IOException, StateCSVException {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        int numberOfRecords = stateCensusAnalyser.numberOfEntries();
        Assert.assertEquals(30, numberOfRecords);
    }
    
    @Test
    public void givenCSVFile_WhenNumberOfRecordNOtMatches_ShouldReturnException() throws StateCSVException, IOException {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            int numberOfRecords = stateCensusAnalyser.numberOfEntries();
        } catch (StateCSVException e) {
            e.printStackTrace();
            Assert.assertEquals(StateCSVException.StateCsvExceptionType.NO_SUCH_FILE, e.type);
        }
    }
    
    @Test
    public void givenCSVFile_WhenCorrect_ButTypeIncorrect_ShouldReturnException()
            throws StateCSVException, IOException {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            int numberOfRecords = stateCensusAnalyser.numberOfEntries();
        } catch (StateCSVException e) {
            e.printStackTrace();
            Assert.assertEquals(StateCSVException.StateCsvExceptionType.INCORRECT_ENTRIES, e.type);
        }
    }
    
    @Test
    public void givenCSVFile_WhenCorrect_ButDelimiterIncorrect_ShouldReturnException()
            throws StateCSVException, IOException {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            int numberOfRecords = stateCensusAnalyser.numberOfEntries();
        } catch (StateCSVException e) {
            e.printStackTrace();
            Assert.assertEquals(StateCSVException.StateCsvExceptionType.DELIMETER_ISSUE, e.type);
        }
    }
    
    @Test
    public void givenCSVFile_WhenCorrect_ButCSVHeaderIncorrect_ShouldReturnException()
            throws StateCSVException, IOException {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            int numberOfRecords = stateCensusAnalyser.numberOfEntries();
        } catch (StateCSVException e) {
            e.printStackTrace();
            Assert.assertEquals(StateCSVException.StateCsvExceptionType.CSV_HEADER_INCORRECT, e.type);
        }
    }
    
    @Test
    public void givenStateCodeCSVFile_WhenNumberOfRecordMatches_ShouldReturnTrue() throws IOException, StateCSVException {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        int numberOfRecords = stateCensusAnalyser.stateCodeCsvFile();
        Assert.assertEquals(38, numberOfRecords);
    }
    
    @Test
    public void givenStateCodeCSVFile_WhenNumberOfRecordNOtMatches_ShouldReturnException() throws StateCSVException, IOException {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            int numberOfRecords = stateCensusAnalyser.stateCodeCsvFile();
        } catch (StateCSVException e) {
            e.printStackTrace();
            Assert.assertEquals(StateCSVException.StateCsvExceptionType.NO_SUCH_FILE, e.type);
        }
    }
    
    @Test
    public void givenStateCodeCSVFile_WhenCorrect_ButTypeIncorrect_ShouldReturnException()
            throws StateCSVException, IOException {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            int numberOfRecords = stateCensusAnalyser.stateCodeCsvFile();
        } catch (StateCSVException e) {
            e.printStackTrace();
            Assert.assertEquals(StateCSVException.StateCsvExceptionType.INCORRECT_ENTRIES, e.type);
        }
    }
    @Test
    public void givenStateCodeCSVFile_WhenCorrect_ButDelimiterIncorrect_ShouldReturnException()
            throws StateCSVException, IOException {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            int numberOfRecords = stateCensusAnalyser.stateCodeCsvFile();
        } catch (StateCSVException e) {
            e.printStackTrace();
            Assert.assertEquals(StateCSVException.StateCsvExceptionType.DELIMETER_ISSUE, e.type);
        }
    }
    @Test
    public void givenStateCodeCSVFile_WhenCorrect_ButCSVHeaderIncorrect_ShouldReturnException()
            throws StateCSVException, IOException {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            int numberOfRecords = stateCensusAnalyser.stateCodeCsvFile();
        } catch (StateCSVException e) {
            e.printStackTrace();
            Assert.assertEquals(StateCSVException.StateCsvExceptionType.CSV_HEADER_INCORRECT, e.type);
        }
    }
}
