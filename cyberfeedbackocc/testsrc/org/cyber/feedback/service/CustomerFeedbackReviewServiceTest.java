/**
 *
 */
package org.cyber.feedback.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.user.UserService;

import java.util.ArrayList;
import java.util.Collection;

import org.cyber.feedback.model.CustomerFeedbackReviewModel;
import org.cyber.feedback.service.impl.DefaultCustomerFeedbackReviewService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


/**
 * @author tyagipul
 */
@UnitTest
@RunWith(MockitoJUnitRunner.class)
public class CustomerFeedbackReviewServiceTest
{

	@Mock
	private UserService userService;

	@InjectMocks
	private DefaultCustomerFeedbackReviewService defaultCustomerFeedbackReviewService;

	@Test
	public void testGetReviewsForCurrentCustomer()
	{
		final UserModel user = createMockUser(createMockReviews());
		when(userService.getCurrentUser()).thenReturn(user);
		Assert.assertNotNull(defaultCustomerFeedbackReviewService.getReviewsForCurrentCustomer());
	}

	@Test
	public void testGetReviewsForCurrentCustomerWithNoReviews()
	{
		final UserModel user = createMockUser(null);
		when(userService.getCurrentUser()).thenReturn(user);
		Assert.assertNull(defaultCustomerFeedbackReviewService.getReviewsForCurrentCustomer());
	}

	/**
	 * @return
	 */
	private Collection createMockReviews()
	{
		final CustomerFeedbackReviewModel review = mock(CustomerFeedbackReviewModel.class);
		final Collection<CustomerFeedbackReviewModel> reviews = new ArrayList();
		reviews.add(review);
		return reviews;
	}

	/**
	 * @return
	 */
	private UserModel createMockUser(final Collection reviews)
	{
		final CustomerModel customer = mock(CustomerModel.class);
		when(customer.getReviews()).thenReturn(reviews);
		return customer;
	}
}
