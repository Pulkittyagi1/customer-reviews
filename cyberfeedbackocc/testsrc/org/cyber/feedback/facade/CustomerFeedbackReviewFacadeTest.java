/**
 *
 */
package org.cyber.feedback.facade;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.ArrayList;
import java.util.Collection;

import org.cyber.feedback.data.CustomerFeedbackReviewData;
import org.cyber.feedback.facade.impl.DefaultCustomerFeedbackReviewFacade;
import org.cyber.feedback.model.CustomerFeedbackReviewModel;
import org.cyber.feedback.service.CustomerFeedbackReviewService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;


/**
 * @author tyagipul
 *
 */
@UnitTest
@RunWith(MockitoJUnitRunner.class)
public class CustomerFeedbackReviewFacadeTest
{
	@Mock
	private Converter<CustomerFeedbackReviewModel, CustomerFeedbackReviewData> customerFeedbackReviewConverter;
	@Mock
	private CustomerFeedbackReviewService customerFeedbackReviewService;
	@InjectMocks
	private DefaultCustomerFeedbackReviewFacade defaultCustomerFeedbackReviewFacade;

	@Test
	public void testGetReviewsForCurrentCustomer()
	{
		final Collection<CustomerFeedbackReviewModel> reviews = createMockReviews();
		when(customerFeedbackReviewService.getReviewsForCurrentCustomer()).thenReturn(reviews);
		final CustomerFeedbackReviewData reviewData = mock(CustomerFeedbackReviewData.class);
		when(customerFeedbackReviewConverter.convert(Mockito.anyObject())).thenReturn(reviewData);
		Assert.assertNotNull(defaultCustomerFeedbackReviewFacade.getReviewsForCurrentCustomer());
	}

	@Test
	public void testGetReviewsForCurrentCustomerWithNoReviews()
	{
		when(customerFeedbackReviewService.getReviewsForCurrentCustomer()).thenReturn(null);
		final CustomerFeedbackReviewData reviewData = mock(CustomerFeedbackReviewData.class);
		when(customerFeedbackReviewConverter.convert(Mockito.anyObject())).thenReturn(reviewData);
		Assert.assertNull(defaultCustomerFeedbackReviewFacade.getReviewsForCurrentCustomer());
	}

	private Collection createMockReviews()
	{
		final CustomerFeedbackReviewModel review = mock(CustomerFeedbackReviewModel.class);
		final Collection<CustomerFeedbackReviewModel> reviews = new ArrayList();
		reviews.add(review);
		return reviews;
	}
}
