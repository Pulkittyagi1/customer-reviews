/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.cyber.feedback.controllers;

import de.hybris.platform.commerceservices.request.mapping.annotation.ApiVersion;
import de.hybris.platform.webservicescommons.mapping.DataMapper;

import javax.annotation.Resource;

import org.cyber.feedback.data.CustomerFeedbackReviewsData;
import org.cyber.feedback.facade.CustomerFeedbackReviewFacade;
import org.cyber.feedback.wsdto.CustomerFeedbackReviewsWsDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;


@Controller
@RequestMapping(value = "/{baseSiteId}/users/{userId}/Reviews")
@ApiVersion("v2")
@Api(tags = "Extended Carts")
public class CyberfeedbackoccController
{
	@Resource(name = "dataMapper")
	private DataMapper dataMapper;

	@Resource(name = "customerFeedbackReviewFacade")
	private CustomerFeedbackReviewFacade customerFeedbackReviewFacade;

	@GetMapping
	@ResponseBody
	public CustomerFeedbackReviewsWsDTO getReviews()
	{
		final CustomerFeedbackReviewsData reviewsData = new CustomerFeedbackReviewsData();
		reviewsData.setReviews(customerFeedbackReviewFacade.getReviewsForCurrentCustomer());
		return dataMapper.map(reviewsData, CustomerFeedbackReviewsWsDTO.class);

	}
}
