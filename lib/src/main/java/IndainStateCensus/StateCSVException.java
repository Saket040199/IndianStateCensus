package IndainStateCensus;

public class StateCSVException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public enum StateCsvExceptionType {
        NO_SUCH_FILE, INCORRECT_ENTRIES, DELIMETER_ISSUE, CSV_HEADER_INCORRECT;

    }

    public StateCsvExceptionType type;

    public StateCSVException(StateCsvExceptionType type, String message) {
        this.type = type;
    }
}
