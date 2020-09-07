/**
 *
 */
package org.cyber.feedback.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.cyber.feedback.data.CustomerFeedbackReviewData;
import org.cyber.feedback.model.CustomerFeedbackReviewModel;


/**
 * @author tyagipul
 *
 */
public class CustomerFeedbackReviewPopulator implements Populator<CustomerFeedbackReviewModel, CustomerFeedbackReviewData>
{

	@Override
	public void populate(final CustomerFeedbackReviewModel source, final CustomerFeedbackReviewData target)
			throws ConversionException
	{
		target.setBody(source.getBody());
		target.setSubject(source.getSubject());

	}

}
