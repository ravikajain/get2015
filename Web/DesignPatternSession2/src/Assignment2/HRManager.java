/**
 * 
 */
package Assignment2;

/**
 * @author Ravika
 *  @since 23/10/2015
 */
public class HRManager extends LeaveHandler {
	public HRManager(int day) {
		this.day = day;
	}

	/**
	 * @see Assignment2.LeaveHandler#leaveApprovalMessage()
	 */
	@Override
	protected void leaveApprovalMessage() {
		System.out.println("Leave approved by HR manager");
	}

}
