/**
 *
 */
package org.cyber.feedback.facade;

import java.util.Collection;

import org.cyber.feedback.data.CustomerFeedbackReviewData;


/**
 * @author tyagipul: Interface to fetch CustomerFeedbackReview
 *
 */
public interface CustomerFeedbackReviewFacade
{

	/**
	 * Returns reviews of current customer, if absent returns NULL by design
	 *
	 * @return Collection of CustomerFeedbackReviewData
	 */
	Collection<CustomerFeedbackReviewData> getReviewsForCurrentCustomer();
}
