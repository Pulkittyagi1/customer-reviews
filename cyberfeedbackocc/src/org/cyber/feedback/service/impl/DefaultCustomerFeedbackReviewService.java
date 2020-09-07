/**
 *
 */
package org.cyber.feedback.service.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.user.UserService;

import java.util.Collection;

import org.cyber.feedback.model.CustomerFeedbackReviewModel;
import org.cyber.feedback.service.CustomerFeedbackReviewService;


/**
 * @author tyagipul: Default Implementation of CustomerFeedbackReviewService
 */
public class DefaultCustomerFeedbackReviewService implements CustomerFeedbackReviewService
{
	private UserService userService;

	@Override
	public Collection<CustomerFeedbackReviewModel> getReviewsForCurrentCustomer()
	{
		final UserModel user = userService.getCurrentUser();
		if (user instanceof CustomerModel)
		{
			final CustomerModel customer = (CustomerModel) user;
			return customer.getReviews();
		}

		return null;
	}

	/**
	 * @return the userService
	 */
	public UserService getUserService()
	{
		return userService;
	}

	/**
	 * @param userService
	 *           the userService to set
	 */
	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}


}
