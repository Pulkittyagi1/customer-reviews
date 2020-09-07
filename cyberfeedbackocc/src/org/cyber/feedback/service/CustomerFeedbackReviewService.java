/**
 *
 */
package org.cyber.feedback.service;

import java.util.Collection;

import org.cyber.feedback.model.CustomerFeedbackReviewModel;


/**
 * @author tyagipul Interface for CustomerFeedbackReview Service
 */
public interface CustomerFeedbackReviewService
{

	/**
	 * Returns reviews for current customer, if absent return NULL by design
	 *
	 * @return collection of CustomerFeedbackReviewModel
	 */
	Collection<CustomerFeedbackReviewModel> getReviewsForCurrentCustomer();
}
