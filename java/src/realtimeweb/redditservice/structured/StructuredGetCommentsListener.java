package realtimeweb.redditservice.structured;

import java.util.ArrayList;
/**
 * A listener for the getComments method. On success, passes the data into the getCommentsCompleted method. On failure, passes the exception to the getCommentsFailed method.
 */
public interface StructuredGetCommentsListener {
	/**
	 * 
	 * @param data The method that should be overridden to handle the data if the method was successful.
	 */
	public abstract void getCommentsCompleted(ArrayList<Object> data);
	/**
	 * 
	 * @param error The method that should be overridden to handle an exception that occurred while getting the SearchResponse.
	 */
	public abstract void getCommentsFailed(Exception error);
}
