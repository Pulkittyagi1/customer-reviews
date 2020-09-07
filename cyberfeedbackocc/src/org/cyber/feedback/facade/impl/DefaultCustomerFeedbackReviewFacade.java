/**
 *
 */
package org.cyber.feedback.facade.impl;

import de.hybris.platform.converters.Converters;
import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.Collection;

import org.apache.commons.collections.CollectionUtils;
import org.cyber.feedback.data.CustomerFeedbackReviewData;
import org.cyber.feedback.facade.CustomerFeedbackReviewFacade;
import org.cyber.feedback.model.CustomerFeedbackReviewModel;
import org.cyber.feedback.service.CustomerFeedbackReviewService;


/**
 * @author tyagipul: Default implementation of CustomerFeedbackReviewFacade
 *
 */
public class DefaultCustomerFeedbackReviewFacade implements CustomerFeedbackReviewFacade
{
	private Converter<CustomerFeedbackReviewModel, CustomerFeedbackReviewData> customerFeedbackReviewConverter;
	private CustomerFeedbackReviewService customerFeedbackReviewService;

	@Override
	public Collection<CustomerFeedbackReviewData> getReviewsForCurrentCustomer()
	{
		final Collection<CustomerFeedbackReviewModel> reviewsModel = customerFeedbackReviewService.getReviewsForCurrentCustomer();
		if (CollectionUtils.isNotEmpty(reviewsModel))
		{
			return Converters.convertAll(reviewsModel, customerFeedbackReviewConverter);
		}

		return null;


	}

	/**
	 * @return the customerFeedbackReviewConverter
	 */
	public Converter<CustomerFeedbackReviewModel, CustomerFeedbackReviewData> getCustomerFeedbackReviewConverter()
	{
		return customerFeedbackReviewConverter;
	}

	/**
	 * @param customerFeedbackReviewConverter
	 *           the customerFeedbackReviewConverter to set
	 */
	public void setCustomerFeedbackReviewConverter(
			final Converter<CustomerFeedbackReviewModel, CustomerFeedbackReviewData> customerFeedbackReviewConverter)
	{
		this.customerFeedbackReviewConverter = customerFeedbackReviewConverter;
	}

	/**
	 * @return the customerFeedbackReviewService
	 */
	public CustomerFeedbackReviewService getCustomerFeedbackReviewService()
	{
		return customerFeedbackReviewService;
	}

	/**
	 * @param customerFeedbackReviewService
	 *           the customerFeedbackReviewService to set
	 */
	public void setCustomerFeedbackReviewService(final CustomerFeedbackReviewService customerFeedbackReviewService)
	{
		this.customerFeedbackReviewService = customerFeedbackReviewService;
	}



}
